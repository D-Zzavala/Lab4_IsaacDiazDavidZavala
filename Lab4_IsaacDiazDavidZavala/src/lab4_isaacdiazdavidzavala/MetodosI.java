package lab4_isaacdiazdavidzavala;

import java.util.Scanner;

public class MetodosI {

    static Scanner leer = new Scanner(System.in);

    public Criminal añadirCriminal() {
        String nombre;
        int edad;
        String genero;             //solo puede ser 1. Masculino o 2.Femenino
        String pais;
        boolean encarcelado;       //0: no está encarcelado    1: está topadito
        String desc;
        System.out.print("Ingrese nombre del criminal: ");
        nombre = leer.next();
        System.out.print("Edad: ");
        edad = leer.nextInt();
        System.out.print("Género:    1. Hombre  2. Mujer");
        int o = leer.nextInt();
        while (o != 1 || o != 2) {
            o = leer.nextInt();
        }
        if (o == 1) {
            genero = "Hombre";
        } else {
            genero = "Mujer";
        }
        System.out.print("País: ");
        pais = leer.next();
        System.out.println("¿Está encarcelado?:    0. No  1. Sí");
        o = leer.nextInt();
        while (o != 0 || o != 1) {
            o = leer.nextInt();
        }
        if (o == 0) {
            encarcelado = false;
        } else {
            encarcelado = true;
        }
        System.out.print("Descripción del criminal (una oración): ");
        desc = leer.nextLine();
        desc = leer.nextLine();

        Criminal c = new Criminal(nombre, edad, genero, pais, encarcelado, desc);

        return c;
    }

    public void modCriminal() {
        System.out.print("¿Qué vas a modificar?");
        System.out.println("1. Criminal     2. Terrorista       3. Asesino      4. Secuestrador");
        int o = leer.nextInt();
        while ((o >= 1) == false && (o <= 4) == false) {
            o = leer.nextInt();
        }

        if (o == 1) {       //MODIFICAR CRIMINAL
            //se llevó al main
        }
    }
}
