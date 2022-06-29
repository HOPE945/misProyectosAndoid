package com.example.myproyectouno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Declaracion de variables que representan los elmentos
    private TextView textViewContador;
    private int contador = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //variable
        textViewContador = findViewById(R.id.txtContador);
    }

    private void mas(){
        this.contador++;
        this.textViewContador.setText(String.valueOf(contador));
    }
    private void menos(){
        this.contador--;
        this.textViewContador.setText(String.valueOf(contador));
    }
    
    private void reiniciar(){
        this.contador=0;
        this.textViewContador.setText(String.valueOf(contador));

    }


    public void onClick(View view){
        if(view.getId() ==R.id.btnMas){
            this.mas();
            Toast.makeText(this, "Sumando", Toast.LENGTH_SHORT).show();
        }
        if(view.getId() ==R.id.btnMenos){
            this.menos();
            Toast.makeText(this, "Restando", Toast.LENGTH_SHORT).show();
        }

        if(view.getId()==R.id.btnReiniciar){
            this.reiniciar();
            Toast.makeText(this, "Reiniciando a 0 ", Toast.LENGTH_SHORT).show();
        }

    }



}