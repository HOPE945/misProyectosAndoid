package com.example.myapppoemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnBandera, btnMonja, btnQuetzal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBandera = findViewById(R.id.btnBandera);
        btnMonja = findViewById(R.id.btnMonja);
        btnQuetzal = findViewById(R.id.btnQuetzal);

        creandoEventoClick();

    }

    private void creandoEventoClick() {
        Intent intentBandera = new Intent(this, MAPoemaBandera.class);
        Intent intentMonja = new Intent(this, MAMonja.class);
        Intent intentQuetzal = new Intent(this, MAQuetzal.class);
        btnBandera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentBandera);
            }

        });

        btnMonja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentMonja);
            }
        });

        btnQuetzal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentQuetzal);
            }
        });


    }


}