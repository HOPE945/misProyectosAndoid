package com.example.myappartemoderno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MAFinalizarCompra extends AppCompatActivity {
    TextView txtReceptorNombPinturaComprar, txtReceptorNombCompradorComprar,
            txtReceptorApellidoCompradorComprar, txtReceptorNITCompradorComprar,
            txtReceptorMoneda, txtReceptorTotalAPagarConImpuesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafinalizar_compra);
        //las variables fieron nombradas de la misma forma para no perderme
        txtReceptorNombPinturaComprar = findViewById(R.id.txtReceptorNombPinturaComprar);
        txtReceptorNombCompradorComprar = findViewById(R.id.txtReceptorNombCompradorComprar);
        txtReceptorApellidoCompradorComprar = findViewById(R.id.txtReceptorApellidoCompradorComprar);
        txtReceptorNITCompradorComprar = findViewById(R.id.txtReceptorNITCompradorComprar);
        txtReceptorTotalAPagarConImpuesto = findViewById(R.id.txtReceptorTotalAPagarConImpuesto); //sino me funciona solo escribo la q
        txtReceptorMoneda = findViewById(R.id.txtReceptorMoneda);
        //btn
        Button buttonFinalizar = findViewById(R.id.btnFinalizarYRegresar);


        buttonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalizar();
            }
        });

        obtenerDatosCompr();

    }
    //obteniedo los datos de los editext
    private void obtenerDatosCompr(){
        Bundle bundle = getIntent().getExtras();
        String titulo = bundle.getString("titulo");
        String moneda = bundle.getString("moneda");
        String precio = bundle.getString("precio");
        String nomb = bundle.getString("nomb");
        String ape = bundle.getString("ape");
        String nume = bundle.getString("nume");
        String total = new DecimalFormat("#,###,##0.00").format(bundle.getDouble("total"));

        //seteando datos
        txtReceptorNombPinturaComprar.setText(titulo);
        txtReceptorMoneda.setText(moneda);
        txtReceptorNombCompradorComprar.setText(nomb);
        txtReceptorApellidoCompradorComprar.setText(ape);
        txtReceptorNITCompradorComprar.setText(nume);
        txtReceptorTotalAPagarConImpuesto.setText(total);






    }

    private void finalizar(){
        Intent finCompra = new Intent(this, MainActivity.class);
        startActivity(finCompra);
    }






}