package com.example.myappartemoderno;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterPersonalizadoSecundario extends BaseAdapter {
    private Context context;
    private int referenciaLista;
    private ArrayList<String> titulo =new ArrayList<>();
    private ArrayList<Integer> imgObra = new ArrayList<>();
    private ArrayList<String> prec = new ArrayList<>();
    private ArrayList<String> moneda = new ArrayList<>();
    private ArrayList<Integer> precio = new ArrayList<>();
    private ArrayList<String> descripObra = new ArrayList<>();


    //private EditText edtNombreCliente, edtApellidoCliente, edtNITCliente;
    //private TextView txtViewResultado;

    //constructor


    public AdapterPersonalizadoSecundario(Context context, int referenciaLista, ArrayList<String> titulo, ArrayList<Integer> imgObra, ArrayList<String> prec, ArrayList<String> moneda, ArrayList<Integer> precio, ArrayList<String> descripObra) {
        this.context = context;
        this.referenciaLista = referenciaLista;
        this.titulo = titulo;
        this.imgObra = imgObra;
        this.prec = prec;
        this.moneda = moneda;
        this.precio = precio;
        this.descripObra = descripObra;
    }

    @Override
    public int getCount() {
        return this.imgObra.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.lista_personalizada_secundaria, null);

        //variables que reciben por position
        String titulo = this.titulo.get(position);
        int imgObra = this.imgObra.get(position);
        String prec = this.prec.get(position);
        String moneda = this.moneda.get(position);
        int precio = this.precio.get(position);
        String descripcionObra = this.descripObra.get(position);
        //obtener elementos
        TextView textViewTitulo = v.findViewById(R.id.txtTituloObra);
        ImageView imageView = v.findViewById(R.id.imgObra);
        TextView textViewPrec = v.findViewById(R.id.txtViewPre);
        TextView textViewMoneda = v.findViewById(R.id.txtViewMonedaObra);
        TextView textViewPrecio = v.findViewById(R.id.txtViewPrecio);
        TextView textViewDescripcionObra = v.findViewById(R.id.txtViewDescripObra);
        //obteniendo el btn
        Button buttonAdquirir = v.findViewById(R.id.btnAdquirirObra);

        //asignar
        textViewTitulo.setText(String.valueOf(titulo));
        imageView.setImageResource(imgObra);
        textViewPrec.setText(String.valueOf(prec));
        textViewMoneda.setText(String.valueOf(moneda));
        textViewPrecio.setText(String.valueOf(precio));
        textViewDescripcionObra.setText(String.valueOf(descripcionObra));
        //button adquirir
        buttonAdquirir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //btn tengo que llamarlos a cada uno
                traslado2(imgObra, titulo, prec, moneda, precio);

            }
        });

        return v;
    }
    //Esto es lo que ira de aqui a la otra pantalla esto se recibe en la MAAdquirir
    private void traslado2(int imgObra, String titulo, String prec, String moneda, int precio){
     //enviando
        Intent intent = new Intent(context, MAAdquirir.class);

        intent.putExtra("imgObra", imgObra);
        intent.putExtra("titulo", titulo);
        intent.putExtra("prec", prec);
        intent.putExtra("moneda", moneda);
        intent.putExtra("precio", precio);

        context.startActivity(intent);

    }

}
