package lab4_isaacdiazdavidzavala;

import java.util.Date;

public class DMenor extends Delito{
    private String nPolicia;
    private int id;
    private int numCelda;

    public DMenor() {
        super();
    }

    public DMenor(String nPolicia, int id, int numCelda, String desc, String nVictima, boolean culpable, String fecha, String pais, int numDelito) {
        super(desc, nVictima, culpable, fecha, pais, numDelito);
        this.nPolicia = nPolicia;
        this.id = id;
        this.numCelda = numCelda;
    }
    
    public String getnPolicia() {
        return nPolicia;
    }

    public void setnPolicia(String nPolicia) {
        this.nPolicia = nPolicia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumCelda() {
        return numCelda;
    }

    public void setNumCelda(int numCelda) {
        this.numCelda = numCelda;
    }

    @Override
    public String toString() {
        return "DMenor{" + "nPolicia=" + nPolicia + ", id=" + id + ", numCelda=" + numCelda + '}';
    }
    
}
