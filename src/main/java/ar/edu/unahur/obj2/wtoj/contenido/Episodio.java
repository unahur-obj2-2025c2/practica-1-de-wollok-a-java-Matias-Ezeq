package ar.edu.unahur.obj2.wtoj.contenido;

public class Episodio {
    private final Integer numero;
    private String titulo;
    private Double costo;

    public Episodio(Double costo, Integer numero, String titulo) {
        this.costo = costo;
        this.numero = numero;
        this.titulo = titulo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getCostoEpisodio() {
        return costo;
    }

}
