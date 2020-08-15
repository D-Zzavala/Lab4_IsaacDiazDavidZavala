/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_isaacdiazdavidzavala;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4_IsaacDiazDavidZavala {

    // Atributos
    static Scanner read = new Scanner(System.in);
    static Scanner leer = new Scanner(System.in);
    static Random randy = new Random();
    static boolean tf = false;
    static boolean login = false;
    //Clases
    static Violacion Vio = new Violacion();
    static Vandalismo Van = new Vandalismo();
    static Terrorismo Ter = new Terrorismo();
    static Terrorista Terro = new Terrorista();
    static TDrogas TDr = new TDrogas();
    static Secuestro Sec = new Secuestro();
    static Prostitucion Pros = new Prostitucion();
    static Hurto Hur = new Hurto();
    static Delito Del = new Delito();
    static DMenor DMe = new DMenor();
    static DGrave Gra = new DGrave();
    static Asesinato Ase = new Asesinato();
    static Agente Age = new Agente() {
        public void cometerDelito() {
            throw new UnsupportedOperationException("Aun no disponible.");
        }
    };
    static Secuestrador Secu = new Secuestrador();
    static Asesino Ases = new Asesino();
    static Criminal Cri = new Criminal();
    //Listas
    static ArrayList<Criminal> ACriminal = new ArrayList();
    static ArrayList<Criminal> AAgente = new ArrayList();
    static ArrayList<Delito> ADGrave = new ArrayList();
    static ArrayList<Delito> ADMenor = new ArrayList();

    public static void main(String[] args) {
        while (tf == false) {
            System.out.println("1. Crear \n2. Modificar \n3. Eliminar \n4. Listar \n0. Salir");
            int op = read.nextInt();
            switch (op) {
                case 1: {// Crea
                    System.out.println("1. Delitos \n2. Criminales \n3. Agentes \n0. Cancelar"); // !criminales.isempty
                    int opp = read.nextInt();
                    boolean sw = false;
                    while (sw == false) {
                        switch (opp) {
                            case 1: {
                                if (!ACriminal.isEmpty()) {
                                    boolean cntl = false;
                                    while (cntl == false) {
                                        System.out.println("--Tipo de delito--");
                                        System.out.println("1. Menor  2. Grave");
                                        int tp = read.nextInt();
                                        switch (tp) {
                                            case 1: {
                                                ADMenor.add(AddDMenor());
                                                cntl = true;
                                                break;
                                            }
                                            case 2: {
                                                ADGrave.add(AddDGrave());
                                                cntl = true;
                                                break;
                                            }
                                            default:
                                                System.out.println("Error");
                                                break;
                                        }
                                    }
                                } else if (ACriminal.isEmpty()) {
                                    System.out.println("Deben haber criminales para poder");
                                    añadirCriminal();
                                }
                                break;
                            }
                            case 2: {
                                añadirCriminal();
                                break;
                            }
                            case 3: { //add Agente
                                if (!ACriminal.isEmpty()) {
                                    ListArrayLists(ACriminal);
                                    System.out.println("");
                                    System.out.print("Elija un Criminal para hacerlo Agente: ");
                                    int pol = read.nextInt();
                                    if (pol < 0 || pol > ACriminal.size()) {
                                        System.out.println("Error");
                                    } else {
                                        AAgente.add(ACriminal.get(pol));
                                    }
                                } else if (ACriminal.isEmpty()) {
                                    System.out.println("Deben haber criminales para poder");
                                    añadirCriminal();
                                }
                                break;
                            }
                            case 0: {
                                sw = true;
                                break;
                            }
                            default:
                                System.out.println("Error intente nuevamente");
                                break;
                        }
                    }
                    break;
                }
                case 2: {// Modifica
                    System.out.println("1. Delitos\n2. Criminales \n3. Agentes \n0. Cancelar");
                    int opp = read.nextInt();
                    boolean sw = false;
                    while (sw == false) {
                        switch (opp) {
                            case 1: {
                                System.out.println("Tipo de delito a Modificar");
                                System.out.println("----1. Grave 2. Menor-----");
                                int ppp = read.nextInt();
                                switch (ppp) {
                                    case 1: {
                                        ListArrayLists(ADGrave);
                                        int s = read.nextInt();
                                        if (s < ADGrave.size() || s > 0) {
                                            ADGrave.add(ModDGrave(ADGrave.get(s)));
                                            ADGrave.remove(ADGrave.get(s));
                                        } else {
                                            System.out.println("Error");
                                        }
                                        break;
                                    }
                                    case 2:
                                        ListArrayLists(ADMenor);
                                        int s = read.nextInt();
                                        if (s < ADMenor.size() || s > 0) {
                                            ADMenor.add(ModDGrave(ADMenor.get(s)));
                                            ADMenor.remove(ADMenor.get(s));
                                        } else {
                                            System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                //mod Criminal

                                String nombre;
                                int edad;
                                String genero;             //solo puede ser 1. Masculino o 2.Femenino
                                String pais;
                                boolean encarcelado;       //0: no está encarcelado    1: está topadito
                                String desc;

                                System.out.print("Posición del criminal en la lista: ");
                                int pos = read.nextInt();
                                System.out.println("¿Qué querés modificar?");
                                System.out.print("1. Nombre   2. Edad   3. Género 4. País   5. Encarcelado   6. Descripción");
                                int o = read.nextInt();
                                while ((o >= 1) == false && (o <= 6) == false) {
                                    o = read.nextInt();
                                }
                                if (o == 1) {
                                    System.out.print("Ingrese nombre del criminal: ");
                                    nombre = read.next();
                                    ACriminal.get(pos).setNombre(nombre);
                                } else if (o == 2) {
                                    System.out.print("Edad: ");
                                    edad = read.nextInt();
                                    ACriminal.get(pos).setEdad(edad);
                                } else if (o == 3) {
                                    System.out.print("Género:    1. Hombre  2. Mujer");
                                    int oop = read.nextInt();
                                    while (oop != 1 || oop != 2) {
                                        oop = read.nextInt();
                                    }
                                    if (oop == 1) {
                                        genero = "Hombre";
                                    } else {
                                        genero = "Mujer";
                                    }
                                    ACriminal.get(pos).setGenero(genero);
                                } else if (o == 4) {
                                    System.out.print("País: ");
                                    pais = read.next();
                                    ACriminal.get(pos).setPais(pais);
                                } else if (o == 5) {
                                    System.out.println("¿Está encarcelado?:    0. No  1. Sí");
                                    int oop = read.nextInt();
                                    while (oop != 0 || oop != 1) {
                                        oop = read.nextInt();
                                    }
                                    if (oop == 0) {
                                        encarcelado = false;
                                    } else {
                                        encarcelado = true;
                                    }
                                    ACriminal.get(pos).setEncarcelado(encarcelado);
                                } else if (o == 6) {
                                    System.out.print("Descripción del criminal (una oración): ");
                                    desc = read.nextLine();
                                    desc = read.nextLine();
                                    ACriminal.get(pos).setDesc(desc);

                                }

                                break;
                            }
                            case 3: {
                                //mod Agente
                                break;
                            }
                            case 0: {
                                sw = true;
                                break;
                            }
                            default:
                                System.out.println("Error intente nuevamente");
                                break;
                        }
                    }
                    break;
                }
                case 3: {// Elimina
                    System.out.println("1. Delitos\n2. Criminales \n3. Agentes \n0. Cancelar");
                    int opp = read.nextInt();
                    boolean sw = false;
                    while (sw == false) {
                        switch (opp) {
                            case 1: {
                                System.out.println("Tipo de delito a Eliminar");
                                System.out.println("----1. Grave 2. Menor-----");
                                int ppp = read.nextInt();
                                switch (ppp) {
                                    case 1: {
                                        ListArrayLists(ADGrave);
                                        int s = read.nextInt();
                                        if (s < ADGrave.size() || s > 0) {
                                            ADGrave.remove(ADGrave.get(s));
                                        } else {
                                            System.out.println("Error");
                                        }
                                        break;
                                    }
                                    case 2:
                                        ListArrayLists(ADMenor);
                                        int s = read.nextInt();
                                        if (s < ADMenor.size() || s > 0) {
                                            ADMenor.remove(ADMenor.get(s));
                                        } else {
                                            System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                ListArrayLists(ACriminal);
                                int s = read.nextInt();
                                if (s < ACriminal.size() || s > 0) {
                                    ACriminal.remove(ACriminal.get(s));
                                } else {
                                    System.out.println("Error");
                                }
                                break;
                            }
                            case 3: {
                                ListArrayLists(AAgente);
                                int s = read.nextInt();
                                if (s < AAgente.size() || s > 0) {
                                    AAgente.remove(AAgente.get(s));
                                } else {
                                    System.out.println("Error");
                                }
                                break;
                            }
                            case 0: {
                                sw = true;
                                break;
                            }
                            default:
                                System.out.println("Error intente nuevamente");
                                break;
                        }
                    }
                    break;
                }
                case 4: {// Lista
                    System.out.println("1. Delitos\n2. Criminales \n3. Agentes \n0. Cancelar");
                    int opp = read.nextInt();
                    boolean sw = false;
                    while (sw == false) {
                        switch (opp) {
                            case 1: {
                                System.out.println("Delitos");
                                System.out.println("Graves");
                                ListArrayLists(ADGrave);
                                System.out.println("");
                                System.out.println("Menores");
                                ListArrayLists(ADMenor);
                                break;
                            }
                            case 2: {
                                System.out.println("Criminales");
                                ListArrayLists(ACriminal);
                                break;
                            }
                            case 3: {
                                System.out.println("Agentes");
                                ListArrayLists(AAgente);
                                break;
                            }
                            case 0: {
                                sw = true;
                                break;
                            }
                            default:
                                System.out.println("Error intente nuevamente");
                                break;
                        }
                    }
                    break;
                }
                case 0: {
                    tf = true;
                    break;
                }
            }
        }
    }

    static Delito ModDMenor(Delito delito) {
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

    static Delito ModDGrave(Delito delito) {
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

    static Criminal añadirCriminal() {
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

    static void modCriminal() {
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

    static void ListArrayLists(ArrayList ArrayList) {
        for (int i = 0; i < ArrayList.size(); i++) {
            System.out.print("[(" + i + ")" + ArrayList.get(i) + "]");
        }
        System.out.println("");
    }

}
