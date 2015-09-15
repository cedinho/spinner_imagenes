package com.example.alumno05.spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity {

    Spinner Frutas;
    Spinner Bebidas;
    Spinner Comida;

    String[] datosFrutas = {"Seleccionar Fruta...","Uva","Pera"};
    String[] datosBebidas = {"Seleccionar Bebida...","Coca-cola","Vino"};
    String[] datosComida = {"Seleccionar Comida...","Ceviche","Pescado"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Frutas = (Spinner) findViewById(R.id.Frutasspinner);
        Bebidas = (Spinner) findViewById(R.id.Bebidasspinner);
        Comida = (Spinner) findViewById(R.id.Comidaspinner);

        ArrayAdapter<String> FrutasAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,datosFrutas);
        Frutas.setAdapter(FrutasAdaptador);
        ArrayAdapter<String> BebidasAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,datosBebidas);
        Bebidas.setAdapter(BebidasAdaptador);
        ArrayAdapter<String> ComidaAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,datosComida);
        Comida.setAdapter(ComidaAdaptador);

        Frutas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                switch (position) {
                    case 0:

                        break;
                    case 1:
                        Intent uv = new Intent(SpinnerActivity.this, Uva.class);
                        startActivity(uv);
                        break;
                    case 2:
                        Intent pr = new Intent(SpinnerActivity.this, Pera.class);
                        startActivity(pr);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Bebidas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Intent cc = new Intent(SpinnerActivity.this, CocaCola.class);
                        startActivity(cc);
                        break;
                    case 2:
                        Intent vn = new Intent(SpinnerActivity.this, Vino.class);
                        startActivity(vn);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Comida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                switch (position){
                    case 0:
                        break;
                    case 1:
                        Intent cv = new Intent(SpinnerActivity.this, Ceviche.class);
                        startActivity(cv);
                        break;
                    case 2:
                        Intent ps = new Intent(SpinnerActivity.this, Pescado.class);
                        startActivity(ps);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spinner, menu);
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
}
