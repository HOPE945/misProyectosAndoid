                    package com.example.myappartemoderno;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

//este es mi controlador
public class AdapterPersonalizadoprincipal extends BaseAdapter {

    //declarando variables para item personalizado de la lista
    private Context context;
    private int referenciaLista; //me permite referenciar lista
    private ArrayList<Integer> imgItem;
    private ArrayList<String> Categoria = new ArrayList<>();

    //este es mi constructor
    public AdapterPersonalizadoprincipal(Context context, int referenciaLista, ArrayList<Integer> imgItem, ArrayList<Integer> numCategoria, ArrayList<String> categoria) {
        this.context = context;
        this.referenciaLista = referenciaLista;
        this.imgItem = imgItem;
        this.Categoria = categoria;
    }

    @Override
    public int getCount() {
        return this.imgItem.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
//inflate
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //variable para retorno de tipo View le puse convertView porque no me recibio solo view
       View v = convertView;
       //perimte implementacion de un view ya diseñado
        // el cual reconoce el contexto de donde se va a mostrar esa vista en este caso vista personalizada
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.list_personalizada_principal, null);

        //recibiendo la informacion por position de los arrayList
        int datosImg = this.imgItem.get(position);
        String nombreCategoria = this.Categoria.get(position);


        //obtener propiedades
        ImageView imageView = v.findViewById(R.id.imgItem);
        TextView textViewNomCategoria = v.findViewById(R.id.txtNomCategoria);
        //btn


        //asignacion
        imageView.setImageResource(datosImg);
        textViewNomCategoria.setText(String.valueOf(nombreCategoria));

        return v;
    }
}







