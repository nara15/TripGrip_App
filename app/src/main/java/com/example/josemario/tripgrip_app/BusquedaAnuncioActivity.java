package com.example.josemario.tripgrip_app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class BusquedaAnuncioActivity extends Activity implements View.OnClickListener {
    Button botonBuscar;
    Button botonVolver;
    EditText ubicacion;
    EditText capacidad;
    EditText precioDesde;
    EditText precioHasta;
    Spinner tipoAlojamieto;

    //String ultimaActividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_anuncio);

        /*Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null) {
            ultimaActividad = extras.getString("ultima_actividad");
        }*/

        botonBuscar = (Button) findViewById(R.id.buttonBuscar);
        botonBuscar.setOnClickListener(this);

        botonVolver = (Button) findViewById(R.id.buttonVolver);
        botonVolver.setOnClickListener(this);

        ubicacion = (EditText) findViewById(R.id.editTextUbicacion);
        capacidad = (EditText) findViewById(R.id.editTextCapacidad);
        precioDesde = (EditText) findViewById(R.id.editTextDesde);
        precioHasta = (EditText) findViewById(R.id.editTextHasta);


        tipoAlojamieto = (Spinner) findViewById(R.id.spinnerTipoHabitacion);

        /*
        ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( this, R.array.tipo_habitacion , android.R.layout.simple_spinner_item);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoAlojamieto.setAdapter(spinner_adapter); */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            case R.id.buttonBuscar:
                Intent intentB = new Intent(BusquedaAnuncioActivity.this, ResultadoBusquedaActivity.class);
                startActivity(intentB);
            break;

            case R.id.buttonVolver:
                    Intent intentV = new Intent(BusquedaAnuncioActivity.this, PaginaPrincipalActivity.class);
                    startActivity(intentV);
            break;
        }
    }
}
