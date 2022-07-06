package com.example.myappmenmayedad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private Button btnAtras2, btnVerA;
    private EditText edtRespuesta;
    private TextView txtVmensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnAtras2 = findViewById(R.id.btnAtras2);
        btnVerA = findViewById(R.id.btnVerA);
        edtRespuesta = findViewById(R.id.edtRespuesta);
        txtVmensaje = findViewById(R.id.txtVmensaje);

        this.click();

    }

    private void click() {
        Intent atras2 = new Intent(this, MainActivity.class);
        btnAtras2.setOnClickListener(new View.OnClickListener(){
            public void onClick(){
                onClick();
            }
            public void onClick(View view){
            startActivity(atras2);
        }
        });

        btnVerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num;
                if(edtRespuesta.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity3.this, "Debes escribir una respuesta", Toast.LENGTH_SHORT).show();
                }else{
                    num = Integer.parseInt(edtRespuesta.getText().toString());
                    if(num == 8){
                        txtVmensaje.setText("¡Lo sabia, eres un genio!");
                    }else{
                        txtVmensaje.setText("¡Puedes lograrlo, recuerda que la raíz cuadrada es " +
                                "aquella que al ser multiplicada por el mismo valor, " +
                                "el resultado que se obtiene es la misma cifra numérica. ");
                    }
                }

            }
        });
    }

      //AQUI VA LA LOGICA DEL BTN VER
    public void oncClickVerA(View view) {






    }
}