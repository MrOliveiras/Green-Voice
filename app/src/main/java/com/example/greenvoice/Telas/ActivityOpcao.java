package com.example.greenvoice.Telas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.example.greenvoice.R;

public class ActivityOpcao  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.activity_opcao);

        CardView cvDenucie = findViewById(R.id.cvDenucie);
        cvDenucie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityOpcao.this, AddOcorrenciaActivity.class);
                startActivity(i);
            }
        });

        CardView cvAcompanhe = findViewById(R.id.cvAcompanhe);
        cvAcompanhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityOpcao.this, ListaDeOcorrenciasActivity.class);
                startActivity(i);
            }
        });

        CardView cvAvalie = findViewById(R.id.cvAvalie);
        cvAvalie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityOpcao.this, ListaDeOcorrenciasActivity.class);
                startActivity(i);
            }
        });
        CardView cvContate = findViewById(R.id.cvContate);
        cvContate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityOpcao.this, ActivityContate.class);
                startActivity(i);
            }
        });

        CardView cvSobre = findViewById(R.id.cvSobre);
        cvSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityOpcao.this, ActivitySobre.class);
                startActivity(i);
            }
        });
<<<<<<< HEAD
<<<<<<< HEAD

        CardView cvMod = findViewById(R.id.cvMod);
        cvMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityOpcao.this, ActivityMod.class);
                startActivity(i);
            }
        });
=======
>>>>>>> 10a4d81ddd268d71c3c395eab72e3b94bfdd4abb
=======
>>>>>>> 10a4d81ddd268d71c3c395eab72e3b94bfdd4abb
    }
}