package com.example.greenvoice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.activity_main);


        Button bt = findViewById(R.id.btEntrar);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, ListaDeOcorrenciasActivity.class);
                 startActivity(intent);
            }
        });

        TextView tx = findViewById(R.id.TxCadastrar);
        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AddUserActivity.class);
                startActivity(i);
            }
        });

        Button btAnonimo = findViewById(R.id.btAnonimo);
        btAnonimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaDeOcorrenciasActivity.class);
                startActivity(intent);
            }
        });
    }
}
