package com.example.edu.geoquizdam2;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pregunta {
    private Button Verdadero;
    private Button Falso;
    private TextView Respuesta;
    int id_pista;

    public Button getVerdadero() {
        return Verdadero;
    }

    public void setVerdadero(Button verdadero) {
        Verdadero = verdadero;
    }

    public Button getFalso() {
        return Falso;
    }

    public void setFalso(Button falso) {
        Falso = falso;
    }

    public TextView getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(TextView respuesta) {
        Respuesta = respuesta;
    }

    public int getId_pista() {
        return id_pista;
    }

    public void setId_pista(int id_pista) {
        this.id_pista = id_pista;
    }

    public Pregunta(Button verdadero, Button falso, TextView respuesta, int id_pista) {
        Verdadero = verdadero;
        Falso = falso;
        Respuesta = respuesta;
        this.id_pista = id_pista;
    }
}
