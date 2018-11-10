package com.fahed.developer.pruebarecyclerview;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MusicaHolder extends RecyclerView.ViewHolder implements View.OnClickListener { //Conserva el View

    private Musica itemMusicas;
    private TextView textViewTitulo;
    private TextView textViewArtista;
    private View viewItem;

    public MusicaHolder(View viewItem) {
        super(viewItem);
        this.viewItem = viewItem;
        viewItem.setOnClickListener(this);

        textViewTitulo = (TextView) viewItem.findViewById(R.id.textViewTitulo);
        textViewArtista = (TextView) viewItem.findViewById(R.id.textViewArtista);
    }

    public void bindMusicas(Musica itemMusicas) {
        this.itemMusicas = itemMusicas;
        textViewTitulo.setText(this.itemMusicas.getTitulo());
        textViewArtista.setText(this.itemMusicas.getArtista());
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(viewItem.getContext(),"Reproducir: "+itemMusicas.getTitulo(),Toast.LENGTH_LONG).show();
    }

    public static class MusicaAdapter extends RecyclerView.Adapter<MusicaHolder> { // Responsable de crear los ViewHolder y enlazar los ViewHolder con los datos

        private List<Musica> listMusica;

        public MusicaAdapter(List<Musica> listMusica) {
            this.listMusica = listMusica;
        }

        @Override
        public MusicaHolder onCreateViewHolder(ViewGroup parent, int viewType) { //Creamos una vista y encapsulamos en ViewHolder
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.card_item, parent, false);
            return new MusicaHolder(view);
        }

        @Override
        public void onBindViewHolder(MusicaHolder holder, int position) {
            Musica itemMusica = listMusica.get(position);
            //Connect widgets
            holder.bindMusicas(itemMusica);
        }

        @Override
        public int getItemCount() {
            return listMusica.size();
        }
    }

}
