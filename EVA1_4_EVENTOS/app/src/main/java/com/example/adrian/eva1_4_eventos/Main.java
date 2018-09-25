package com.example.adrian.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class Main extends AppCompatActivity /*Creamos UN OBJETO QUE ESCUCHE EVENTOS*/implements View.OnClickListener {

    TextView txtVwMensa; //Este objeto se vincula al widget
    Button btnInterfaz;
    Button btnClaseAnonima;
    Button btnPorClase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwMensa = findViewById(R.id.txtVwMensa);  //Ya no se us ala invocacion TextView entre parentesis
        btnInterfaz= findViewById(R.id.btnInterfaz);
        btnInterfaz.setOnClickListener(this); //Asigna
        txtVwMensa.setText("Hola Mundo!");
        btnClaseAnonima= findViewById(R.id.btnAnonima);
        btnPorClase= findViewById(R.id.btnPorClase);


        //Por Anonima
       final Context cntApp = getApplicationContext();

        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeText(Main.this,"Evento por clase anonima", Toast.LENGTH_LONG).show();
            }

        });



        //POR CLASE
        ClickListener miClickLis = new ClickListener();
        btnPorClase.setOnClickListener(this);
    }



    public void Miclick(View v){
        makeText(this,"Hola Mundo!", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        makeText(this,"Hola Mundo 2!", Toast.LENGTH_LONG).show();
    }
}
