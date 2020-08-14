package lab4_isaacdiazdavidzavala;

public class DGrave {
    private String desc;
    private String nVictima;
    private boolean culpable; //0: no es culpable       1: sí es culpable
    private String sentencia;   private int años;       //sentencia puede ser: Años (en ese caso, utilizamos la variable años)  oo pena de muerte (no se ocupan años)
    private String fecha;
    private String pais;
    private int numDelito;
    
    private int puntuacion;     // *esta lleva validacion en el set()

    public DGrave() {
    }

    public DGrave(String desc, String nVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito, int puntuacion) {
        this.desc = desc;
        this.nVictima = nVictima;
        this.culpable = culpable;
        this.sentencia = sentencia;
        this.fecha = fecha;
        this.pais = pais;
        this.numDelito = numDelito;
        this.puntuacion = puntuacion;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getnVictima() {
        return nVictima;
    }

    public void setnVictima(String nVictima) {
        this.nVictima = nVictima;
    }

    public boolean isCulpable() {
        return culpable;
    }

    public void setCulpable(boolean culpable) {
        this.culpable = culpable;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumDelito() {
        return numDelito;
    }

    public void setNumDelito(int numDelito) {
        this.numDelito = numDelito;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "DGrave{" + "desc=" + desc + ", nVictima=" + nVictima + ", culpable=" + culpable + ", sentencia=" + sentencia + ", a\u00f1os=" + años + ", fecha=" + fecha + ", pais=" + pais + ", numDelito=" + numDelito + ", puntuacion=" + puntuacion + '}';
    }
    
}
