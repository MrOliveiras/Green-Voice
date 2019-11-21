package com.example.greenvoice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityAnonimo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.activity_main);


        Button bt = findViewById(R.id.btEntrar);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAnonimo.this, ActivityOpcao.class);
                startActivity(intent);
            }
        });
    }
}
