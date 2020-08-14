package lab4_isaacdiazdavidzavala;

public class Asesino extends Agente{
    private String nVictima;
    private String arma;

    public Asesino() {
        super();
    }

    public Asesino(String nVictima, String arma) {
        this.nVictima = nVictima;
        this.arma = arma;
    }

    public String getnVictima() {
        return nVictima;
    }

    public void setnVictima(String nVictima) {
        this.nVictima = nVictima;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Asesino{" + "nVictima=" + nVictima + ", arma=" + arma + '}';
    }
    
    
    @Override
    public void cometerDelito() {
        System.out.println("bang");
        System.out.println("Asesinato completado");
    }
}
