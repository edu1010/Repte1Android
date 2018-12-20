package com.example.edu.geoquizdam2solu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    TextView pregunta;
    Button b_verdadero, b_fals,b_siguiente;
    int indice=0;
    Pregunta [] llista_preguntas = {new Pregunta(R.string.pregunta1, respuesta true),
     new Pregunta(R.string.pregunta2)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_verdadero = findViewById(R.id.verdadero);
        b_falso = findViewById(R.id.falso);
        b_siguiente = findViewById(R.id.siguiente);
        pregunta = findViewById(R.id.texto_pregunta);
        actualizar_pregunta();
        b_verdadero.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            //comprobar_respuesta (b true);
            //actualizar_pregunta();

        }
        });
    private void comprobar_respuesta(boolean pulsado_usuario){
        if(pulsado_usuario == llista_preguntas[0].isRespuesta()){
        //toast acertado
        }else{
        //toast fallado
        }
    }
    private void actualizar_pregunta(){
        pregunta.setText(llista_preguntas[0].getId_pregunta());
        if(indice < llista_preguntas.length-1){//indice = (indice++)%llista_preguntas.length());
            indice++;
        }else{
            indice=0;
        }


    }
}
