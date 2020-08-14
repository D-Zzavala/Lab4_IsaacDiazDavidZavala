package lab4_isaacdiazdavidzavala;

public class Violacion extends DGrave{
    private int edadVic;

    public Violacion() {
        super();
    }

    public Violacion(int edadVic, int puntuacion, String desc, String nVictima, boolean culpable, String fecha, String pais, int numDelito) {
        super(puntuacion, desc, nVictima, culpable, fecha, pais, numDelito);
        this.edadVic = edadVic;
    }
    
    public int getEdadVic() {
        return edadVic;
    }

    public void setEdadVic(int edadVic) {
        this.edadVic = edadVic;
    }

    @Override
    public String toString() {
        return "Violacion{" + "edadVic=" + edadVic + '}';
    }
    
}
