package com.example.josemario.tripgrip_app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class ResultadoBusquedaActivity extends Activity implements View.OnClickListener {
    Button botonNuevaBusqueda;
    Button botonCrearAnuncio;
    ListView anuncios;

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
        setContentView(R.layout.activity_resultado_busqueda);

        final ListView lista = (ListView) findViewById(R.id.listViewResultadoBusqueda);
        adapter = new ListViewAdapter(this, titulo, imagenes);
        lista.setAdapter(adapter);

        botonNuevaBusqueda = (Button) findViewById(R.id.buttonNuevaBusqueda);
        botonNuevaBusqueda.setOnClickListener(this);

        botonCrearAnuncio = (Button) findViewById(R.id.buttonCrearAnuncio);
        botonCrearAnuncio.setOnClickListener(this);

        anuncios = (ListView) findViewById(R.id.listViewResultadoBusqueda);

        anuncios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentA = new Intent(ResultadoBusquedaActivity.this, VerAnuncioActivity.class);
                startActivity(intentA);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_resultado_busqueda, menu);
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
            case R.id.buttonNuevaBusqueda:
                Intent intentA = new Intent(ResultadoBusquedaActivity.this, BusquedaAnuncioActivity.class);
                startActivity(intentA);
                break;
            case R.id.buttonCrearAnuncio:
                Intent intentB = new Intent(ResultadoBusquedaActivity.this, CrearAnuncioActivity.class);
                startActivity(intentB);
                break;
        }
    }
}
