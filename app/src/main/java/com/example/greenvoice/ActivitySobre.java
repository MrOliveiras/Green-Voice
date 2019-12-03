package com.example.greenvoice;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySobre extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.activity_sobre);

        TextView link_repositorio = findViewById(R.id.link_repositorio);
        link_repositorio.setMovementMethod(LinkMovementMethod.getInstance());
    }
}