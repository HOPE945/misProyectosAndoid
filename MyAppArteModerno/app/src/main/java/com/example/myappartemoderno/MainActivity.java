package com.example.myappartemoderno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listCategorias);

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