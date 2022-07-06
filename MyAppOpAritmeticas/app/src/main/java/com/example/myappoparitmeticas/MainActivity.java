package com.example.myappoparitmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtPrimerN, edtSegundoN;
    private TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPrimerN = findViewById(R.id.edtPrimerN);
        edtSegundoN = findViewById(R.id.edtSegundoN);
        txtResultado = findViewById(R.id.txtResultado);
    }
    private void sumar(){
        String priN = edtPrimerN.getText().toString();
        String segN = edtSegundoN.getText().toString();
        if(!priN.isEmpty()&&!segN.isEmpty()){
            int suma = Integer.parseInt(priN) + Integer.parseInt(segN);
            txtResultado.setText(String.valueOf(suma));
        }
        else {
            Toast.makeText(this, "Debe llenar los campos", Toast.LENGTH_SHORT).show();
        }

    }

    private void restar(){

    }

    private void multiplicar(){

    }

    private void dividir(){

    }

    private void numayor(){

    }


    public void onClick(View view) {

    }
}