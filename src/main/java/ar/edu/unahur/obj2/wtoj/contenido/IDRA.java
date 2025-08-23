package ar.edu.unahur.obj2.wtoj.contenido;

public class IDRA {

    private static final IDRA instance = new IDRA();
    private Double canon = 0.0;

    private IDRA(){}

    public Double getCanon() {
        return canon;
    }

    public void setCanon(Double canon) {
        this.canon = canon;
    }

    public static IDRA getInstance() {
        return instance;
    }
    
}
