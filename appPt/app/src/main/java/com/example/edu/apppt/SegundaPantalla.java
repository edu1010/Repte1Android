package com.example.edu.apppt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class SegundaPantalla extends AppCompatActivity {
    String PrimerPlat;
    String SegonPlat;
    String PostrePlat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        //Creo el desplebagle para el primer plato
        final Spinner Desplegable = (Spinner) findViewById(R.id.Desplegable);
        //El texto que ira en el desplegable
        String[] Primerplato = new String[]{"Macarrons", "Sopa", "pizza","Patates fregides"};
        ArrayAdapter<String>adapter = new ArrayAdapter<> (this,android.R.layout.simple_spinner_dropdown_item,Primerplato);
        Desplegable.setAdapter(adapter);

        //Desplegable.setOnItemClickListener();

        //Segundo desplegable con segundos platos
        final Spinner DesplegableSegundoPlato = (Spinner) findViewById(R.id.DesplegableSegundoPlato);
        String[] SegundoPlato = new String[]{"Paella","Amanida","Ous fregits"};
        ArrayAdapter<String>adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,SegundoPlato);
        DesplegableSegundoPlato.setAdapter(adapter1);

        //Desplegable de postre
        final Spinner DespegablePostre = (Spinner) findViewById(R.id.DespegablePostreID);
        String[] postres = new String[]{"Gelat","Pinya","Freses amb nata"};
        ArrayAdapter<String>adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,postres);
        DespegablePostre.setAdapter(adapter2);

        //Per tornar a la pantalla anterior
        Button anterior = (Button) findViewById(R.id.anterior);
         anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSegundo = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentSegundo);

            }
        });
         //Boton per anar a la pantalla final
         ImageButton resultat =(ImageButton) findViewById(R.id.Resultat);
         resultat.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast toast1 = Toast.makeText(getApplicationContext(),"Comanda guardada",Toast.LENGTH_LONG);
                 toast1.show();
                 PrimerPlat = Desplegable.getSelectedItem().toString();
                 SegonPlat = DesplegableSegundoPlato.getSelectedItem().toString();
                 PostrePlat = DespegablePostre.getSelectedItem().toString();
                 Intent intentFinal = new Intent(getApplicationContext(),Resultat.class);
                 //pasarle informacion
                 intentFinal.putExtra("Primer",PrimerPlat);
                 intentFinal.putExtra("Segon",SegonPlat);
                 intentFinal.putExtra("postre",PostrePlat);
                 //Iniciar la otra activity
                 startActivity(intentFinal);
             }
         });
    }
}
