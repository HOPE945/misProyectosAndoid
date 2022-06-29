package com.example.myappsumar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ediTextNum1, ediTextNum2;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ediTextNum1 = findViewById(R.id.edtNum1);
        ediTextNum2 = findViewById(R.id.edtNum2);
        textViewResultado = findViewById(R.id.txtResultado);

    }

    private void suma(){
        String num1 = ediTextNum1.getText().toString();
        String num2 = ediTextNum2.getText().toString();
        if(!num1.isEmpty()&&!num2.isEmpty()){
            int sumar = Integer.parseInt(num1) + Integer.parseInt(num2);
            textViewResultado.setText(String.valueOf(sumar));
        }
         else {
            Toast.makeText(this, "Datos no ingresados", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSumar:
                this.suma();
                break;
        }
    }
}