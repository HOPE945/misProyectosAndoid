package com.example.myappmenmayedad;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtNombre, edtEdad;
    private Button btnValidarEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = findViewById(R.id.edtNombre);
        edtEdad = findViewById(R.id.edtEdad);
        btnValidarEdad = findViewById(R.id.btnValidar);

        crearEventoClick();

    }

    private void crearEventoClick() {
        Intent intentMenorDeEdad = new Intent(this, MainActivity2.class);
        Intent intentMayorDeEdad = new Intent(this, MainActivity3.class);
        btnValidarEdad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (this.validarFormulario()){
                    if (Integer.parseInt(edtEdad.getText().toString()) < 18){
                        this.validarFormulario();
                        startActivity(intentMenorDeEdad);
                     }else{
                        startActivity(intentMayorDeEdad);
                    }
                }
            }

            private boolean validarFormulario() {
                int edad = -1;
                String nombre = edtNombre.getText().toString();
                if(edtEdad.getText().toString().trim().isEmpty() || nombre.isEmpty()){
                    Toast.makeText(MainActivity.this, "Debe llenar todos los campos", LENGTH_SHORT).show();
                    return Boolean.FALSE;
                }else{
                    edad = Integer.parseInt(edtEdad.getText().toString());
                    if(edad < 1 || edad > 99){
                        Toast.makeText(MainActivity.this, "Debe ingresar una edad válida", LENGTH_SHORT).show();
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        });

    }
}
