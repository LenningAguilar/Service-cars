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
public class MainActivity extends AppCompatActivity {

    //Variables view
    private Button buttonIniciarSesion;
    private EditText editTextCorreo;
    private EditText editTextContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultar el action bar
        getSupportActionBar().hide();

        //Asociar la variable(java) con el view (xml)
        buttonIniciarSesion = findViewById(R.id.buttonIniciarSesion);
        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextContrasena = findViewById(R.id.editTextContraseña);


        buttonIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar();
            }
        });

        editTextCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextCorreo.setText("");
            }
        });

        editTextContrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextContrasena.setText("");
            }
        });
    }

   public void onCLickRegistrar(View view){
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void validar() {
        if (editTextCorreo.getText().toString().isEmpty()) {
            editTextCorreo.setError("Ingrese su correo electrónico");
        }
        if (editTextContrasena.getText().toString().isEmpty()) {
            editTextContrasena.setError("Ingrese su contraseña");
        }
        if(editTextCorreo.getText().toString().equals("lenning120601@hotmail.com") && editTextContrasena.getText().toString().equals("12345")){
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);

        }
        else{
            Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }
    }
}