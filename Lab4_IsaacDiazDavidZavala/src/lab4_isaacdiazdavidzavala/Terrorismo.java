package lab4_isaacdiazdavidzavala;

public class Terrorismo extends DGrave{
    private String nArtefacto;
    private int numVictimas;

    public Terrorismo() {
        super();
    }
    
    public Terrorismo(String nArtefacto, int numVictimas, int puntuacion, String desc, String nVictima, boolean culpable, String fecha, String pais, int numDelito) {
        super(puntuacion, desc, nVictima, culpable, fecha, pais, numDelito);
        this.nArtefacto = nArtefacto;
        this.numVictimas = numVictimas;
    }

    public String getnArtefacto() {
        return nArtefacto;
    }

    public void setnArtefacto(String nArtefacto) {
        this.nArtefacto = nArtefacto;
    }

    public int getNumVictimas() {
        return numVictimas;
    }

    public void setNumVictimas(int numVictimas) {
        this.numVictimas = numVictimas;
    }

    @Override
    public String toString() {
        return "Terrorismo{" + "nArtefacto=" + nArtefacto + ", numVictimas=" + numVictimas + '}';
    }
    
}
