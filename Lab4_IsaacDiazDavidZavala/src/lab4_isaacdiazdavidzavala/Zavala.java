/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_isaacdiazdavidzavala;

import java.util.Random;
import java.util.Scanner;

public class Zavala {

    static Scanner read = new Scanner(System.in);
    static Random randy = new Random();
    
    static Delito ModDMenor(){
            System.out.print("Nombre victima:");
        String Nombre = read.next();
        System.out.println("");

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
        System.out.println("");

        System.out.print("ID Policia: ");
        int IDPoli = read.nextInt();
        System.out.println("");

        System.out.print("Celda: ");
        int celda = read.nextInt();
        System.out.println("");

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
    
    
    static Delito AddDMenor() {
        System.out.print("Nombre victima:");
        String Nombre = read.next();
        System.out.println("");

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
        System.out.println("");

        System.out.print("ID Policia: ");
        int IDPoli = read.nextInt();
        System.out.println("");

        System.out.print("Celda: ");
        int celda = read.nextInt();
        System.out.println("");

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
        System.out.println("");

        System.out.print("Puntuacion: ");
        int punt = read.nextInt();
        while (punt < 1 || punt > 5) {
            System.out.println("Error");
            System.out.print("Ingrese nueva Puntuacion: ");
            punt = read.nextInt();
        }

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

        String fecha = null;
        System.out.print("Ingrese el mes 1-12: ");
        int m = read.nextInt();
        while (m < 1 || m > 12) {
            System.out.println("Error");
            System.out.print("Ingrese el mes 1-12: ");
            m = read.nextInt();
        }
        System.out.print("Ingrese el dia: ");
        int d = read.nextInt();
        while (d < 1 || d > 30) {
            System.out.println("Error");
            System.out.print("Ingrese el mes 1-12: ");
            d = read.nextInt();
        }
        if (m == 2 && d < 28) {
            System.out.println("Error");
            System.out.print("Ingrese el mes 1-12: ");
            d = read.nextInt();
        }
        System.out.print("Ingrese el año: ");
        int a = read.nextInt();
        fecha = d + "/" + m + "/" + a;

        if (culpable == true) {
            System.out.println("------Sentencia-----");
            System.out.println("1. Prision 2. Muerte");
            String sentencia = null;
            int sen = read.nextInt();
            boolean po = false;
            while (po == false) {
                switch (sen) {
                    case 1: {
                        System.out.print("Tiempo en prision: ");
                        int sent = read.nextInt();
                        sentencia = "Prision por " + sent + " años.";
                        break;
                    }
                    case 2: {
                        sentencia = "Pena de Muerte";
                        break;
                    }
                }
            }
        }

        System.out.println("Pais del ataque:");
        String pais = read.next();

        int numdelito = 0 + randy.nextInt();

        Delito add = null;
        System.out.println("----------------Descripcion-------------");
        System.out.println("1. Terrorismo 2. Asesinato 3. Violacion"
                + "  4. Secuestro 5. Trafico de Drogas");
        String desc = read.next();
        int descrip = read.nextInt();
        boolean tr = false;
        while (tr == false) {
            switch (descrip) {
                case 1: {
                    desc = "Terrorismo";
                    String Artefacto = null;
                    System.out.println("Artefacto");
                    System.out.println("1. Explisvo 2. Arma Quimica 3. Ataque sibernetico");
                    int artefacto = read.nextInt();
                    boolean cntrl = false;
                    while (cntrl == false) {
                        switch (artefacto) {
                            case 1:
                                Artefacto = "Explosivo";
                                cntrl = true;
                                break;
                            case 2:
                                Artefacto = "Arma Quimica";
                                cntrl = true;
                                break;
                            case 3:
                                Artefacto = "Ataque sibernetico";
                                cntrl = true;
                                break;
                            default:
                                System.out.println("Error intente nuevamente.");
                                break;
                        }

                    }

                    System.out.print("Numero de victimas: ");
                    int nvic = read.nextInt();
                    while (nvic < 0) {
                        System.out.println("Error");
                        System.out.print("Numero de victimas: ");
                        nvic = read.nextInt();
                    }
//////
                    add = new Terrorismo(Artefacto, nvic, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                case 2: {

                    String Artefacto = null;
                    System.out.println("Artefacto");
                    System.out.println("1. Explisvo 2. Arma Blanca 3. Arma de Fuego");
                    int artefacto = read.nextInt();
                    boolean cntrl = false;
                    while (cntrl == false) {
                        switch (artefacto) {
                            case 1:
                                Artefacto = "Explosivo";
                                cntrl = true;
                                break;
                            case 2:
                                Artefacto = "Arma Blanca";
                                cntrl = true;
                                break;
                            case 3:
                                Artefacto = "Arma de Fuego";
                                cntrl = true;
                                break;
                            default:
                                System.out.println("Error intente nuevamente.");
                                break;
                        }
                    }

                    System.out.print("Numero de cuerpos: ");
                    int nvic = read.nextInt();
                    while (nvic < 0) {
                        System.out.println("Error");
                        System.out.print("Numero de cuerpos: ");
                        nvic = read.nextInt();
                    }

                    desc = "Assesinato";
                    add = new Asesinato(Artefacto, nvic, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                case 3: {
                    desc = "Violacion";
                    System.out.print("Ingrese la edad de la victima: ");
                    int edadvic = read.nextInt();
                    add = new Violacion(edadvic, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                case 4: {
                    desc = "Secuestro";

                    System.out.print("Tiempo del secuestro:");
                    int tiempo = read.nextInt();

                    String estado = null;
                    boolean ttr = false;
                    while (ttr == false) {
                        System.out.println("Estado del secuestro"
                                + " 1. Vivo 2. Muerto");
                        int est = read.nextInt();
                        ttr = false;
                        switch (est) {
                            case 1:
                                estado = "vivo";
                                ttr = true;
                                break;
                            case 2:
                                estado = "Muerto";
                                ttr = true;
                                break;
                            default:
                                System.out.println("Error");
                                break;
                        }
                    }

                    add = new Secuestro(tiempo, estado, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                case 5: {
                    String ndroga = null;
                    boolean tgb = false;
                    while (tgb == false) {
                        System.out.println("------------Droga------------"
                                + "1. Marihuana 2. Molly 3. Meth");
                        int dr = read.nextInt();
                        switch (dr) {
                            case 1:
                                ndroga = "Marihuana";
                                tgb = true;
                                break;
                            case 2:
                                ndroga = "Molly";
                                tgb = true;
                                break;
                            case 3:
                                ndroga = "Meth";
                                tgb = true;
                                break;
                            default:
                                System.out.println("Error");
                        }
                    }

                    System.out.println("Cantidad de la drogap[Libras]");
                    int cantidad = read.nextInt();

                    desc = "Trafico de drogas";
                    add = new TDrogas(ndroga, cantidad, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                default:
                    System.out.println("Error intente nuevamente");
            }
        }
        return add;
    }
    static Delito ModDGrave() {

        System.out.print("Nombre victima:");
        String Nombre = read.next();
        System.out.println("");

        System.out.print("Puntuacion: ");
        int punt = read.nextInt();
        while (punt < 1 || punt > 5) {
            System.out.println("Error");
            System.out.print("Ingrese nueva Puntuacion: ");
            punt = read.nextInt();
        }

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

        String fecha = null;
        System.out.print("Ingrese el mes 1-12: ");
        int m = read.nextInt();
        while (m < 1 || m > 12) {
            System.out.println("Error");
            System.out.print("Ingrese el mes 1-12: ");
            m = read.nextInt();
        }
        System.out.print("Ingrese el dia: ");
        int d = read.nextInt();
        while (d < 1 || d > 30) {
            System.out.println("Error");
            System.out.print("Ingrese el mes 1-12: ");
            d = read.nextInt();
        }
        if (m == 2 && d < 28) {
            System.out.println("Error");
            System.out.print("Ingrese el mes 1-12: ");
            d = read.nextInt();
        }
        System.out.print("Ingrese el año: ");
        int a = read.nextInt();
        fecha = d + "/" + m + "/" + a;

        if (culpable == true) {
            System.out.println("------Sentencia-----");
            System.out.println("1. Prision 2. Muerte");
            String sentencia = null;
            int sen = read.nextInt();
            boolean po = false;
            while (po == false) {
                switch (sen) {
                    case 1: {
                        System.out.print("Tiempo en prision: ");
                        int sent = read.nextInt();
                        sentencia = "Prision por " + sent + " años.";
                        break;
                    }
                    case 2: {
                        sentencia = "Pena de Muerte";
                        break;
                    }
                }
            }
        }

        System.out.println("Pais del ataque:");
        String pais = read.next();

        int numdelito = 0 + randy.nextInt();

        Delito add = null;
        System.out.println("----------------Descripcion-------------");
        System.out.println("1. Terrorismo 2. Asesinato 3. Violacion"
                + "  4. Secuestro 5. Trafico de Drogas");
        String desc = read.next();
        int descrip = read.nextInt();
        boolean tr = false;
        while (tr == false) {
            switch (descrip) {
                case 1: {
                    desc = "Terrorismo";
                    String Artefacto = null;
                    System.out.println("Artefacto");
                    System.out.println("1. Explisvo 2. Arma Quimica 3. Ataque sibernetico");
                    int artefacto = read.nextInt();
                    boolean cntrl = false;
                    while (cntrl == false) {
                        switch (artefacto) {
                            case 1:
                                Artefacto = "Explosivo";
                                cntrl = true;
                                break;
                            case 2:
                                Artefacto = "Arma Quimica";
                                cntrl = true;
                                break;
                            case 3:
                                Artefacto = "Ataque sibernetico";
                                cntrl = true;
                                break;
                            default:
                                System.out.println("Error intente nuevamente.");
                                break;
                        }

                    }

                    System.out.print("Numero de victimas: ");
                    int nvic = read.nextInt();
                    while (nvic < 0) {
                        System.out.println("Error");
                        System.out.print("Numero de victimas: ");
                        nvic = read.nextInt();
                    }
//////
                    add = new Terrorismo(Artefacto, nvic, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                case 2: {

                    String Artefacto = null;
                    System.out.println("Artefacto");
                    System.out.println("1. Explisvo 2. Arma Blanca 3. Arma de Fuego");
                    int artefacto = read.nextInt();
                    boolean cntrl = false;
                    while (cntrl == false) {
                        switch (artefacto) {
                            case 1:
                                Artefacto = "Explosivo";
                                cntrl = true;
                                break;
                            case 2:
                                Artefacto = "Arma Blanca";
                                cntrl = true;
                                break;
                            case 3:
                                Artefacto = "Arma de Fuego";
                                cntrl = true;
                                break;
                            default:
                                System.out.println("Error intente nuevamente.");
                                break;
                        }
                    }

                    System.out.print("Numero de cuerpos: ");
                    int nvic = read.nextInt();
                    while (nvic < 0) {
                        System.out.println("Error");
                        System.out.print("Numero de cuerpos: ");
                        nvic = read.nextInt();
                    }

                    desc = "Assesinato";
                    add = new Asesinato(Artefacto, nvic, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                case 3: {
                    desc = "Violacion";
                    System.out.print("Ingrese la edad de la victima: ");
                    int edadvic = read.nextInt();
                    add = new Violacion(edadvic, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                case 4: {
                    desc = "Secuestro";

                    System.out.print("Tiempo del secuestro:");
                    int tiempo = read.nextInt();

                    String estado = null;
                    boolean ttr = false;
                    while (ttr == false) {
                        System.out.println("Estado del secuestro"
                                + " 1. Vivo 2. Muerto");
                        int est = read.nextInt();
                        ttr = false;
                        switch (est) {
                            case 1:
                                estado = "vivo";
                                ttr = true;
                                break;
                            case 2:
                                estado = "Muerto";
                                ttr = true;
                                break;
                            default:
                                System.out.println("Error");
                                break;
                        }
                    }

                    add = new Secuestro(tiempo, estado, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                case 5: {
                    String ndroga = null;
                    boolean tgb = false;
                    while (tgb == false) {
                        System.out.println("------------Droga------------"
                                + "1. Marihuana 2. Molly 3. Meth");
                        int dr = read.nextInt();
                        switch (dr) {
                            case 1:
                                ndroga = "Marihuana";
                                tgb = true;
                                break;
                            case 2:
                                ndroga = "Molly";
                                tgb = true;
                                break;
                            case 3:
                                ndroga = "Meth";
                                tgb = true;
                                break;
                            default:
                                System.out.println("Error");
                        }
                    }

                    System.out.println("Cantidad de la drogap[Libras]");
                    int cantidad = read.nextInt();

                    desc = "Trafico de drogas";
                    add = new TDrogas(ndroga, cantidad, punt, desc, Nombre, culpable, fecha, pais, numdelito);
                    tr = true;
                    break;
                }
                default:
                    System.out.println("Error intente nuevamente");
            }
        }
        return add;
    }

}
