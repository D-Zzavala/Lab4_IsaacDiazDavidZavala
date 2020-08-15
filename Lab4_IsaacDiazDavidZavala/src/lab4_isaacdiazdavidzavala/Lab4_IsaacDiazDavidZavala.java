/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_isaacdiazdavidzavala;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_IsaacDiazDavidZavala {

    // Atributos
    static Scanner read = new Scanner(System.in);
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
                                if (sw) {// !criminales.isempty

                                } else if (!sw) { //criminales.isempty
                                    System.out.println("Deben haber ");
                                }

                                //add Delito
                                break;
                            }
                            case 2: {
                                //add Criminal
                                break;
                            }
                            case 3: {
                                //add Agente
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
                                //mod Delito
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
                                } else if(o==6){
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
                                //add Delito
                                break;
                            }
                            case 2: {
                                //add Criminal
                                break;
                            }
                            case 3: {
                                //add Agente
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
                                //add Delito
                                break;
                            }
                            case 2: {
                                //add Criminal
                                break;
                            }
                            case 3: {
                                //add Agente
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

}
