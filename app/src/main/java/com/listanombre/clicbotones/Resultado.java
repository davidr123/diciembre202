package com.listanombre.clicbotones;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends MainActivity {

TextView textoactivity;
    TextView textob, textoc;

String total;
Button regresar;
    int valora;
    int valorb, valorc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

textoactivity= findViewById(R.id.textViewA);

textob= findViewById(R.id.textViewB);

textoc= findViewById(R.id.textViewC);

RecibirDatos();



    }
    private void RecibirDatos(){
        Bundle extras= getIntent().getExtras();
        valora= extras.getInt("value");
           valorb= extras.getInt("valorB");
        valorc= extras.getInt("valorC");


        textoactivity.setText("el valor del boton A es: "+valorb);
        textob.setText("el valor del botonb es:" + valora);
        textoc.setText("el valor del boton c es:" + valorc);


    }

}
