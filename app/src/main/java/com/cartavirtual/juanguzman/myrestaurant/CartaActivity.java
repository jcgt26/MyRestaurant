package com.cartavirtual.juanguzman.myrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CartaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta);

        Button btnEntrada =  (Button) findViewById(R.id.btnEntradas);
        btnEntrada.setOnClickListener(this);

        Button btnPlatoFuerte =  (Button) findViewById(R.id.btnPlatoFuerte);
        btnPlatoFuerte.setOnClickListener(this);

        Button btnPostre = (Button) findViewById(R.id.btnPostre);
        btnPlatoFuerte.setOnClickListener(this);

        Button btnBebidas =  (Button) findViewById(R.id.btnBebidas);
        btnBebidas.setOnClickListener(this);
    }


    public void LanzarActivity(int idView){
        Intent i;

        switch(idView){
            case R.id.btnEntradas:
                i = new Intent(this, EntradasRestaurante.class );
                startActivity(i);
                break;

            case R.id.btnPlatoFuerte:
                i =  new Intent(this, PlatoFuerte.class);
                startActivity(i);
                break;

            case R.id.btnPostre:
                i = new Intent(this, Postres.class);
                startActivity(i);
                break;

            case R.id.btnBebidas:
                i = new Intent(this, Bebidas.class);
                startActivity(i);
                break;

        }

    }



    @Override
    public void onClick(View v) {

        LanzarActivity(v.getId());

    }
}
