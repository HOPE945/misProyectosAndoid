package com.example.myappartemoderno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MATiendaArte extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matienda_arte);
        listView = findViewById(R.id.listObras1);

        obtenerDatos2();
        llenarLista();

    }
    private String obtenerDatos2(){
        Bundle bundle = getIntent().getExtras();
        String categ = bundle.getString("categorias");
        //recordarme que le puse null solo para que se quite el error
        return categ;
    }

    private void llenarLista(){
        AdapterPersonalizadoSecundario secundario;
        switch (obtenerDatos2()) {
            case "Gótico":
                secundario = new AdapterPersonalizadoSecundario(this, R.layout.lista_personalizada_secundaria, tituloGotico(), imgobraGotico(), precioGotico(), monedaGotico(), pobraGotico(), descripGotico());
                listView.setAdapter(secundario);
                break;
            case "Abstracto":
                secundario = new AdapterPersonalizadoSecundario(this, R.layout.lista_personalizada_secundaria, tituloAbstracto(), imgobraAbstracto(), precioAbs(), monedaAbs(), pobraAbstracto(), descriabstracto());
                listView.setAdapter(secundario);
                break;
            case "Barroco":
                secundario = new AdapterPersonalizadoSecundario(this, R.layout.lista_personalizada_secundaria, tituloBarroco(), imgobraBarroco(), precioBarroco(), monedaBarroco(), precioObrasBarroco(), descObrasBarroco());
                listView.setAdapter(secundario);
                break;
            case "Guatemalteco":
                secundario = new AdapterPersonalizadoSecundario(this, R.layout.lista_personalizada_secundaria, tituloGua(), imgobraGua(), precioGua(), monedaGua(), pobraGua(), descripGua());
                listView.setAdapter(secundario);
                break;


            default:

                break;
        }
    }

    private ArrayList<String> tituloGotico(){
        ArrayList<String> titulo = new ArrayList<>();
        titulo.add("Tríptico de Dresde");
        titulo.add("El Carnero Místico");
        titulo.add("Virgin");
        return titulo;
    }

    private ArrayList<Integer> imgobraGotico(){
    ArrayList<Integer> imggot = new ArrayList<>();
    imggot.add(R.drawable.gventa1);
    imggot.add(R.drawable.gventa2);
    imggot.add(R.drawable.gventa3);
        return imggot;
    }

    private ArrayList<String> precioGotico(){
        ArrayList<String> precio = new ArrayList<>();
        precio.add("Precio sin I.V.A.");
        precio.add("Precio sin I.V.A.");
        precio.add("Precio sin I.V.A.");
        return precio;
    }

    private ArrayList<String> monedaGotico(){
        ArrayList<String> quetzal = new ArrayList<>();
        quetzal.add("Q ");
        quetzal.add("Q ");
        quetzal.add("Q ");
        return quetzal;
    }

    private ArrayList<Integer> pobraGotico(){
        ArrayList<Integer> preciogot = new ArrayList<>();
        preciogot.add(12000);
        preciogot.add(14000);
        preciogot.add(13000);
        return preciogot;
    }

    private ArrayList<String> descripGotico(){
        ArrayList<String> descripgotico = new ArrayList<>();
        descripgotico.add("Autor: Van Eyck. Medidas: 1.8x1.95mts. Plasmada en oleo");
        descripgotico.add("Autor: Van Eyck. Medidas: 95x90cm. Plasmada en Oleo");
        descripgotico.add("Autor: Ghen Alterpiece. Medidas: 1.8x1.2mt. Plasmada en oleo.");
        return descripgotico;
    }

    //abs
    private ArrayList<String> tituloAbstracto(){
        ArrayList<String> tituloabs = new ArrayList<>();
        tituloabs.add("Nuevos Mundos");
        tituloabs.add("Primavera en el Decierto");
        tituloabs.add("Composición en Rojo, Amarrillo y Azul");
        return tituloabs;
    }
    private ArrayList<Integer> imgobraAbstracto(){
        ArrayList<Integer> imgabs = new ArrayList<>();
        imgabs.add(R.drawable.abs1);
        imgabs.add(R.drawable.abs2);
        imgabs.add(R.drawable.abs3);
        return imgabs;
    }


    private ArrayList<String> precioAbs(){
        ArrayList<String> precioabs = new ArrayList<>();
        precioabs.add("Precio sin I.V.A.");
        precioabs.add("Precio sin I.V.A.");
        precioabs.add("Precio sin I.V.A.");
        return precioabs;
    }

    private ArrayList<String> monedaAbs(){
        ArrayList<String> quetzalabs = new ArrayList<>();
        quetzalabs.add("Q ");
        quetzalabs.add("Q ");
        quetzalabs.add("Q ");
        return quetzalabs;
    }

    private ArrayList<Integer> pobraAbstracto(){
        ArrayList<Integer> precioabs = new ArrayList<>();
        precioabs.add(9000);
        precioabs.add(7000);
        precioabs.add(12000);
        return precioabs;
    }

    private ArrayList<String> descriabstracto(){
        ArrayList<String> descriabs = new ArrayList<>();
        descriabs.add("Autor: Milah. Medidas 1.5x1.2mts. Pintura aclílica");
        descriabs.add("Autor: Milah. Medidas 55x75cm. Pintura aclílica");
        descriabs.add("Autor: Piet Mondrian. Medidas 1.3x1.4mts. Plasmada en oleo");
        return descriabs;
    }

    //barroco
    private ArrayList<String> tituloBarroco(){
        ArrayList<String> titulobar = new ArrayList<>();
        titulobar.add(" La Virgen de la Cueva");
        titulobar.add("Aparición del Apostol san Pedro a San Pedro Nolazco");
        titulobar.add("Virgin");
        return titulobar;
    }

    private ArrayList<Integer> imgobraBarroco(){
        ArrayList<Integer> imgbarroco = new ArrayList<>();
        imgbarroco.add(R.drawable.barroco1);
        imgbarroco.add(R.drawable.barroco2);
        imgbarroco.add(R.drawable.barroco3);
        return imgbarroco;
    }

    private ArrayList<String> precioBarroco(){
        ArrayList<String> precioba = new ArrayList<>();
        precioba.add("Precio sin I.V.A.");
        precioba.add("Precio sin I.V.A.");
        precioba.add("Precio sin I.V.A.");
        return precioba;
    }

    private ArrayList<String> monedaBarroco(){
        ArrayList<String> precBarroco = new ArrayList<>();
        precBarroco.add("Q ");
        precBarroco.add("Q ");
        precBarroco.add("Q ");
        return precBarroco;
    }

    private ArrayList<Integer> precioObrasBarroco(){
        ArrayList<Integer> precioba = new ArrayList<>();
        precioba.add(19000);
        precioba.add(12200);
        precioba.add(10700);
        return precioba;
    }

    private ArrayList<String> descObrasBarroco(){
        ArrayList<String> descrbarroco = new ArrayList<>();
        descrbarroco.add("Autor: Francisco Zurbarán. Medidas: 1x1mt. Plasmada en oleo");
        descrbarroco.add("Autor: Francisco Zurbarán. Medidas: 1x1.5mt. Plasmada en oleo");
        descrbarroco.add("Autor: Francisco Zurbarán. Medidas: 95x1mt. Plasmada en oleo");
        return descrbarroco;
    }

    //guatemalteco
    private ArrayList<String> tituloGua(){
        ArrayList<String> titulogua = new ArrayList<>();
        titulogua.add("La calle de Piedra");
        titulogua.add("El vuelo del barrilete");
        titulogua.add("Arco magestuoso");
        return titulogua;
    }

    private ArrayList<Integer> imgobraGua(){
        ArrayList<Integer> imgua = new ArrayList<>();
        imgua.add(R.drawable.gua1);
        imgua.add(R.drawable.gua2);
        imgua.add(R.drawable.gua3);
        return imgua;
    }

    private ArrayList<String> precioGua(){
        ArrayList<String> preciogua = new ArrayList<>();
        preciogua.add("Precio sin I.V.A.");
        preciogua.add("Precio sin I.V.A.");
        preciogua.add("Precio sin I.V.A.");
        return preciogua;
    }

    private ArrayList<String> monedaGua(){
        ArrayList<String> quetzalgua = new ArrayList<>();
        quetzalgua.add("Q ");
        quetzalgua.add("Q ");
        quetzalgua.add("Q ");
        return quetzalgua;
    }

    private ArrayList<Integer> pobraGua(){
        ArrayList<Integer> preciogua = new ArrayList<>();
        preciogua.add(8000);
        preciogua.add(15000);
        preciogua.add(3000);
        return preciogua;
    }

    private ArrayList<String> descripGua(){
        ArrayList<String> descripggua = new ArrayList<>();
        descripggua.add("Autor: Paula Nicho. Medidas: 1x1.5 mt. Plasmada en oleo.");
        descripggua.add("Autor: Magarita Azurdia. Medidas: 95x90cm. Plasmada en oleo.");
        descripggua.add("Autor: Luis Diaz. Medidas 1.5 x 1.3 mt. Plasmada en oleo");
        return descripggua;
    }




}