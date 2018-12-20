package com.example.edu.geoquizdam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         Verdadero.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Siguiente.setVisibility(View.VISIBLE);
                 Pregunta pregunta = new Pregunta(Verdadero,Falso,Respuesta,R.drawable.ic_launcher_background);

             }
         });
    }
}
