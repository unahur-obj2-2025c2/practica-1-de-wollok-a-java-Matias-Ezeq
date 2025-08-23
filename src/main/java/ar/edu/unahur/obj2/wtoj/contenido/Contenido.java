package ar.edu.unahur.obj2.wtoj.contenido;

public abstract class Contenido {
    private final String titulo;
    private Double precioBase;

    public Contenido(String titulo, Double precioBase){
        this.titulo = titulo;
        this.precioBase = precioBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract Double precioCalcular();

    public Double precio(){
        return getPrecioBase() + precioCalcular();
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }
     
}
