package com.alis.hackaton2022;

import java.util.Scanner;

/**
 *
 * @author Allecan
 */
public class Abuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el total: ");
        Integer N = in.nextInt();
        System.out.print("Ingresa el primer numero: ");
        Integer num1 = in.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        Integer num2 = in.nextInt();
        String strBytes = Integer.toBinaryString(num1) + Integer.toBinaryString(num2);
        char[] arrBytes = strBytes.toCharArray();
        int cont = 0;
        for (int i = 0; i < arrBytes.length; i++) {
            if (arrBytes[i] == '1') {
                cont += 1;
            }
        }
        System.out.println("La abuela le dara a su nieta: " + cont + " avellanas");
    }

}
