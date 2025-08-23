package ar.edu.unahur.obj2.wtoj;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.contenido.Episodio;
import ar.edu.unahur.obj2.wtoj.contenido.Serie;
import ar.edu.unahur.obj2.wtoj.contenido.Temporada;

public class Main {
    public static void main(String[] args){
        Temporada t1 = new Temporada(1);
        t1.agregarEpisodio(new Episodio(15.0,1,"ep1"));
        t1.agregarEpisodio(new Episodio(20.0,2,"ep2"));

        Temporada t2 = new Temporada(1);
        t2.agregarEpisodio(new Episodio(15.0,1,"ep1"));
        t2.agregarEpisodio(new Episodio(20.0,2,"ep2"));
        Serie laSerie = new Serie("laSerie","comedia",30.0);
        laSerie.agregarTemporada(t1);
        laSerie.agregarTemporada(t2);
        
}
