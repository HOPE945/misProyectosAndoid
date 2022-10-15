package com.example.myappcine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MAImagenCompleta extends AppCompatActivity {
        private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maimagen_completa);



      imageView = findViewById(R.id.imgGrande);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });


    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        int imgP = bundle.getInt("imgP");
        //recibiendo los datos
        imageView.setImageResource(imgP);
    }






}