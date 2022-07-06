package com.example.myappmenmayedad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button btnAtras1, btnVer;
    private EditText edtRespuesta;
    private TextView txtVmensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnAtras1 = findViewById(R.id.btnAtras1);
        btnVer = findViewById(R.id.btnVer);
        edtRespuesta = findViewById(R.id.edtRespuesta);
        txtVmensaje = findViewById(R.id.txtVmensaje);


        this.click();


    }

      //evento
    private void click() {
        //1. boton atras
        Intent atras = new Intent(this, MainActivity.class);
        btnAtras1.setOnClickListener(new View.OnClickListener() {
            public void onClick() {
                onClick();
            }
            public void onClick(View view){
                startActivity(atras);
            }
        });
        //boton ver
        btnVer.setOnClickListener(new View.OnClickListener() {
            public void onClic(){onClic();}
            @Override
            public void onClick(View v) {
                validarRespuesta();
            }
              //Validando respuesta del usuario
            public void validarRespuesta(){
                int num;
                if(edtRespuesta.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity2.this, "Debes dar una respuesta", Toast.LENGTH_SHORT).show();
                }else{
                    num = Integer.parseInt(edtRespuesta.getText().toString());
                    if(num ==10){
                        txtVmensaje.setText("¡Lo sabia, eres sorprendente, sigue así!");
                    } else{
                        //limpia el txt para poder intentarlo
                        txtVmensaje.setText("");
                        Toast.makeText(MainActivity2.this, "¡Sigue practicando, tu puedes!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}