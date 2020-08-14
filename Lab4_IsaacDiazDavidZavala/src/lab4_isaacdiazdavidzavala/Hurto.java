package lab4_isaacdiazdavidzavala;

public class Hurto extends DMenor{
    private String objHurtado;
    private int valor;

    public Hurto() {
        super();
    }

    public Hurto(String objHurtado, int valor, String nPolicia, int id, int numCelda, String desc, String nVictima, boolean culpable, String fecha, String pais, int numDelito) {
        super(nPolicia, id, numCelda, desc, nVictima, culpable, fecha, pais, numDelito);
        this.objHurtado = objHurtado;
        this.valor = valor;
    }
    
    public String getObjHurtado() {
        return objHurtado;
    }

    public void setObjHurtado(String objHurtado) {
        this.objHurtado = objHurtado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Hurto{" + "objHurtado=" + objHurtado + ", valor=" + valor + '}';
    }
    
    
}
