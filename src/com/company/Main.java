package com.company;

import java.util.Scanner;
import java.util.Arrays;

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
        while(spielen) {
            if (spielen) {
                spieler1(scanner);
                System.out.println("      A     B     C");
                System.out.println("1     " + spielFeld[0][0] + "  |  " + spielFeld[1][0] + "  |  " + spielFeld[2][0]);
                System.out.println("    -----------------");
                System.out.println("2     " + spielFeld[0][1] + "  |  " + spielFeld[1][1] + "  |  " + spielFeld[2][1]);
                System.out.println("    -----------------");
                System.out.println("3     " + spielFeld[0][2] + "  |  " + spielFeld[1][2] + "  |  " + spielFeld[2][2]);
                spielen = ueberpruefung(spielen);
            }

            if (spielen) {
                spieler2(scanner);
                System.out.println("      A     B     C");
                System.out.println("1     " + spielFeld[0][0] + "  |  " + spielFeld[1][0] + "  |  " + spielFeld[2][0]);
                System.out.println("    -----------------");
                System.out.println("2     " + spielFeld[0][1] + "  |  " + spielFeld[1][1] + "  |  " + spielFeld[2][1]);
                System.out.println("    -----------------");
                System.out.println("3     " + spielFeld[0][2] + "  |  " + spielFeld[1][2] + "  |  " + spielFeld[2][2]);
                spielen = ueberpruefung(spielen);
            }


        }
    }
    public static void spieler1(Scanner scanner){
        boolean okay = false;
        do {
            System.out.println("Spieler 1: Wählen Sie Ihre Spalte aus.");
            String eingabe1 = scanner.next();
            System.out.println("Wählen Sie Ihre Zeile aus.");
            int eingabe2 = scanner.nextInt();
            int eingabe1Int = 0;
            if (eingabe1.equalsIgnoreCase("a")) {
                eingabe1Int = 0;
                System.out.println("abcd1");
            } else if (eingabe1.equalsIgnoreCase("b")) {
                eingabe1Int = 1;
            } else if (eingabe1.equalsIgnoreCase("c")) {
                eingabe1Int = 2;
            }
            okay = platzpruefung(eingabe1Int, eingabe2);
            if (!okay) {
                spielFeld[eingabe1Int][eingabe2 - 1] = "0";
            }
        } while (okay);


    }
    public static void spieler2(Scanner scanner){
        boolean okay = false;
        do {
            System.out.println("Spieler 2: Wählen Sie Ihre Spalte aus.");
            String eingabe1 = scanner.next();
            System.out.println("Wählen Sie Ihre Zeile aus.");
            int eingabe2 = scanner.nextInt();
            int eingabe1Int = 0;
            if (eingabe1.equalsIgnoreCase("a")) {
                eingabe1Int = 0;
                System.out.println("abcd");
            } else if (eingabe1.equalsIgnoreCase("b")) {
                eingabe1Int = 1;
            } else if (eingabe1.equalsIgnoreCase("c")) {
                eingabe1Int = 2;
            }
            okay = platzpruefung(eingabe1Int, eingabe2);
            if (!okay) {
                spielFeld[eingabe1Int][eingabe2 - 1] = "X";
            }
        } while (okay);
    }
    public static boolean platzpruefung(int eingabe1Int, int eingabe2) {
        System.out.println("hi");
        if (Arrays.asList(spielFeld[eingabe1Int][eingabe2-1]).contains(" ")) {
            System.out.println("wieso");
            return false;
        } else {
            System.out.println("Feld ist schon besetzt, wählen Sie ein neues Feld.");
            return true;
        }
    }

    public static Boolean ueberpruefung(Boolean spielen) {

            char Winner = ' ';


            if (spielFeld[0][0] == "0" && spielFeld[0][1] == "0" && spielFeld[0][2] == "0") Winner = '0';
            if (spielFeld[1][0] == "0" && spielFeld[1][1] == "0" && spielFeld[1][2] == "0") Winner = '0';
            if (spielFeld[2][0] == "0" && spielFeld[2][1] == "0" && spielFeld[2][2] == "0") Winner = '0';
            if (spielFeld[0][0] == "0" && spielFeld[1][0] == "0" && spielFeld[2][0] == "0") Winner = '0';
            if (spielFeld[0][1] == "0" && spielFeld[1][1] == "0" && spielFeld[2][1] == "0") Winner = '0';
            if (spielFeld[0][2] == "0" && spielFeld[1][2] == "0" && spielFeld[2][2] == "0") Winner = '0';
            if (spielFeld[0][0] == "0" && spielFeld[1][1] == "0" && spielFeld[2][2] == "0") Winner = '0';
            if (spielFeld[2][0] == "0" && spielFeld[1][1] == "0" && spielFeld[0][2] == "0") Winner = '0';

            if (Winner == '0' )
            {System.out.println("Spieler 1 hat gewonnen!" );
                spielen = false;
                return spielen;
            }

            // Check if O wins
            if (spielFeld[0][0] == "X" && spielFeld[0][1] == "X" && spielFeld[0][2] == "X") Winner = 'X';
            if (spielFeld[1][0] == "X" && spielFeld[1][1] == "X" && spielFeld[1][2] == "X") Winner = 'X';
            if (spielFeld[2][0] == "X" && spielFeld[2][1] == "X" && spielFeld[2][2] == "X") Winner = 'X';
            if (spielFeld[0][0] == "X" && spielFeld[1][0] == "X" && spielFeld[2][0] == "X") Winner = 'X';
            if (spielFeld[0][1] == "X" && spielFeld[1][1] == "X" && spielFeld[2][1] == "X") Winner = 'X';
            if (spielFeld[0][2] == "X" && spielFeld[1][2] == "X" && spielFeld[2][2] == "X") Winner = 'X';
            if (spielFeld[0][0] == "X" && spielFeld[1][1] == "X" && spielFeld[2][2] == "X") Winner = 'X';
            if (spielFeld[2][0] == "X" && spielFeld[1][1] == "X" && spielFeld[0][2] == "X") Winner = 'X';

            if (Winner == 'X' )
            {
                System.out.println("Spieler 2 hat gewonnen!");
                spielen = false;
                return spielen;
                }

            return spielen;


    }
}
