package com.cartavirtual.juanguzman.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //obtener referencia de los botones
        Button btnUbicacion = (Button) findViewById(R.id.btnVerUbicacion);
        btnUbicacion.setOnClickListener(this);

        Button btnCarta =  (Button) findViewById(R.id.btnVerCarta);
        btnCarta.setOnClickListener(this);

       /* Button btnEntrada =  (Button) findViewById(R.id.btnEntradas);
        btnEntrada.setOnClickListener(this);

        Button btnPlatoFuerte =  (Button) findViewById(R.id.btnPlatoFuerte);
        btnPlatoFuerte.setOnClickListener(this);

        Button btnPostre = (Button) findViewById(R.id.btnPostre);
        btnPlatoFuerte.setOnClickListener(this);

        Button btnBebidas =  (Button) findViewById(R.id.btnBebidas);
        btnBebidas.setOnClickListener(this);
*/
    }

    public void LanzarActivity(int idView){

        // se declara una variables de tipo INTENT
        Intent i;
        // estructura de casos para cada evento posible(button)
       switch (idView) {

            case R.id.btnVerUbicacion:
                i = new Intent(this, MapsRestaurante.class);
                startActivity(i);
                break;

           case R.id.btnVerCarta:
                i =  new Intent(this, CartaActivity.class);
                startActivity(i);
                break;
        }


    }

    @Override
    public void onClick(View view) {
            LanzarActivity(view.getId());
    }

    }






