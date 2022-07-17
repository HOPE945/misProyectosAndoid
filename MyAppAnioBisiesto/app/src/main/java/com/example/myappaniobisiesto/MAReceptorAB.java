package com.example.myappaniobisiesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MAReceptorAB extends AppCompatActivity {
    private TextView textViewRespuesta;
    private Button buttonRegresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mareceptor_ab);
        textViewRespuesta = findViewById(R.id.textViewRespuesta);
        buttonRegresar = findViewById(R.id.buttonRegresar);

        this.click();
        this.obtenerDatTras();
    }

    private void click() {
        //regresar
        Intent regresar = new Intent(this, MainActivity.class);
          buttonRegresar.setOnClickListener(new View.OnClickListener() {
                public void onClick() {
                    onClick();
                }
                public void onClick(View view){
                    startActivity(regresar);
                }
        });
    }

    private void obtenerDatTras(){
        //agregando objeto Bundle
        //datos trasladados por medio del intent

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            //capturando algun error del bundle
            String anio = bundle.getString("ani");

            textViewRespuesta.setText("Año "+anio);


        }
        else {
            Toast.makeText(this, "No fue posible encontrar el dato", Toast.LENGTH_SHORT).show();
        }
    }


}