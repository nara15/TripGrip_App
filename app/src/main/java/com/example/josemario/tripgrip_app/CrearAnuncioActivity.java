package com.example.josemario.tripgrip_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearAnuncioActivity extends Activity implements View.OnClickListener{
    Button botonCrearAnuncio;
    Button botonVolver;
    Button botonBuscar;

    Spinner tipoInmueble;
    Spinner tipoHabitacion;

    EditText ubicacion;
    EditText capacidad;
    EditText precio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_anuncio);

        botonCrearAnuncio = (Button) findViewById(R.id.buttonCrearAnuncio);
        botonCrearAnuncio.setOnClickListener(this);

        botonVolver = (Button) findViewById(R.id.buttonVolver);
        botonVolver.setOnClickListener(this);

        botonCrearAnuncio = (Button) findViewById(R.id.buttonUbicacion);
        botonCrearAnuncio.setOnClickListener(this);

        ubicacion = (EditText) findViewById(R.id.editTextUbicacion);
        capacidad = (EditText) findViewById(R.id.editTextCapacidad);
        precio = (EditText) findViewById(R.id.editTextPrecio);

        tipoInmueble = (Spinner) findViewById(R.id.spinnerTipoALojamiento);
        tipoHabitacion = (Spinner) findViewById(R.id.spinnerTipoHabitacion);

        ArrayAdapter spinner_adapter_1 = ArrayAdapter.createFromResource( this, R.array.tipo_inmuelbe , android.R.layout.simple_spinner_item);
        spinner_adapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoInmueble.setAdapter(spinner_adapter_1);

        ArrayAdapter spinner_adapter_2 = ArrayAdapter.createFromResource( this, R.array.tipo_habitacion , android.R.layout.simple_spinner_item);
        spinner_adapter_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoHabitacion.setAdapter(spinner_adapter_2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_crear_anuncio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonCrearAnuncio:
                Intent intentA = new Intent(CrearAnuncioActivity.this, VerMiAnuncioActivity.class);
                startActivity(intentA);
                break;
            case R.id.buttonVolver:
                Intent intentB = new Intent(CrearAnuncioActivity.this, PaginaPrincipalActivity.class);
                startActivity(intentB);
                break;
            case R.id.buttonUbicacion:
                Toast toast = Toast.makeText(getApplicationContext(), "Funcionalidad no implementada",
                                             Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }
}
