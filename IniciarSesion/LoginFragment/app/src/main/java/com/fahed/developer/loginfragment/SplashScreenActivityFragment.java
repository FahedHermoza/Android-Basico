package com.fahed.developer.loginfragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class SplashScreenActivityFragment extends Fragment {

    private View viewRoot;
    private TextView textViewLogin;

    public SplashScreenActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_splash_screen, container, false);
        viewRoot = inflater.inflate(R.layout.fragment_splash_screen, container, false);

        textViewLogin = (TextView) viewRoot.findViewById(R.id.textViewLogin); //Enlaza un widget a una variable de nuestro codigo

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLogin(viewRoot);
            }
        });

        return viewRoot;

    }

    public void goLogin(View viewRoot) {
        Intent i = new Intent(viewRoot.getContext(), LoginActivity.class);
        startActivity(i);
    }
}
