package com.example.edu.apppt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Resultat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        //Cogemos lo que selecciono el usuario
        String PrimerPlato = getIntent().getStringExtra("Primer");
        String SegundoPlato = getIntent().getStringExtra("Segon");
        String postres = getIntent().getStringExtra("postre");
        TextView primerPlat=(TextView)findViewById(R.id.PrimerPlat);
        primerPlat.setText(PrimerPlato);
        TextView segonPlat=(TextView)findViewById(R.id.SegonPlatID);
        segonPlat.setText(SegundoPlato);
        TextView postresID=(TextView)findViewById(R.id.postresID);
        postresID.setText(postres);
        ImageButton home =(ImageButton) findViewById(R.id.homeID);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast2 = Toast.makeText(getApplicationContext(),"Tornant a la pantalla inical",Toast.LENGTH_LONG);
                toast2.show();
                Intent home = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(home);
            }
        });



    }
}
