package com.example.adrian.eva1_5_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main extends AppCompatActivity  implements RadioGroup.OnCheckedChangeListener{
//NO FUNCAAAAAAAAAAAA

    RadioGroup rdGrpOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpOpciones= findViewById(R.id.rdGrpOpciones);

    }

    @Override //RadioGroup que genera el evento
    //int i --> radio button seleccionado
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
       String sMensa;
       switch(i){
        case R.id.rdBtnTacos:
       sMensa= "Tacos";
       break;

           case R.id.rdBtnMon:
               sMensa= "Montados";
               break;
           case R.id.rdBtnTamales:
               sMensa= "Tamales";
               break;
           case R.id.rdBtnTortas:
               sMensa= "Tortas";
               break;
               default:
                   sMensa="Sin comer";
                   break;


       }
        Toast.makeText(this, ""+sMensa, Toast.LENGTH_SHORT).show();
    }
}
