package com.example.administrador.eva_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity
        implements View.OnClickListener {
    Context cntContexto;
Button btnClickList, btnClickAnonima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cntContexto = getApplicationContext();
        btnClickList=(Button)findViewById(R.id.btnClickList);
        btnClickAnonima=(Button)findViewById(R.id.btnClickAnonima);
        //RESPONDER A UN EVENTO NECESITAMOS UN LISTENER
        btnClickList.setOnClickListener(this);//ASIGNAMOS EL LISTENER
        btnClickList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cntContexto, "hola", Toast.LENGTH_SHORT).show();
            }
        });//ASIGNAMOS EL LISTENER


    }
    public void btnmsg(View V){
        Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show();
    }
}
