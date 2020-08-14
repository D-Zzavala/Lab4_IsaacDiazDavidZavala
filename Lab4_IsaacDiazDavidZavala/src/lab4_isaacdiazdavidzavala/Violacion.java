package lab4_isaacdiazdavidzavala;

public class Violacion extends DGrave{
    private int edadVic;

    public Violacion() {
        super();
    }
    
    public Violacion(int edadVic, String desc, String nVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito, int puntuacion) {
        super(desc, nVictima, culpable, sentencia, fecha, pais, numDelito, puntuacion);
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
