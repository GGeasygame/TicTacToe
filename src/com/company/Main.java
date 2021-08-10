package com.company;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {
public static String[][] spielFeld;


    public static void main(String[] args) {
        String[][] spielFeld = new String[3][3];
        Scanner scanner = new Scanner(System.in);

        Boolean spielen = true;
        while (spielen) {
            spieler1(scanner);
            System.out.println( spielFeld[0][0] + "  |  " + spielFeld[1][0]   + "  |  " + spielFeld[2][0] );
            System.out.println("---------------------------------------");
            System.out.println( spielFeld[0][1]  + "  |  " + spielFeld[1][1]   + "  |  " + spielFeld[2][1] );
            System.out.println("---------------------------------------");
            System.out.println( spielFeld[0][2]  + "  |  " + spielFeld[1][2]   + "  |  " + spielFeld[2][2] );
            spieler1(scanner);





        }
    }
    public static void spieler1(Scanner scanner){

        System.out.println("Wählen Sie Ihre Spalte aus.");
        String eingabe1 = scanner.next();
        System.out.println("Wählen Sie Ihre Zeile aus.");
        int eingabe2 = scanner.nextInt();
        int eingabe1Int;
        if (eingabe1.equalsIgnoreCase("a")) {
            eingabe1Int = 0;
        } else if (eingabe1.equalsIgnoreCase("b")) {
            eingabe1Int = 1;
        } else {
            eingabe1Int = 2;
        }
        spielFeld[eingabe1Int][eingabe2 - 1]= "0";






    }
}
