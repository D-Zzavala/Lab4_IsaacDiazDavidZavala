package lab4_isaacdiazdavidzavala;

public class DGrave extends Delito{
    private int puntuacion;     // *esta lleva validacion en el set() porque va de 1 a 5

    public DGrave() {
    }

    public DGrave(int puntuacion, String desc, String nVictima, boolean culpable, String fecha, String pais, int numDelito) {
        super(desc, nVictima, culpable, fecha, pais, numDelito);
        setPuntuacion(puntuacion);
    }
    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        if(puntuacion>=1 && puntuacion<=5){
            this.puntuacion = puntuacion;
        }
    }

    @Override
    public String toString() {
        return "DGrave{" + "puntuacion=" + puntuacion + '}';
    }
    
}
