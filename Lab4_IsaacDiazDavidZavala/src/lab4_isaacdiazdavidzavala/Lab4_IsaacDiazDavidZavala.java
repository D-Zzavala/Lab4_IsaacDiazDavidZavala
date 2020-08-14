/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_isaacdiazdavidzavala;

import java.util.Scanner;

/**
 *
 * @author 50431
 */
public class Lab4_IsaacDiazDavidZavala {

    static Scanner read = new Scanner(System.in);
    static boolean tf = false;
    static boolean login = false;

    public static void main(String[] args) {
        while (tf == false) {
            System.out.println("1. Crear \n2. Modificar \n3. Eliminar \n4. Listar \n0. Salir");
            int op = read.nextInt();
            switch (op) {
                case 1: {// Crea
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
