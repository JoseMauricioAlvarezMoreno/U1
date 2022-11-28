package com.example.practica_2_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cp;
    private EditText nom;
    private EditText cln;
    private EditText calle;
    private EditText estado;
    private EditText ap_pat;
    private EditText ap_mat;
    private EditText municipio;
    String datos;
    String regist;

    private TextView registrar;

    private Button aceptar;
    private Button limpiar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cp        = findViewById(R.id.cp);
        nom       = findViewById(R.id.nom);
        cln       = findViewById(R.id.cln);
        calle     = findViewById(R.id.calle);
        ap_mat    = findViewById(R.id.ap_mat);
        ap_pat    = findViewById(R.id.ap_pat);
        estado    = findViewById(R.id.estado);
        municipio = findViewById(R.id.Municipio);

        aceptar   = findViewById(R.id.aceptar);
        limpiar   = findViewById(R.id.limpiar);

        registrar = findViewById(R.id.registros);









    }

    /*public void formularios (View view)
    {
        String c;
        String cop;
        String col;
        String nomb;
        String ap_m;
        String ap_p;
        String esta;
        String muni;


        c    = calle.getText().toString();
        col  = cln.getText().toString();
        cop  = cp.getText().toString();
        nomb = nom.getText().toString();
        ap_p = ap_pat.getText().toString();
        ap_m = ap_mat.getText().toString();
        esta = estado.getText().toString();
        muni = municipio.getText().toString();


        //regist = (" "+ap_p +" "+ ap_m+" "+nomb+" "+col +" "+ cop +" "+c+" "+esta+" "+muni);

        datos = (" "+ap_p +" "+ ap_m+" "+nomb+" "+col +" "+ cop +" "+c+" "+esta+" "+muni);


        //registros.setText(regist);

        registros.setText(regist);
        //registros.setText(" "+ap_p +" "+ ap_m+" "+nomb+" "+col +" "+ cop +" "+c+" "+esta+" "+muni);


        if (regist.equals(""))
        {
            registros.setText(" No ingresaste algún nombre ");
        }






    }*/

    public void limpiar(View view)

    {
        cp.setText(" ");
        cln.setText(" ");
        nom.setText(" ");
        calle.setText(" ");
        estado.setText(" ");
        ap_pat.setText(" ");
        ap_mat.setText(" ");
        municipio.setText(" ");
        registrar.setText(" ");
    }


    public void validar (View view)

    {
        String c;
        String cop;
        String col;
        String nomb;
        String ap_m;
        String ap_p;
        String esta;
        String muni;


        c    = calle.getText().toString();
        col  = cln.getText().toString();
        cop  = cp.getText().toString();
        nomb = nom.getText().toString();
        ap_p = ap_pat.getText().toString();
        ap_m = ap_mat.getText().toString();
        esta = estado.getText().toString();
        muni = municipio.getText().toString();


        //regist = (" "+ap_p +" "+ ap_m+" "+nomb+" "+col +" "+ cop +" "+c+" "+esta+" "+muni);

        datos = (" "+ap_p +" "+ ap_m+" "+nomb+" "+col +" "+ cop +" "+c+" "+esta+" "+muni);


        //registros.setText(regist);

        registrar.setText(regist);
        //registros.setText(" "+ap_p +" "+ ap_m+" "+nomb+" "+col +" "+ cop +" "+c+" "+esta+" "+muni);


        if (regist.equals(""))
        {
            registrar.setText(" No ingresaste algún nombre ");
        }



        Intent validar = new Intent(MainActivity.this,datos_resultados.class);
        validar.putExtra("datosv",datos);
        startActivity(validar);





    }





}