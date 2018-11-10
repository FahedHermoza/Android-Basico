package com.fahed.developer.pruebarecyclerview;

public class Musica {

    private String Titulo;
    private String Artista;

    public Musica(String titulo, String artista) {
        Titulo = titulo;
        Artista = artista;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
