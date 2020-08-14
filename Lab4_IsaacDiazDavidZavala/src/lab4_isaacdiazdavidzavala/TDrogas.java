package lab4_isaacdiazdavidzavala;

public class TDrogas extends DGrave{
    private String nDroga;
    private int cantidad;

    public TDrogas() {
        super();
    }

    public TDrogas(String nDroga, int cantidad, String desc, String nVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito, int puntuacion) {
        super(desc, nVictima, culpable, sentencia, fecha, pais, numDelito, puntuacion);
        this.nDroga = nDroga;
        this.cantidad = cantidad;
    }

    public String getnDroga() {
        return nDroga;
    }

    public void setnDroga(String nDroga) {
        this.nDroga = nDroga;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "TDrogas{" + "nDroga=" + nDroga + ", cantidad=" + cantidad + '}';
    }
    
    
}
