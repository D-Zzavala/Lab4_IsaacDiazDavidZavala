package lab4_isaacdiazdavidzavala;

public class Secuestrador extends Agente{
    private String nVictima;
    private double cantRescate;

    public Secuestrador() {
        super();
    }

    public Secuestrador(String nVictima, double cantRescate) {
        this.nVictima = nVictima;
        this.cantRescate = cantRescate;
    }

    public String getnVictima() {
        return nVictima;
    }

    public void setnVictima(String nVictima) {
        this.nVictima = nVictima;
    }

    public double getCantRescate() {
        return cantRescate;
    }

    public void setCantRescate(double cantRescate) {
        this.cantRescate = cantRescate;
    }

    @Override
    public String toString() {
        return "Secuestrador{" + "nVictima=" + nVictima + ", cantRescate=" + cantRescate + '}';
    }
    
    @Override
    public void cometerDelito() {
        System.out.println("*se escuchan gritos, luego se aplica anestesia");
        System.out.println("Secuestro exitoso");
    }
}
