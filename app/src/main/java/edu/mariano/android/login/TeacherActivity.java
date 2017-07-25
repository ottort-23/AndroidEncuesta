package edu.mariano.android.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TeacherActivity extends AppCompatActivity {

    private EditText et3;
    private ListView lv1;
    private Button btIngresar;
    private ArrayAdapter adapter;
    private List<String> lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        et3 = (EditText) findViewById(R.id.et3);
        lv1 = (ListView) findViewById(R.id.lv1);
        btIngresar = (Button) findViewById(R.id.btIngresar);
        lista = new ArrayList<>();
        lista.add("Ottoniel");
        lista.add("Edwin");
        lista.add("Pedro");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        lv1.setAdapter(adapter);
    }

    public void accion(View view) {
        String nombre = et3.getText().toString();
        lista.add(nombre);
        adapter.notifyDataSetChanged();

    }

}
