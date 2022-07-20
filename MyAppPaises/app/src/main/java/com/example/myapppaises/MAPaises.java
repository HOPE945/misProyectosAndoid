package com.example.myapppaises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MAPaises extends AppCompatActivity {
    private TextView txtPaises, txtPoblacion ;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapaises);
        txtPaises = findViewById(R.id.txtPaises);
        txtPoblacion = findViewById(R.id.txtPoblacion);
        imageView = findViewById(R.id.imgPais);


        this.obtener();
    }
    //metodo de obtener

    private void obtener(){
        Bundle bundle = getIntent().getExtras();

        int imagen = bundle.getInt("imagenes");
        int info = bundle.getInt("informacion");
        int pob = bundle.getInt("poblacion");

        imageView.setImageResource(imagen);
        txtPaises.setText(info);
        txtPoblacion.setText(pob);
    }

}