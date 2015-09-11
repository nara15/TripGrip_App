package com.example.josemario.tripgrip_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MisAnunciosActivity extends Activity implements View.OnClickListener {
    Button botonVolver;
    Button botonCrearAnuncio;

    ListView misAnuncios;

    ListViewAdapter adapter;

    String[] titulo = new String[]{
            "titulo1",
            "titulo2",
            "titulo3",
            "titulo4",
            "titulo4",
            "titulo4",
            "titulo4",
            "titulo4",
            "titulo4",
            "titulo4",
            "titulo4",
            "titulo4",
    };

    int[] imagenes = {
            R.drawable.apartamento_icon,
            R.drawable.casa_icon,
            R.drawable.habitacion_icon,
            R.drawable.habitacion_icon,
            R.drawable.habitacion_icon,
            R.drawable.habitacion_icon,
            R.drawable.habitacion_icon,
            R.drawable.habitacion_icon,
            R.drawable.habitacion_icon,
            R.drawable.habitacion_icon,
            R.drawable.habitacion_icon,
            R.drawable.habitacion_icon,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_anuncios);

        misAnuncios = (ListView) findViewById(R.id.listViewMisAnuncios);
        adapter = new ListViewAdapter(this, titulo, imagenes);
        misAnuncios.setAdapter(adapter);

        botonCrearAnuncio = (Button) findViewById(R.id.buttonCrearAnuncio);
        botonCrearAnuncio.setOnClickListener(this);

        botonVolver = (Button) findViewById(R.id.buttonVolver);
        botonVolver.setOnClickListener(this);

        misAnuncios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentA = new Intent(MisAnunciosActivity.this, VerMiAnuncioActivity.class);
                startActivity(intentA);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mis_anuncios, menu);
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
                Intent intentB = new Intent(MisAnunciosActivity.this, CrearAnuncioActivity.class);
                startActivity(intentB);
                break;
            case R.id.buttonVolver:

                break;
        }
    }
}
