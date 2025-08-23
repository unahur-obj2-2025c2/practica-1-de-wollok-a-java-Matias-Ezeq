package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private List<Episodio> episodios = new ArrayList<>();
    private final  Integer numero;

    public Temporada(Integer numero) {
        this.numero = numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public Double precio() {
        return episodios.stream().mapToDouble(e -> e.getCostoEpisodio()).sum()/episodios.size();
    }


}
