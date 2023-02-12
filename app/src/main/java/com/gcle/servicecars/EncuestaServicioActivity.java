/*
NOMBRE DE LA PRÁCTICA: ANDROID APP
TEMA DE REFERENCIA: ORIENTACIÓN Y MAVIMIENTO EN LOS DISPOSITIVOS
OBJETIVO DE LA PRÁCTICA: DESARROLLAR UNA APLICACIÓN PARA ANDROID (API 23+), EN DONDE SE
IMPLEMENTEN ELEMENTOS DE TIPO MATERIAL DESIGN.
MATERIA:BASE DE DATOS PARA DISPOSITIVOS MÓVILES
ALUMNO: CESAR GUSTAVO ALMARAZ MONTEMAYOR
EDUARDO DE JESÚS ROSALES ALCALA
JOSÉ LENNING AGUILAR RUVALCABA
GERARDO DE LOS SANTOS JUAREZ
*/
package com.gcle.servicecars;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class EncuestaServicioActivity extends AppCompatActivity {

    //Variables view
    private Button buttonEnviarEncuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_servicio);

        //Ocultar el action bar
        getSupportActionBar().hide();

        //Asociar la variable(java) con el view (xml)
        buttonEnviarEncuesta = findViewById(R.id.buttonEnviarEncuesta);

        buttonEnviarEncuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EncuestaServicioActivity.this, "Gracias por evaluarnos", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(EncuestaServicioActivity.this, MenuActivity.class);
                startActivity(intent);

                //Cerrar este activiry
                finish();
            }
        });
    }
}