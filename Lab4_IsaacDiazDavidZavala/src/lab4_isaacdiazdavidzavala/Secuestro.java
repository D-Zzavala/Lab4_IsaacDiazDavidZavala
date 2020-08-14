package lab4_isaacdiazdavidzavala;

public class Secuestro extends DGrave{
    private int tiempoRete;
    private String estado;      //esta puede ser "Vivo" o "Muerto"

    public Secuestro() {
        super();
    }

    public Secuestro(int tiempoRete, String estado, String desc, String nVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito, int puntuacion) {
        super(desc, nVictima, culpable, sentencia, fecha, pais, numDelito, puntuacion);
        this.tiempoRete = tiempoRete;
        this.estado = estado;
    }

    public int getTiempoRete() {
        return tiempoRete;
    }

    public void setTiempoRete(int tiempoRete) {
        this.tiempoRete = tiempoRete;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Secuestro{" + "tiempoRete=" + tiempoRete + ", estado=" + estado + '}';
    }
    
}
