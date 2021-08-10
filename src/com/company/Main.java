package com.company;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {
public static int var1 = 1;
    public static void main(String[] args) {
        int[] spielFeld = new int[9];
        Scanner scanner = new Scanner(System.in);

        Boolean spielen = true;
        while (spielen) {
            System.out.println( var1 + "  |  " + var2  + "  |  " + var3);
            System.out.println("---------------------------------------");
            System.out.println( var4 + "  |  " + var5  + "  |  " + var6);
            System.out.println("---------------------------------------");
            System.out.println( var7 + "  |  " + var8  + "  |  " + var9);
            spieler1(spielFeld, scanner);





        }
    }
    public static int spieler1(int[] spielFeld, Scanner scanner){

        System.out.println("Wählen Sie das Eingabefeld aus.");
        int eingabe1 = scanner.nextInt();
        spielFeld[eingabe1]= 1;






    }
}
