package com.example.josemario.tripgrip_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BuzonMensajesActivity extends Activity implements View.OnClickListener {
    ListView conversaciones;

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
        setContentView(R.layout.activity_buzon_mensajes);

        conversaciones = (ListView) findViewById(R.id.listViewBuzon);

        adapter = new ListViewAdapter(this, titulo, imagenes);
        conversaciones.setAdapter(adapter);

        conversaciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentA = new Intent(BuzonMensajesActivity.this, ConversacionActivity.class);
                startActivity(intentA);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buzon_mensajes, menu);
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

    }
}
