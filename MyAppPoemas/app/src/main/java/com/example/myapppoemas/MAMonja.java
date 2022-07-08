package com.example.myapppoemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MAMonja extends AppCompatActivity {
    private Button btnMonjar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamonja);
        btnMonjar = findViewById(R.id.btnMonjar);
        onclickRegres();
    }

    private void onclickRegres() {
        Intent regresar = new Intent(this, MainActivity.class);
        btnMonjar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(regresar);

            }
        });
    }
}