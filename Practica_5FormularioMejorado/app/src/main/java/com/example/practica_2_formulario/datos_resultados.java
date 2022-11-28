package com.example.practica_2_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class datos_resultados extends AppCompatActivity {



    Bundle datosv;
    private TextView datosresulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_resultados);

        datosresulta = findViewById(R.id.datosresult);
        datosv = getIntent().getExtras();
        datosresulta.setText("Sus datos son: "+datosv.getString("datosv"));

    }

}