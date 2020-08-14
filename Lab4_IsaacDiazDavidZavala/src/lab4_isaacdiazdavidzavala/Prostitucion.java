package lab4_isaacdiazdavidzavala;

public class Prostitucion extends DMenor{
    private String nSolicitante;

    public Prostitucion() {
        super();
    }

    public Prostitucion(String nSolicitante, String desc, String nVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito, String nPolicia, int id, int numCelda) {
        super(desc, nVictima, culpable, sentencia, fecha, pais, numDelito, nPolicia, id, numCelda);
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
