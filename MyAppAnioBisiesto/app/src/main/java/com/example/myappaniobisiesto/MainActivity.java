package com.example.myappaniobisiesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextAnio;
    private Button buttonTD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAnio = findViewById(R.id.editTextAnio);
        buttonTD = findViewById(R.id.buttonTD);
        this.click();


    }

    private void click() {
        buttonTD.setOnClickListener(new View.OnClickListener() {
            public void onClick(){onClick();}
            @Override
            public void onClick(View v) {


                datosATrasladar();
            }
        });
    }

    private void datosATrasladar(){
        String anio = editTextAnio.getText().toString();
        if(!anio.trim().isEmpty() && Integer.parseInt(anio)!=0) {

            //e
            int datoanio = Integer.parseInt(editTextAnio.getText().toString());
            if(datoanio % 4 == 0 && (datoanio % 100 != 0 || datoanio % 400 == 0)){
                Toast.makeText(this, "Sí es año bisiesto", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "No es año bisiesto", Toast.LENGTH_SHORT).show();

            }
            //t

            Intent intent = new Intent(this, MAReceptorAB.class);

            intent.putExtra("ani", anio);
            startActivity(intent);
        }
        else {

            Toast.makeText(this, "Debe ingresar un año válido ", Toast.LENGTH_SHORT).show();
        }
    }
}