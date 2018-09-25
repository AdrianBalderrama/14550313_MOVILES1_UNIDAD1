package com.example.usuario.practica_2_expectativa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
EditText eTxtNacimiento;
RadioGroup rGrpGenero, rGrpRegiones;
TextView txtVDeceso, txtVExpectativa;
int Region, America, Asia, Africa, Dif;
RadioButton rbRegion, rbAmerica, rbAsia, rbAfrica;
    int AnioNacimiento = 0;

    int uno, dos, expectativa ,genero, reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        eTxtNacimiento=(EditText)findViewById(R.id.eTxtNacimiento);
        txtVDeceso=(TextView)findViewById(R.id.txtVDeceso);
        rGrpGenero=(RadioGroup)findViewById(R.id.rGrpGenero);
        rGrpRegiones=(RadioGroup)findViewById(R.id.rGrpRegiones);
        txtVExpectativa=(TextView)findViewById(R.id.txtVExpectativa);
        rbRegion=(RadioButton)findViewById(R.id.rbRegion);
        rbAmerica=(RadioButton)findViewById(R.id.rbAmerica);
        rbAsia=(RadioButton)findViewById(R.id.rbAsia);
        rbAfrica=(RadioButton)findViewById(R.id.rbAfrica);

        eTxtNacimiento.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                //uno = eTxtNacimiento.getText().toString();

            }
    String uno;

            @Override
            public void afterTextChanged(Editable editable) {

                try
                {
                    AnioNacimiento = Integer.parseInt(eTxtNacimiento.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    // xd
                }

                if (AnioNacimiento >= 1950){

                    //txtVExpectativa.setText("R: "+AnioNacimiento);
                    decada();
                    regiones();
                    expectativa();

                }else {
                    //txtVExpectativa.setText("NOOOOOO ");
                };
            }
        });

        rGrpRegiones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rbRegion:
                        //txtVExpectativa.setText("region"+Region);
                        reg = Region;
                        break;

                    case R.id.rbAmerica:
                        //txtVExpectativa.setText("america"+America);
                        reg = America;
                        break;
                    case R.id.rbAsia:
                        //txtVExpectativa.setText("asia"+Asia);
                        reg = Asia;
                        break;
                    case R.id.rbAfrica:
                        //txtVExpectativa.setText("africa"+Africa);
                        reg = Africa;
                        break;
                }
                expectativa();
            }

        });


        rGrpGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbHombre){
                    //txtVDeceso.setText("Hombre");
                    genero = 1;
                }else{
                    //txtVDeceso.setText("Mujer");
                    genero = 2;
                };
                regiones();
                expectativa();
            }
        });



    }

    public void decada (){
        if (AnioNacimiento >= 1950 && AnioNacimiento <= 1959){
            Region = 75;
            America = 60;
            Asia = 45;
            Africa = 35;
            Dif = 10;
        }

        if (AnioNacimiento >= 1960 && AnioNacimiento <= 1969){
            Region = 75;
            America = 65;
            Asia = 50;
            Africa = 45;
            Dif = 9;
        }

        if (AnioNacimiento >= 1970 && AnioNacimiento <= 1979){
            Region = 80;
            America = 70;
            Asia = 65;
            Africa = 55;
            Dif = 8;
        }

        if (AnioNacimiento >= 1980 && AnioNacimiento <= 1989){
            Region = 80;
            America = 75;
            Asia = 65;
            Africa = 60;
            Dif = 7;
        }

        if (AnioNacimiento >= 1990 && AnioNacimiento <= 1999){
            Region = 85;
            America = 75;
            Asia = 60;
            Africa = 55;
            Dif = 6;
        }

        if (AnioNacimiento >= 2000 && AnioNacimiento <= 3000){
            Region = 90;
            America = 70;
            Asia = 65;
            Africa = 60;
            Dif = 4;
        }

    };
float tres, cuatro;
int deceso;
    public void expectativa (){
tres = (float)(Dif/2.0);
if (genero == 1){
   // expectativa = reg - uno;
    cuatro = reg - tres;
    txtVExpectativa.setText(""+cuatro+" AÑOS");
}else {};

        if (genero == 2){
            cuatro = reg + tres;
            txtVExpectativa.setText(""+cuatro+" AÑOS");
        }else {};

deceso =  AnioNacimiento + (int) cuatro;
        txtVDeceso.setText(""+deceso);

    };

    public void regiones(){

        if(rbRegion.isChecked()==true){
            reg = Region;
        }
        if(rbAmerica.isChecked()==true){
            reg = America;
        }
        if(rbAfrica.isChecked()==true){
            reg = Africa;
        }
        if(rbAsia.isChecked()==true){
            reg = Asia;
        }


    };



}
