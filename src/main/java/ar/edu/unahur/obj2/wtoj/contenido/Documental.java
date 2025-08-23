package ar.edu.unahur.obj2.wtoj.contenido;

public class Documental extends Contenido {

    public Documental(String titulo, Double precioBase) {
        super(titulo, precioBase);
    }

    @Override
    public Double precioCalcular(){
        return IDRA.getInstance().getCanon();
    }

}
