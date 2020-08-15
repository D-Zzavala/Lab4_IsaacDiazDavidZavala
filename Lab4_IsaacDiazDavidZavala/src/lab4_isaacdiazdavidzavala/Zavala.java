/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_isaacdiazdavidzavala;

import java.util.Scanner;

public class Zavala {

    static Scanner read = new Scanner(System.in);

    static Delito AddDMenor() {
        System.out.print("Nombre victima:");
        String Nombre = read.next();

        System.out.println("----------Culpa--------");
        System.out.println("1. Culpable 2. Inocente");
        int culpa = read.nextInt();
        boolean culpable = true, con = false;
        while (con == false) {
            switch (culpa) {
                case 1:
                    culpable = true;
                    con = true;
                    break;
                case 2:
                    culpable = false;
                    con = true;
                    break;
                default:
                    System.out.println("Error intente nuevamente.");
            }
        }

        System.out.print("Nombre Policia: ");
        String NPoli = read.next();

        System.out.print("ID Policia: ");
        int IDPoli = read.nextInt();

        System.out.print("Celda: ");
        int celda = read.nextInt();

        Delito add = null;
        System.out.println("---------------Descripcion------------");
        System.out.println("1. Valdalismo 2. Hurto 3. Prostitucion");
        String desc = read.next();
        int descrip = read.nextInt();
        boolean tr = false;
        while (tr == false) {
            switch (descrip) {
                case 1: {
                    desc = "Valdalismo";
                    add = new Vandalismo(desc, celda, desc, NPoli, celda, celda, desc, NPoli, culpable, desc, desc, celda);
                    tr = true;
                    break;
                }
                case 2: {
                    desc = "Hurto";
                    add = new Hurto(Nombre, celda, NPoli, celda, celda, desc, NPoli, culpable, desc, desc, celda);
                    tr = true;
                    break;
                }
                case 3:
                    desc = "Prostitucion";
                    add = new Prostitucion(NPoli, NPoli, celda, celda, desc, NPoli, culpable, desc, desc, celda);
                    tr = true;
                    break;
                default:
                    System.out.println("Error intente nuevamente");
            }
        }
        return add;
    }

    static Delito AddDGrave() {

        System.out.print("Nombre victima:");
        String Nombre = read.next();

        System.out.println("----------Culpa--------");
        System.out.println("1. Culpable 2. Inocente");
        int culpa = read.nextInt();
        boolean culpable = true, con = false;
        while (con == false) {
            switch (culpa) {
                case 1:
                    culpable = true;
                    con = true;
                    break;
                case 2:
                    culpable = false;
                    con = true;
                    break;
                default:
                    System.out.println("Error intente nuevamente.");
            }
        }

        if (culpable == true) {
            System.out.println("------Sentencia-----");
            System.out.println("1. Prision 2. Muerte");
            int sen = read.nextInt();
            boolean po = false;
            while (po == false) {
                switch (sen) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                }
            }
        }

        Delito add = null;
        System.out.println("----------------Descripcion-------------");
        System.out.println("1. Terrorismo 2. Asesinato 3. Violacion"
                + "   4. Secuestro 5. Trafico de Drogas");
        String desc = read.next();
        int descrip = read.nextInt();
        boolean tr = false;
        while (tr == false) {
            switch (descrip) {
                case 1: {
                    desc = "Terrorismo";
                    // add;
                    tr = true;
                    break;
                }
                case 2: {
                    desc = "Assesinato";
                    // add;
                    tr = true;
                    break;
                }
                case 3: {
                    desc = "Violacion";
                    // add;
                    tr = true;
                    break;
                }
                case 4: {
                    desc = "Secuestro";
                    // add;
                    tr = true;
                    break;
                }
                case 5: {
                    desc = "Trafico de drogas";
                    // add;
                    tr = true;
                    break;
                }
                default:
                    System.out.println("Error intente nuevamente");
            }
        }
        return add;
    }

    static TDrogas AddTDro(String Descripcion) {
        String Artefacto = null;
        System.out.println("Artefacto");
        System.out.println("1. Explisvo 2. Arma Quimica 3. Ataque sibernetico");
        int artefacto = read.nextInt();
        boolean cntrl = false;
        while (cntrl) {
            switch (artefacto) {
                case 1:
                    Artefacto = "Explosivo";
                    break;
                case 2:
                    Artefacto = "Arma Quimica";
                    break;
                case 3:
                    Artefacto = "Ataque sibernetico";
                    break;
                default:
                    System.out.println("Error intente nuevamente.");
                    break;
            }

        }
        System.out.println("");
        return null;
    }

}
