package edu.mariano.android.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlumnoAccion extends AppCompatActivity {

    private Button bt1;
    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno_accion);

        bt1 = (Button) findViewById(R.id.btIrEncuesta);
        bt2 = (Button) findViewById(R.id.btCerrar);
    }

    public void irEncuesta(View view){
        Intent i = new Intent(this, AlumnoActivity.class);
        startActivity(i);
    }
    public void cerrarSesion(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }



}
