package com.fahed.developer.lasegundaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private String nombre,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nombre = getIntent().getExtras().getString("NAME");
        email = getIntent().getExtras().getString("EMAIL");

        Toast.makeText(getBaseContext(), "Bienvenido "+nombre+" disfruta del servicio Mi monedero", Toast.LENGTH_LONG).show();
    }
}
