package com.fahed.developer.loginactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogin = (Button) findViewById(R.id.buttonLogin); //Enlaza un widget a una variable de nuestro codigo

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextEmail =  (EditText) findViewById(R.id.editTextMail);
                editTextPassword = (EditText) findViewById(R.id.editTextPassword);

                if(editTextEmail.getText().toString().trim().length()>0 &&
                        editTextPassword.getText().toString().trim().length()>0  ){

                    if(editTextEmail.getText().toString().trim().equals("admin@gmail.com") &&
                            editTextPassword.getText().toString().trim().equals("admin")){
                        Toast.makeText(getApplicationContext(), R.string.snackbar_account_success_login, Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(getApplicationContext(), R.string.snackbar_account_error_login, Toast.LENGTH_LONG).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(), R.string.snackbar_error_login, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
