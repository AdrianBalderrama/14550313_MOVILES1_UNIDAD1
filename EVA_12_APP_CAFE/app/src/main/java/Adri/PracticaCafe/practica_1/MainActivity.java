package mx.ivancastro.practica_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox chkAzucar = findViewById(R.id.chkAzucar);
        chkAzucar.setOnClickListener((v) -> {});

        CheckBox chkCrema = findViewById(R.id.chkCrema);
        chkCrema.setOnClickListener((v) -> {});

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        findViewById(R.id.btnTotal).setOnClickListener((v) -> {
                int selectId = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(selectId);
                //if (radioButton == null) return;
                int total = 0;
                String descripcion = "";

                switch (selectId) {
                    case R.id.radio20:
                        total += 20;
                        descripcion = "Americano, ";
                        break;
                    case R.id.radio48:
                        total += 48;
                        descripcion = "Capuchino, ";
                        break;
                    case R.id.radio30:
                        total += 30;
                        descripcion = "Expresso";
                        break;
                }

                if (chkAzucar.isChecked()) { total += 1; descripcion += "azúcar, "; }
                if (chkCrema.isChecked())  { total += 1; descripcion += " crema, "; }

                EditText cantidad = findViewById(R.id.editTextCantidad);
                if (cantidad.getText().length() == 0) total = 0;
                else total = total * Integer.parseInt(cantidad.getText().toString());

                TextView txtDescripcion = findViewById(R.id.txtDescripcion);
                txtDescripcion.setText(descripcion);

                TextView test = findViewById(R.id.txtTotal);
                test.setText("$ " + total);
            });
    }
}
