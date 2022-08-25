package com.example.myappcontactosvo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvId);
        //el set es para mostrar
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //declarando el objeto adaptador Recycler
        AdaptadorRecyclerView adaptadorRecyclerView = new AdaptadorRecyclerView(this.datosContactoVO());
        recyclerView.setAdapter(adaptadorRecyclerView);


    }
    //metodo llenado informacion
    private ArrayList<DatosContactoVO> datosContactoVO(){
        ArrayList<DatosContactoVO> datos = new ArrayList<>();
        //solicitando parametros constructor de la clase datosVO
        datos.add(new DatosContactoVO("Taylor Swift", "+(502)52342323", R.drawable.ts));
        datos.add(new DatosContactoVO("Dan Reynolds", "+(502)43235424", R.drawable.dan));
        datos.add(new DatosContactoVO("Amy Lee", "+(502)65657854", R.drawable.al));
        datos.add(new DatosContactoVO("Serj Tankian", "+(502)54112212", R.drawable.serj));
        datos.add(new DatosContactoVO("Corey Taylor", "+(502)32324343", R.drawable.corey));
        datos.add(new DatosContactoVO("Ashton Kutcher", "+(502)46478798", R.drawable.as));
        datos.add(new DatosContactoVO("Andrew Hozier", "+(502)65454565", R.drawable.ho));
        datos.add(new DatosContactoVO("Carmen Lopez", "+(502)39898765", R.drawable.desc));
        datos.add(new DatosContactoVO("Tarja Turunen", "+(502)56565434", R.drawable.tc));
        datos.add(new DatosContactoVO("Scarlett Johansson", "+(502)43562667", R.drawable.scar));
        return datos;
    }

}