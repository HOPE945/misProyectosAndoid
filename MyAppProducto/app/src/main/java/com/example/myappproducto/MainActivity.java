package com.example.myappproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtNombreP, edtValorP, edtCantidadP;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombreP = findViewById(R.id.edtNombreP);
        edtValorP = findViewById(R.id.edtValorP);
        edtCantidadP = findViewById(R.id.edtCantidadP);
        textViewResultado = findViewById(R.id.txtResultado);

    }

    private void valoriva(){
        String nombreP =this.edtNombreP.getText().toString();
        String valorP =this.edtValorP.getText().toString();
        String cantidadP =this.edtCantidadP.getText().toString();

        if(!nombreP.isEmpty()&&!valorP.isEmpty()){
            double val = Double.parseDouble(valorP) * Double.parseDouble(cantidadP);
           // double iva = (0.12/100) * (val);
            double  iva = (double) (val * (0.12));
            double total = val + iva;

            textViewResultado.setText("El valor de "+cantidadP+" "+nombreP+ " con I.V.A es de Q "+total);


        }
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnResultado:
                this.valoriva();
                break;
        }
    }
}