package com.cartavirtual.juanguzman.myrestaurant;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsRestaurante extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_restaurante);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap mapa) {

        mapa.getUiSettings().setZoomControlsEnabled(true);  //premitimos controlar el zoom desde el mapa
        mapa.setMapType(mapa.MAP_TYPE_NORMAL); // propiedad setMapType para cambiar el tipo de mapa

        // se crean objetos de tipo LATITUD LONGITUD
        LatLng ubicacionFloresta = new LatLng(6.256222, -75.601138); //ubicacion de la sede de la floresta
        LatLng ubicacionUPB = new LatLng(6.243253, -75.588412); // ubicacion de la sede de la UPB
        LatLng ubicacionLosMolinos = new LatLng(6.233538, -75.604654);

        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom((ubicacionFloresta),14));   //se hace zoom sobre la ubicacion que se busca
        MarkerOptions marcadorFloresta = new MarkerOptions().title("SEDE DE LA FLORESTA").position(ubicacionFloresta)   //adicionar un marcador con su titulo y ubicacion (FLoresta)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant));   // tratar de que las imagenes no superen los 48 pixeles
        mapa.addMarker(marcadorFloresta);
        MarkerOptions marcadorUPB =  new MarkerOptions().title("SEDE UPB").position(ubicacionUPB)  //creamos un segundo marcador (UPB)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant));
        mapa.addMarker(marcadorUPB);
        MarkerOptions marcadorLosMolinos =  new MarkerOptions().title("SEDE LOS MOLINOS").position(ubicacionLosMolinos)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant));
        mapa.addMarker(marcadorLosMolinos);









    }
}
