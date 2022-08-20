package com.example.myappgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MAImagenColores extends AppCompatActivity {
    private ImageView imgFillColor, colorFillColor;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maimagen_colores);
        imgFillColor = findViewById(R.id.imgFillColor);
        textView = findViewById(R.id.txtFillColor);
        colorFillColor = findViewById(R.id.colorFillColor);
        
        this.obtener();
    }


    private void obtener() {
        Bundle bundle = getIntent().getExtras();
        Integer imagen = bundle.getInt("imagen");
        String hexadecimal= bundle.getString("hexadecimal");
        Integer nomcolores = bundle.getInt("nomcolores");

        imgFillColor.setImageResource(imagen);
        textView.setText("El código Hexadecimal es: "+hexadecimal);
        colorFillColor.setImageResource(nomcolores);
    }



}