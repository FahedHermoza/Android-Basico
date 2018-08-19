package com.fahed.developer.lasegundaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextNombre;
    private Button buttonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = (EditText) findViewById(R.id.editTextEmail); //Enlaza un widget a una variable de nuestro codigo
        editTextNombre = (EditText) findViewById(R.id.editTextNombre);
        buttonRegistrar = (Button) findViewById(R.id.buttonIniciar);

        buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editTextEmail.getText().toString().trim(); //trim() elimina los espacios en blanco
                String nombre = editTextNombre.getText().toString().trim();

                if(!email.equals("") && !nombre.equals("")){
                    siguienteActvity(nombre,email);
                }else{
                    Toast.makeText(getBaseContext(), "Ingresa datos validos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void siguienteActvity(String nombre,String email ){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("EMAIL", email);
        intent.putExtra("NAME", nombre);
        startActivity(intent);
    }

}
