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
