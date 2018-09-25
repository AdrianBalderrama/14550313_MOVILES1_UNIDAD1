package com.example.adrian.eva1_11_otra_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;



public class Main extends AppCompatActivity implements ListView.OnItemClickListener
{

    TextView txtVwExtracto;
    ListView listVwTitu;

    final String[] sObras={

            "El quijote",
            "Hamlet",
            "Kyballion",
            "El conde de montecristo",
            "Los miserables",
            "El hobbit",
            "Los 3 mosqueteros",
            "La divina comedia",
            "Los juegos del hambre"
    };
    final String[] sResenas={
                "El quijote:Lorem ipsum dolor sit amet consectetur adipiscing elit feugiat metus" +
                        " tellus pellentesque natoque primis, quisque a vivamus suspendisse urna porta tempus montes taciti potenti lobortis." +
                        " Suspendisse conubia nostra laoreet tortor volutpat, lacus congue leo velit fames, nulla sagittis nascetur phasellus.",
                "Hamlet:Lorem ipsum dolor sit amet consectetur adipiscing elit feugiat metus tellus pellentesque natoque primis, quisque a vivamus" +
                        " suspendisse urna porta tempus montes taciti potenti lobortis. Suspendisse conubia nostra laoreet tortor volutpat," +
                        " lacus congue leo velit fames, nulla sagittis nascetur phasellus.",
                "Kyballion:Lorem ipsum dolor sit amet consectetur adipiscing elit feugiat metus tellus pellentesque natoque primis," +
                        " quisque a vivamus suspendisse urna porta tempus montes taciti potenti lobortis. " +
                        "Suspendisse conubia nostra laoreet tortor volutpat, lacus congue leo velit fames, nulla sagittis nascetur phasellus.",
                "El conde de montecristo:Lorem ipsum dolor sit amet consectetur adipiscing elit feugiat metus tellus pellentesque natoque primis, " +
                        "quisque a vivamus suspendisse urna porta tempus montes taciti potenti lobortis. " +
                        "Suspendisse conubia nostra laoreet tortor volutpat, lacus congue leo velit fames, nulla sagittis nascetur phasellus.",
                "Los miserables:Lorem ipsum dolor sit amet consectetur adipiscing elit feugiat metus tellus pellentesque natoque primis, " +
                        "quisque a vivamus suspendisse urna porta tempus montes taciti potenti lobortis. " +
                        "Suspendisse conubia nostra laoreet tortor volutpat, lacus congue leo velit fames, nulla sagittis nascetur phasellus. ",
                "El hobbit: Lorem ipsum dolor sit amet consectetur adipiscing elit feugiat metus tellus pellentesque natoque primis," +
                        " quisque a vivamus suspendisse urna porta tempus montes taciti potenti lobortis. Suspendisse conubia nostra laoreet tortor volutpat," +
                        " lacus congue leo velit fames, nulla sagittis nascetur phasellus. ",
                "Los 3 mosqueteros: Lorem ipsum dolor sit amet consectetur adipiscing elit feugiat metus tellus pellentesque natoque primis, " +
                        "quisque a vivamus suspendisse urna porta tempus montes taciti potenti lobortis." +
                        " Suspendisse conubia nostra laoreet tortor volutpat, lacus congue leo velit fames, nulla sagittis nascetur phasellus.",
                "La divina comedia: Lorem ipsum dolor sit amet consectetur adipiscing elit feugiat metus tellus pellentesque natoque primis," +
                        " quisque a vivamus suspendisse urna porta tempus montes taciti potenti lobortis. " +
                        "Suspendisse conubia nostra laoreet tortor volutpat, lacus congue leo velit fames, nulla sagittis nascetur phasellus.",
                "Los juegos del hambre: Lorem ipsum dolor sit amet consectetur adipiscing elit feugiat metus tellus pellentesque natoque primis, " +
                        "quisque a vivamus suspendisse urna porta tempus montes taciti potenti lobortis. Suspendisse conubia nostra laoreet tortor volutpat," +
                        " lacus congue leo velit fames, nulla sagittis nascetur phasellus."
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listVwTitu= findViewById(R.id.listVwTitu);
        txtVwExtracto= findViewById(R.id.txtVwExtracto);
        listVwTitu.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sObras));
        listVwTitu.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtVwExtracto.setText(sResenas[position]);
    }
}
