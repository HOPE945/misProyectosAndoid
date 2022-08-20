package com.example.myappgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterGidColores extends BaseAdapter {
    private Context context;
    int referenciaGridColores;
    ArrayList<Integer> imagenes = new ArrayList<>();
    ArrayList<String> nombres = new ArrayList<>();

    public AdapterGidColores(Context context, int referenciaGridColores, ArrayList<Integer> imagenes, ArrayList<String> nombres) {
        this.context = context;
        this.referenciaGridColores = referenciaGridColores;
        this.imagenes = imagenes;
        this.nombres = nombres;
    }

    @Override
    public int getCount() {
        return this.imagenes.size();
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
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.grid_personalizado, null);
        //los valores que se van a trasladar
        int imageDato = imagenes.get(position);
        String nombreDto = nombres.get(position);
        //llamarlos
        ImageView imageView = v.findViewById(R.id.imgColorGrid);
        TextView textView = v.findViewById(R.id.nombreColorGrid);
        //uniendolos
        imageView.setImageResource(imageDato);
        textView.setText(String.valueOf(nombreDto));

        return v;
    }
}
