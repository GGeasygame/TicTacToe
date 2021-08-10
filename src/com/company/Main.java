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
            System.out.println( spielFeld[0][0] + "  |  " + spielFeld[1][0]   + "  |  " + spielFeld[2][0] );
            System.out.println("---------------------------------------");
            System.out.println( spielFeld[0][1]  + "  |  " + spielFeld[1][1]   + "  |  " + spielFeld[2][1] );
            System.out.println("---------------------------------------");
            System.out.println( spielFeld[0][2]  + "  |  " + spielFeld[1][2]   + "  |  " + spielFeld[2][2] );
            spieler1(spielFeld, scanner);





        }
    }
    public static int spieler1(String[][] spielFeld, Scanner scanner){

        System.out.println("Wählen Sie das Eingabefeld aus.");
        String eingabe1 = scanner.next();
        String eingabe2 = scanner.next();
        spielFeld[eingabe1]= "0";






    }
}
