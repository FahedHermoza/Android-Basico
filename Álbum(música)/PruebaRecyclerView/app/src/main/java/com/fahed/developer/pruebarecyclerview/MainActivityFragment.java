package com.fahed.developer.pruebarecyclerview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private View rootView;
    private RecyclerView recyclerViewItems;             //Recycla las vistas una y otra vez
    private LinearLayoutManager linearLayoutManager;    //Manejar el posicionamiento de los elementos y
                                                        // tambien define el comportamiento durante el desplazamiento

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        recyclerViewItems = (RecyclerView) rootView.findViewById(R.id.recyclerViewItems);

        linearLayoutManager = new LinearLayoutManager(rootView.getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewItems.setLayoutManager(linearLayoutManager);

        List<Musica> listMusica = CargarMusica();
        MusicaHolder.MusicaAdapter musicaAdapter = new MusicaHolder.MusicaAdapter(listMusica);
        recyclerViewItems.setAdapter(musicaAdapter);

        return rootView;
    }

    private List<Musica> CargarMusica(){
        List<Musica> listMusica = new ArrayList<>();
        listMusica.add(new Musica("Chibola Manyada","Temple Sour"));
        listMusica.add(new Musica("Eres","Cafe Tacuba"));
        listMusica.add(new Musica("La Chata","Ámen"));
        listMusica.add(new Musica("Vamos con fé","Laguna Pai"));
        listMusica.add(new Musica("Un dia sin Sexo","Mar de copas"));
        listMusica.add(new Musica("Aprovechalo","Wisin & Yandel"));
        listMusica.add(new Musica("Matalos a todos","NOX"));
        listMusica.add(new Musica("Meidin Perú","Norik"));
        listMusica.add(new Musica("La pelotona","Cartel de Santa"));
        listMusica.add(new Musica("Chibola Manyada","Temple Sour"));
        return listMusica;
    }
}
