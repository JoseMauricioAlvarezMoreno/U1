package com.example.sumayresta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nu1;
    EditText nu2;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nu1 = findViewById(R.id.n1);
        nu2= findViewById(R.id.n2);
        r = findViewById(R.id.result);
    }


    public void restar (View view)
    {
        float v1 ;
        float v2 ;
        float res = 0;

        v1= Float.parseFloat(nu1.getText().toString());
        v2= Float.parseFloat(nu2.getText().toString());

        res = v1-v2;

        r.setText("El resultado es: "+ res);



    }

    public void sumar (View view)
    {

        float v1 ;
        float v2 ;
        float res = 0;

        v1= Float.parseFloat(nu1.getText().toString());
        v2= Float.parseFloat(nu2.getText().toString());

        res = v1+v2;

        r.setText("El resultado es: "+ res);


    }

    public void limpia()
    {



    }

    public void limpiar(View view)
    {
        limpia();
    }


}