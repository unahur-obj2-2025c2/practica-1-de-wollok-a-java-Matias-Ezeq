package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{
    private String genero;
    private List<Temporada> temporadas = new ArrayList<>();
    
    public Serie (String titulo, String genero ,Double precioBase){
        super(titulo, precioBase);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void agregarTemporada (Temporada temporada){
        temporadas.add(temporada);
    }

    public Double getPrecio(){
        return temporadas.stream().mapToDouble(t -> t.precio()).sum()/temporadas.size();
    }
}
