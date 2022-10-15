package com.example.myappserweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class MAInsertarSW extends AppCompatActivity {
    private TextInputEditText editTextNomProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsertar_sw);
        editTextNomProducto = findViewById(R.id.oltfNombreProducto);
        editTextNomProducto.getText().toString().isEmpty();

    }
}