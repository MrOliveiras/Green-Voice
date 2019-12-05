package com.example.greenvoice.Telas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.greenvoice.R;

public class Activity_opcao_ma extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.activity_opcao_ma);

        CardView cvDenucie = findViewById(R.id.cvDenucie);
        cvDenucie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_opcao_ma.this, AddOcorrenciaActivity.class);
                startActivity(i);
            }
        });

        /*CardView cvAvalie = findViewById(R.id.cvAvalie);
        cvAvalie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_opcao_ma.this, ListaDeOcorrenciasActivity.class);
                startActivity(i);
            }
        });

         */
        CardView cvContate = findViewById(R.id.cvContate);
        cvContate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_opcao_ma.this, ActivityContate.class);
                startActivity(i);
            }
        });

        CardView cvSobre = findViewById(R.id.cvSobre);
        cvSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_opcao_ma.this, ActivitySobre.class);
                startActivity(i);
            }
        });
    }
}
