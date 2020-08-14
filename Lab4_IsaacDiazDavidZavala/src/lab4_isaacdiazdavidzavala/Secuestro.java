package lab4_isaacdiazdavidzavala;

public class Secuestro extends DGrave{
    private int tiempoRete;
    private String estado;      //esta puede ser "Vivo" o "Muerto"

    public Secuestro() {
        super();
    }

    public Secuestro(int tiempoRete, String estado, int puntuacion, String desc, String nVictima, boolean culpable, String fecha, String pais, int numDelito) {
        super(puntuacion, desc, nVictima, culpable, fecha, pais, numDelito);
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
