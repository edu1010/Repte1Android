package com.example.edu.apppt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button SiguientePantalla = (Button) findViewById(R.id.SiguientePantalla);
        SiguientePantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPrimero = new Intent(getApplicationContext(),SegundaPantalla.class);
                startActivity(intentPrimero);

            }
        });

    }
}
