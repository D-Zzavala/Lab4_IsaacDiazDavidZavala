package lab4_isaacdiazdavidzavala;

public class DGrave extends Delito{
    private int puntuacion;     // *esta lleva validacion en el set()

    public DGrave() {
    }

    public DGrave(int puntuacion, String desc, String nVictima, boolean culpable, String fecha, String pais, int numDelito) {
        super(desc, nVictima, culpable, fecha, pais, numDelito);
        this.puntuacion = puntuacion;
    }
    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "DGrave{" + "puntuacion=" + puntuacion + '}';
    }
    
}
