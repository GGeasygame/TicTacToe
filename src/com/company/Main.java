package com.company;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {
public static String[][] spielFeld = new String[3][3];


    public static void main(String[] args) {
        for(int i=0; i<spielFeld.length;i++){
            for(int j=0; j<spielFeld.length; j++){
                spielFeld[i][j]=" ";

            }
        }



        Scanner scanner = new Scanner(System.in);

        Boolean spielen = true;
        while (spielen) {
            spielen = ueberpruefung(spielen);
            if (spielen) {
                spieler1(scanner);
                System.out.println("      A     B     C");
                System.out.println("1     " + spielFeld[0][0] + "  |  " + spielFeld[1][0] + "  |  " + spielFeld[2][0]);
                System.out.println("    -----------------");
                System.out.println("2     " + spielFeld[0][1] + "  |  " + spielFeld[1][1] + "  |  " + spielFeld[2][1]);
                System.out.println("    -----------------");
                System.out.println("3     " + spielFeld[0][2] + "  |  " + spielFeld[1][2] + "  |  " + spielFeld[2][2]);
            }
            if (spielen) {
                spieler2(scanner);
                System.out.println("      A     B     C");
                System.out.println("1     " + spielFeld[0][0] + "  |  " + spielFeld[1][0] + "  |  " + spielFeld[2][0]);
                System.out.println("    -----------------");
                System.out.println("2     " + spielFeld[0][1] + "  |  " + spielFeld[1][1] + "  |  " + spielFeld[2][1]);
                System.out.println("    -----------------");
                System.out.println("3     " + spielFeld[0][2] + "  |  " + spielFeld[1][2] + "  |  " + spielFeld[2][2]);
            }
        }
    }
    public static void spieler1(Scanner scanner){

        System.out.println("Spieler 1: Wählen Sie Ihre Spalte aus.");
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
        System.out.println(eingabe2 - 1);

    }
    public static void spieler2(Scanner scanner){

        System.out.println("Spieler 2: Wählen Sie Ihre Spalte aus.");
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
        System.out.println(eingabe2 - 1);

    }
    public static Boolean ueberpruefung(Boolean spielen) {
        if ( )

        return spielen;
    }
}
