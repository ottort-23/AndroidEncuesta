package edu.mariano.android.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private EditText et2;

    private Button btLogin;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* et1 = (EditText) findViewById(R.id.et1);
        btRandom = (Button) findViewById(R.id.btRandom);
        tv1 = (TextView) findViewById(R.id.tv1);*/

        btLogin = (Button) findViewById(R.id.btLogin);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);


    }

    public void random(View view) {

  /*  int numero = Integer.parseInt(et1.getText().toString());

        int random = new Random().nextInt(numero);
        tv1.setText(String.valueOf(random));*/


    }

    public void acceder(View view) {

        String user = et1.getText().toString();
        String pass = et2.getText().toString();

        if (user.endsWith("@umg.gt") && pass.equals("postgrado")) {

            Toast.makeText(this, "Bienvenido Profesor", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, TeacherActivity.class);
            startActivity(i);


        }
        if (user.endsWith("@umg.gt") && pass.equals("alumno")) {
            Toast.makeText(this, "Bienvenido alumno", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, AlumnoActivity.class);
            startActivity(i);
        }
        if (user.endsWith("@umg.gt") && pass.equals("alumno")) {
            Toast.makeText(this, "Bienvenido alumno", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, AlumnoActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();

        }
    }


}
