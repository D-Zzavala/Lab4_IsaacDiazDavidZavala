package lab4_isaacdiazdavidzavala;

public class Terrorista extends Agente{
    private String pais;
    private String ciudad;
    private String metodo;

    public Terrorista() {
        super();
    }

    public Terrorista(String pais, String ciudad, String metodo) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.metodo = metodo;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Terrorista{" + "pais=" + pais + ", ciudad=" + ciudad + ", metodo=" + metodo + '}';
    }
    
    @Override
    public void cometerDelito() {
        System.out.println("k-boom"+" wooosh"+"paawww");
        System.out.println("Bomba explotada con éxito");
    }
}
