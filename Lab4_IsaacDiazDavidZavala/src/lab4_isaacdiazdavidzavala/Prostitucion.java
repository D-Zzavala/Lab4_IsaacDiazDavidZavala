package lab4_isaacdiazdavidzavala;

public class Prostitucion extends DMenor{
    private String nSolicitante;

    public Prostitucion() {
        super();
    }

    public Prostitucion(String nSolicitante, String nPolicia, int id, int numCelda, String desc, String nVictima, boolean culpable, String fecha, String pais, int numDelito) {
        super(nPolicia, id, numCelda, desc, nVictima, culpable, fecha, pais, numDelito);
        this.nSolicitante = nSolicitante;
    }
    
    public String getnSolicitante() {
        return nSolicitante;
    }

    public void setnSolicitante(String nSolicitante) {
        this.nSolicitante = nSolicitante;
    }

    @Override
    public String toString() {
        return "Prostitucion{" + "nSolicitante=" + nSolicitante + '}';
    }
    
}
