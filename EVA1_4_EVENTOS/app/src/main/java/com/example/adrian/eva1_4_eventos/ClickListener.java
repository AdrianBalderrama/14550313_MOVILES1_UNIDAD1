package com.example.adrian.eva1_4_eventos;

import android.util.Log;
import android.view.View;

public class ClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Log.wtf("Hola Mundo","Evento click");
    }
}
