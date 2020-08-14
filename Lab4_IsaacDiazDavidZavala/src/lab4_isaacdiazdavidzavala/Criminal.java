package lab4_isaacdiazdavidzavala;

import java.util.ArrayList;

public class Criminal {
    private ArrayList<Delito> delitos = new ArrayList();
    
    private String nombre;
    private int edad;
    private String genero;             //solo puede ser 1. Masculino o 2.Femenino
    private String pais;
    private boolean encarcelado;       //0: no está encarcelado    1: está topadito
    private String desc;

    public Criminal() {
    }

    public Criminal(String nombre, int edad, String genero, String pais, boolean encarcelado, String desc) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pais = pais;
        this.encarcelado = encarcelado;
        this.desc = desc;
    }
    
    public ArrayList<Delito> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<Delito> delitos) {
        this.delitos = delitos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEncarcelado() {
        return encarcelado;
    }

    public void setEncarcelado(boolean encarcelado) {
        this.encarcelado = encarcelado;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Criminal{" + "delitos=" + delitos + ", nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", pais=" + pais + ", encarcelado=" + encarcelado + ", desc=" + desc + '}';
    }
    
    
}
