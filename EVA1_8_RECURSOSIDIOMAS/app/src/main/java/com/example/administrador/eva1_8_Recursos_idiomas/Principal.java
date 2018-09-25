package com.example.administrador.eva1_8_Recursos_idiomas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity
    implements RadioGroup.OnCheckedChangeListener{
    TextView txtVIdioma, txtVNombre, txtVApellido, txtVEdad, txtVGenero;
    RadioButton rbEspañol, rbIngles, rbMasculino, rbFemenino;
    RadioGroup rGrpIdioma;
    EditText eTxtNombre, eTxtApellido, eTxtEdad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVIdioma = (TextView)findViewById(R.id.txtVIdioma);
        txtVNombre = (TextView)findViewById(R.id.txtVNombre);
        txtVApellido = (TextView)findViewById(R.id.txtVApellido);
        txtVEdad = (TextView)findViewById(R.id.txtVEdad);
        txtVGenero = (TextView)findViewById(R.id.txtVGenero);

        rbEspañol = (RadioButton) findViewById(R.id.rbEspañol);
        rbIngles = (RadioButton) findViewById(R.id.rbIngles);
        rbFemenino = (RadioButton) findViewById(R.id.rbFemenino);
        rbMasculino = (RadioButton) findViewById(R.id.rbMasculino);

        rGrpIdioma = (RadioGroup) findViewById(R.id.rGrpIdioma);

        eTxtApellido = (EditText) findViewById(R.id.eTxtApellido);
        eTxtEdad = (EditText) findViewById(R.id.eTxtEdad);
        eTxtNombre = (EditText) findViewById(R.id.eTxtNombre);


        rGrpIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if(i == R.id.rbEspañol){
            txtVIdioma.setText(R.string.idioma_sp);
            txtVNombre.setText(R.string.eti_nom_sp);
            txtVApellido.setText(R.string.eti_ape_sp);
            txtVEdad.setText(R.string.eti_edad_sp);
            txtVGenero.setText(R.string.genero_sp);

            rbEspañol.setText(R.string.espaniol_sp);
            rbIngles.setText(R.string.ingles_sp);
            rbFemenino.setText(R.string.fem_sp);
            rbMasculino.setText(R.string.mas_sp);

            eTxtApellido.setText(R.string.hint_ape_sp);
            eTxtEdad.setText(R.string.hint_edad_sp);
            eTxtNombre.setText(R.string.hint_nom_sp);

        }else{
            txtVIdioma.setText(R.string.idioma_en);
            txtVNombre.setText(R.string.eti_nom_en);
            txtVApellido.setText(R.string.eti_ape_en);
            txtVEdad.setText(R.string.eti_edad_en);
            txtVGenero.setText(R.string.genero_en);

            rbEspañol.setText(R.string.espaniol_en);
            rbIngles.setText(R.string.ingles_en);
            rbFemenino.setText(R.string.fem_en);
            rbMasculino.setText(R.string.mas_en);

            eTxtApellido.setText(R.string.hint_ape_en);
            eTxtEdad.setText(R.string.hint_edad_en);
            eTxtNombre.setText(R.string.hint_nom_en);

        }
    }
}
