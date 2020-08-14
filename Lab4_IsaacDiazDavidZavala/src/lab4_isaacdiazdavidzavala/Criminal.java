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
}
