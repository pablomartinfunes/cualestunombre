package com.example.pfunes.cualestunombre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private Button  btIngresar;
    private TextView tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.editTextNombre);
        btIngresar=  (Button) findViewById(R.id.buttonIngresar);
        tvNombre= (TextView) findViewById(R.id.textViewNombre);

    }

    public void onClickButtonHandler(View target){
        String nombre = etNombre.getText().toString();
        tvNombre.setText(nombre);
    }
}
