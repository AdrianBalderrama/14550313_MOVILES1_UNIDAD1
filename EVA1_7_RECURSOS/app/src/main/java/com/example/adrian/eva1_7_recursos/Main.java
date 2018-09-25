package com.example.adrian.eva1_7_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main extends AppCompatActivity {

    ImageView imgVwMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgVwMostrar= findViewById(R.id.imgVwMostrar);
        imgVwMostrar.setImageResource(R.drawable.imagen);
    }
}
