package com.example.adrian.eva1_6_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main extends AppCompatActivity  implements ListView.OnItemClickListener{

    TextView txtVwMostrar;
    ListView listVwDatos;
    final String[] sResta = {"La calesa","Montados la Junta","Pizzas la Sierra","Pizzas Lalin","Chiwas tacos","Los corrientales","Rickys tacos","La hacienda","Buffalucas",
            "Pizzalitas","Valcor","Little Caesar","Buffalowings","Wings Army","Yaki Yang","Pizza Hut","Secound hum"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwMostrar= findViewById(R.id.txtVwMostrar);
        listVwDatos = findViewById(R.id.listVwDatos);
        //Necesitamos asignar un adaptador
        listVwDatos.setAdapter(
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sResta)


        );
        listVwDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtVwMostrar.setText(sResta[position]);
    }
}
