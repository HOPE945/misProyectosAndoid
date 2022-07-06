package com.example.myappimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnTipov, btnTamav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTipov = findViewById(R.id.btnTipov);
        btnTamav = findViewById(R.id.btnTamav);

        this.click();

        }
    //tengo que crear un setOnClik para cada Button
        private void click(){
            btnTipov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hola, soy un vehículo de transporte de carga", Toast.LENGTH_SHORT).show();
            }

        });
            btnTamav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Hola, soy un vehículo de tamaño gigante", Toast.LENGTH_SHORT).show();
                }
            });

    }
}