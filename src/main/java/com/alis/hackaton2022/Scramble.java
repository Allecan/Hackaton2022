package com.alis.hackaton2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Allecan
 */
public class Scramble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Igresa la primer cadena: ");
        String cadena1 = in.nextLine();
        System.out.print("Igresa la segunda cadena: ");
        String cadena2 = in.nextLine();
        cadena1 = cadena1.toLowerCase();
        cadena2 = cadena2.toLowerCase();
        if (esScramble(cadena1, cadena2)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    private static boolean esScramble(String cadena1, String cadena2) {
        if (cadena1.length() != cadena2.length()) {
            return false;
        } else {
            char[] arrCadena1 = cadena1.toCharArray();
            char[] arrCadena2 = cadena2.toCharArray();
            Arrays.sort(arrCadena1);
            Arrays.sort(arrCadena2);
            String cadena1Sort = new String(arrCadena1);
            String cadena2Sort = new String(arrCadena2);
            if (cadena1Sort.equals(cadena2Sort)) {
                return true;
            } else {
                return false;

            }
        }
    }

}
