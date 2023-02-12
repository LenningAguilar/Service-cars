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
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class RegisterActivity extends AppCompatActivity {

    //Variables view
    private Button buttonRegistrarte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //Ocultar actionbar
        getSupportActionBar().hide();

        buttonRegistrarte = findViewById(R.id.buttonRegister);
        buttonRegistrarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterActivity.this, "Reigistro exitoso", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegisterActivity.this, MenuActivity.class);
                startActivity(intent);

                //Finalizar este activity
                finish();
            }
        });
    }
}