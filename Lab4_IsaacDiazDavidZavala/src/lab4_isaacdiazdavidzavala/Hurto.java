package lab4_isaacdiazdavidzavala;

public class Hurto extends DMenor{
    private String objHurtado;
    private int valor;

    public Hurto() {
        super();
    }

    public Hurto(String objHurtado, int valor, String desc, String nVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito, String nPolicia, int id, int numCelda) {
        super(desc, nVictima, culpable, sentencia, fecha, pais, numDelito, nPolicia, id, numCelda);
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
