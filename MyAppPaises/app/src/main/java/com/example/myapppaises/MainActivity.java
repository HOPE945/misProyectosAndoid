package com.example.myapppaises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lisPaises;
    //los datos que van a llenar la lista
    ArrayList<String> paises = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lisPaises = findViewById(R.id.lisPaises);

        //el Array adapter que estoy usando es el de 3 parametros 1. contexto=this, 2. estilo , 3.
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, paises());
        lisPaises.setAdapter(arrayAdapter);

        this.clickItem();
    }

    public void clickItem(){
        lisPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                traslado(position);
            }
        });
    }

//Recordarme que el add lo que hace ees llenar un Array son mis titulos
    private ArrayList<String> paises(){
        paises.add("GUATEMALA");
        paises.add("EL SALVADOR");
        paises.add("HONDURAS");
        paises.add("BELICE");
        paises.add("BRAZIL");
        paises.add("COLOMBIA");
        paises.add("PERÚ");
        paises.add("PANAMÁ");
        paises.add("MÉXICO");
        paises.add("NICARAGUA");
        return paises;
    }
 //metodo que retorna un Array con las imagenes como dato
    private ArrayList<Integer> imagenes(){
        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.guatemala);
        img.add(R.drawable.elsalvador);
        img.add(R.drawable.honduras);
        img.add(R.drawable.belize);
        img.add(R.drawable.brazil);
        img.add(R.drawable.colombia);
        img.add(R.drawable.peru);
        img.add(R.drawable.panama);
        img.add(R.drawable.mexico);
        img.add(R.drawable.nicaragua);
        return img;
    }
//metodo que retorna la informacion que esta en string
    private ArrayList<Integer> informacion(){
        ArrayList<Integer> info = new ArrayList<>();
        info.add(R.string.iguatemala);
        info.add(R.string.ielSalvador);
        info.add(R.string.ihonduras);
        info.add(R.string.ibelize);
        info.add(R.string.ibrazil);
        info.add(R.string.icolombia);
        info.add(R.string.iperu);
        info.add(R.string.ipanama);
        info.add(R.string.imexico);
        info.add(R.string.inicaragua);
        return info;
    }

    private ArrayList<Integer> poblacion(){
        ArrayList<Integer> pob = new ArrayList<>();
        pob.add(R.string.poblaguatemala);
        pob.add(R.string.poblaelSalvador);
        pob.add(R.string.poblahonduras);
        pob.add(R.string.poblabelize);
        pob.add(R.string.poblabrazil);
        pob.add(R.string.poblacolombia);
        pob.add(R.string.poblaperu);
        pob.add(R.string.poblapanama);
        pob.add(R.string.poblamexico);
        pob.add(R.string.poblanicaragua);
        return pob;
    }

    //metodo que apertura y traslado de los datosa otra activity
    private void traslado(int position){
        Intent intent = new Intent(this, MAPaises.class);

        intent.putExtra("imagenes", imagenes().get(position));
        intent.putExtra("informacion", informacion().get(position));
        intent.putExtra("poblacion", poblacion().get(position));
        startActivity(intent);
    }

}