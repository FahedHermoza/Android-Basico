package com.fahed.developer.loginfragment;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class LoginActivityFragment extends Fragment {

    private View viewRoot;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonLogin;

    public LoginActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewRoot = inflater.inflate(R.layout.fragment_login, container, false);

        buttonLogin = (Button) viewRoot.findViewById(R.id.buttonLogin); //Enlaza un widget a una variable de nuestro codigo

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextEmail =  (EditText) viewRoot.findViewById(R.id.editTextMail);
                editTextPassword = (EditText) viewRoot.findViewById(R.id.editTextPassword);

                if(editTextEmail.getText().toString().trim().length()>0 &&
                        editTextPassword.getText().toString().trim().length()>0  ){

                    if(editTextEmail.getText().toString().trim().equals("admin@gmail.com") &&
                            editTextPassword.getText().toString().trim().equals("admin")){
                        Toast.makeText(viewRoot.getContext(), R.string.snackbar_account_success_login, Toast.LENGTH_LONG).show();;
                    }else{
                        Toast.makeText(viewRoot.getContext(), R.string.snackbar_account_error_login, Toast.LENGTH_LONG).show();
                    }

                }else{
                    Toast.makeText(viewRoot.getContext(), R.string.snackbar_error_login, Toast.LENGTH_LONG).show();
                }
            }
        });

        return viewRoot;
    }
}
