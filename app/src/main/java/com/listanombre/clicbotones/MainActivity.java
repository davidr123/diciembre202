package com.listanombre.clicbotones;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int clic=0;
    int clicb=0;
    int clicc=0;
    Button buttona;
    Button siguiente;
    TextView text ;
    TextView textB;
    TextView textC;
    String respuesta;
    String userdata, userdataB, userdataC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttona= (Button) findViewById(R.id.buttonA);
     siguiente= (Button)findViewById(R.id.next);

     text= (TextView) findViewById(R.id.textView);

     textB=(TextView) findViewById(R.id.textViewB);

     textC=(TextView) findViewById(R.id.textViewC);


     siguiente.setOnClickListener(new View.OnClickListener() {


         @Override
         public void onClick(View v) {
             userdata=text.getText().toString();
             userdataB=textB.getText().toString();
             userdataC=textC.getText().toString();
            int usernumber= Integer.parseInt(userdata);
           int usernumberB=Integer.parseInt(userdataB);
             int usernumberC=Integer.parseInt(userdataC);




             Intent intent = new Intent(MainActivity.this, Resultado.class);
             intent.putExtra("valorB", usernumber);
             intent.putExtra("value", usernumberB);
             intent.putExtra("valorC", usernumberC);


             startActivity(intent);
 

         }
     });





    }


    public  void Counter(View v){

            clic++;

            text.setText(Integer.toString(clic));




    }

    public  void Counter2(View v){
        clicb++;
        textB.setText(Integer.toString(clicb));

    }

    public  void Counter3(View v){
        clicc++;
        textC.setText(Integer.toString(clicc));

    }

}
