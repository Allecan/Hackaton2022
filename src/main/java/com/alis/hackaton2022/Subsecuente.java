package com.alis.hackaton2022;

import java.util.Scanner;

/**
 *
 * @author Allecan
 */
public class Subsecuente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa la primer cadena: ");
        String cadena1 = in.nextLine();
        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = in.nextLine();
        cadena1 = cadena1.toLowerCase();
        cadena2 = cadena2.toLowerCase();

        char[] arrCadena1 = cadena1.toCharArray();
        char[] arrCadena2 = cadena2.toCharArray();
        char[] arrCadenaSubsecuente = new char[cadena1.length()];
        for (int i = 0; i < cadena1.length(); i++) {
            if (arrCadena1[i] == arrCadena2[i]) {
                arrCadenaSubsecuente[i] = arrCadena1[i];
            }
        }
        String cadenaSubsecuente = new String(arrCadenaSubsecuente);
        System.out.println("Cadena subsecuente: " + cadenaSubsecuente);
    }
}
