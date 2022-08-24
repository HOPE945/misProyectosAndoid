package com.example.myappgridview;

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
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridViewColores);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         //recordarme que ete Array Ad
        AdapterGidColores adapterGrid = new AdapterGidColores(this, R.layout.grid_personalizado, this.imagenesColores(), this.nombreColores());
        gridView.setAdapter(adapterGrid);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                traslado(position);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "Colores pastel", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "Colores pastel", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "Colores neutros", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this, "Colores primarios", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item5:
                Toast.makeText(this, "Colores secundarios", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private ArrayList<String> nombreColores(){
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Orquidea Medio");
        colores.add("Verde Cartujano");
        colores.add("Verde Mar");
        colores.add("Cyan Oscuro");
        colores.add("Azul Añil");
        colores.add("Madera Fuerte");
        colores.add("Marrón Perú");
        colores.add("Marrón Atractivo");
        colores.add("Aguamarina");
        colores.add("Oliva");
        colores.add("Verde Primavera Medio");
        colores.add("Amarillo Verdoso");
        colores.add("Rosa Pastel");
        colores.add("Salmón Suave");
        colores.add("Gold");
        return colores;
    }

    private ArrayList<Integer> imagenesColores(){
        ArrayList<Integer> imagenes = new ArrayList<>();
        imagenes.add(R.drawable.c1);
        imagenes.add(R.drawable.c2);
        imagenes.add(R.drawable.c3);
        imagenes.add(R.drawable.c4);
        imagenes.add(R.drawable.c5);
        imagenes.add(R.drawable.c6);
        imagenes.add(R.drawable.c7);
        imagenes.add(R.drawable.c8);
        imagenes.add(R.drawable.c9);
        imagenes.add(R.drawable.c10);
        imagenes.add(R.drawable.c11);
        imagenes.add(R.drawable.c12);
        imagenes.add(R.drawable.c13);
        imagenes.add(R.drawable.c14);
        imagenes.add(R.drawable.c15);
        return imagenes;
    }

    private ArrayList<Integer> nomcolores(){
        ArrayList<Integer> color = new ArrayList<>();
        color.add(R.color.orquidea_medio);
        color.add(R.color.verde_cartujano);
        color.add(R.color.verde_mar);
        color.add(R.color.cyan_oscuro);
        color.add(R.color.azul_añil);
        color.add(R.color.madera_fuerte);
        color.add(R.color.marron_peru);
        color.add(R.color.marron_atractivo);
        color.add(R.color.agua_marina);
        color.add(R.color.oliva);
        color.add(R.color.verde_primavera_medio);
        color.add(R.color.amarillo_verdoso);
        color.add(R.color.rosa_pastel);
        color.add(R.color.salmon_suave);
        color.add(R.color.gold);
        return color;
    }
    //aqui

    private ArrayList<String> codhexadecimal(){
        ArrayList<String> hexadecimal = new ArrayList<>();
        hexadecimal.add("#BA55D3");
        hexadecimal.add("#7FFF00");
        hexadecimal.add("#2E8B57");
        hexadecimal.add("#008B8B");
        hexadecimal.add("#6495ED");
        hexadecimal.add("#DEB887");
        hexadecimal.add("#CD853F");
        hexadecimal.add("#BC8F8F");
        hexadecimal.add("#7FFFD4");
        hexadecimal.add("#808000");
        hexadecimal.add("#00FA9A");
        hexadecimal.add("#9ACD32");
        hexadecimal.add("#FFB6C1");
        hexadecimal.add("#DB7093");
        hexadecimal.add("#FFA07A");
        hexadecimal.add("#FFD700");

        return hexadecimal;
    }
    //aqui



    private void traslado(int position){
        Intent intent = new Intent(this, MAImagenColores.class);
        intent.putExtra("imagen", this.imagenesColores().get(position));
        intent.putExtra("hexadecimal", this.codhexadecimal().get(position));
        intent.putExtra("nomcolores", this.nomcolores().get(position));

        startActivity(intent);
    }


}