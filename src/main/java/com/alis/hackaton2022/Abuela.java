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
        System.out.println(num1.byteValue());
        System.out.println(num2.byteValue());
    }
    
}
