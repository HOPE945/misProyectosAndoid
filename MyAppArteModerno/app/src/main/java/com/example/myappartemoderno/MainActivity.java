package com.example.myappartemoderno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listCategorias);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdapterPersonalizadoprincipal principal = new AdapterPersonalizadoprincipal(this, R.layout.list_personalizada_principal,
                imgItem(), numeroCategoria(),  categorias());

        listView.setAdapter(principal);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                traslado1(position);
            }
        });
    }
    //personalizando el menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return true;
    }
//esta es la opcion
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "Ver Inicio", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "Ver Suscripciones", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "Ver Compradas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this, "Ver Guardadasa", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item5:
                Toast.makeText(this, "Ver Nuevo Ingreso", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Integer> imgItem(){
        ArrayList<Integer> datosImg = new ArrayList<>();
        datosImg.add(R.drawable.g);
        datosImg.add(R.drawable.a);
        datosImg.add(R.drawable.b);
        datosImg.add(R.drawable.n);


        return datosImg;
    }

    private ArrayList<Integer> numeroCategoria(){
        ArrayList<Integer> numeroCategoria = new ArrayList<>();
        for(int i=1; i<=4; i++){
            numeroCategoria.add(i);
        }

        return numeroCategoria;
    }


    private ArrayList<String> categorias(){
        ArrayList<String> categorias = new ArrayList<>();
        categorias.add("Gótico");
        categorias.add("Abstracto");
        categorias.add("Barroco");
        categorias.add("Guatemalteco");
        return categorias;
    }


    private void traslado1(int position){
        Intent intent = new Intent(getApplicationContext(), MATiendaArte.class);
        intent.putExtra("categorias", categorias().get(position));
        startActivity(intent);
    }

}