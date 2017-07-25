package edu.mariano.android.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlumnoActivity extends AppCompatActivity {

    private Button btnFinEncuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);

        btnFinEncuesta = (Button) findViewById(R.id.btIngresar);
    }

    public void finEncuesta(View view){
        Toast.makeText(this, "Gracias que tengas un buen dia", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this, AlumnoAccion.class);
        startActivity(i);
    }
}
