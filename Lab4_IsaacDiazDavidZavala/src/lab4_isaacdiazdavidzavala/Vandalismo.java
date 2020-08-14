package lab4_isaacdiazdavidzavala;

public class Vandalismo extends DMenor{
    private String edificacion;
    private int pisos;
    private String nDueño;

    public Vandalismo() {
        super();
    }

    public Vandalismo(String edificacion, int pisos, String nDueño, String desc, String nVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito, String nPolicia, int id, int numCelda) {
        super(desc, nVictima, culpable, sentencia, fecha, pais, numDelito, nPolicia, id, numCelda);
        this.edificacion = edificacion;
        this.pisos = pisos;
        this.nDueño = nDueño;
    }

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getnDueño() {
        return nDueño;
    }

    public void setnDueño(String nDueño) {
        this.nDueño = nDueño;
    }

    @Override
    public String toString() {
        return "Vandalismo{" + "edificacion=" + edificacion + ", pisos=" + pisos + ", nDue\u00f1o=" + nDueño + '}';
    }
    
}
