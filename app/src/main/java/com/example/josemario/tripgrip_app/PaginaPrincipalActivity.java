package com.example.josemario.tripgrip_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class PaginaPrincipalActivity extends Activity implements View.OnClickListener {
    Button botonBuscarAnuncio;
    Button botonCrearAnuncio;
    Button botonBuzonMensajes;
    Button botonSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        botonBuscarAnuncio = (Button) findViewById(R.id.buttonBuscarAnuncio);
        botonBuscarAnuncio.setOnClickListener(this);

        botonCrearAnuncio = (Button) findViewById(R.id.buttonCrearAnuncio);
        botonCrearAnuncio.setOnClickListener(this);

        botonBuzonMensajes = (Button) findViewById(R.id.buttonBuzonMensajes);
        botonBuzonMensajes.setOnClickListener(this);

        botonSalir = (Button) findViewById(R.id.buttonSalir);
        botonSalir.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pagina_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.cerrar_sesion) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonBuscarAnuncio:

                Intent intentBuscarAnuncio = new Intent(PaginaPrincipalActivity.this, BusquedaAnuncioActivity.class);
                startActivity(intentBuscarAnuncio);
                break;
            case R.id.buttonCrearAnuncio:
                Intent intentCrearAnuncio = new Intent(PaginaPrincipalActivity.this, CrearAnuncioActivity.class);
                startActivity(intentCrearAnuncio);
                break;
            case R.id.buttonBuzonMensajes:
                Intent intentBuzonMensaje = new Intent(PaginaPrincipalActivity.this, BuzonMensajesActivity.class);
                startActivity(intentBuzonMensaje);
                break;
            /*case R.id.buttonSalir:
                Intent intentSalir = new Intent(PaginaPrincipalActivity.this, );
                startActivity();
                break; */
        }
    }
}
