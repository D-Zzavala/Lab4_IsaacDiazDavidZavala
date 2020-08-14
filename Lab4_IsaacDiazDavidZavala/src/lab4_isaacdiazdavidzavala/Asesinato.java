package lab4_isaacdiazdavidzavala;

public class Asesinato extends DGrave{
    private String nArma;
    private int numCuerpos;

    public Asesinato() {
        super();
    }

    public Asesinato(String nArma, int numCuerpos, String desc, String nVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito, int puntuacion) {
        super(desc, nVictima, culpable, sentencia, fecha, pais, numDelito, puntuacion);
        this.nArma = nArma;
        this.numCuerpos = numCuerpos;
    }

    public String getnArma() {
        return nArma;
    }

    public void setnArma(String nArma) {
        this.nArma = nArma;
    }

    public int getNumCuerpos() {
        return numCuerpos;
    }

    public void setNumCuerpos(int numCuerpos) {
        this.numCuerpos = numCuerpos;
    }

    @Override
    public String toString() {
        return "Asesinato{" + "nArma=" + nArma + ", numCuerpos=" + numCuerpos + '}';
    }
    
}
