package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
public static String[][] spielFeld = new String[3][3];
public static String eingabe1;
public static int eingabe2;
public static Boolean ende = false;
public static int counter = 0;


    public static void main(String[] args) {
        for(int i=0; i<spielFeld.length;i++){
            for(int j=0; j<spielFeld.length; j++){
                spielFeld[i][j]=" ";

            }
        }

        Scanner scanner = new Scanner(System.in);
        Boolean spielen1 = true;
        Boolean spielen = true;
        System.out.println("      A     B     C");
        System.out.println("1     " + spielFeld[0][0] + "  |  " + spielFeld[1][0] + "  |  " + spielFeld[2][0]);
        System.out.println("    -----------------");
        System.out.println("2     " + spielFeld[0][1] + "  |  " + spielFeld[1][1] + "  |  " + spielFeld[2][1]);
        System.out.println("    -----------------");
        System.out.println("3     " + spielFeld[0][2] + "  |  " + spielFeld[1][2] + "  |  " + spielFeld[2][2]);
        while(spielen && spielen1) {

            if (spielen && spielen1) {
                spieler1(scanner);
                System.out.println("      A     B     C");
                System.out.println("1     " + spielFeld[0][0] + "  |  " + spielFeld[1][0] + "  |  " + spielFeld[2][0]);
                System.out.println("    -----------------");
                System.out.println("2     " + spielFeld[0][1] + "  |  " + spielFeld[1][1] + "  |  " + spielFeld[2][1]);
                System.out.println("    -----------------");
                System.out.println("3     " + spielFeld[0][2] + "  |  " + spielFeld[1][2] + "  |  " + spielFeld[2][2]);
                spielen = ueberpruefung(spielen);
                spielen1 = gleichstand();
            }

            if (spielen && spielen1) {
                spieler2(scanner);
                System.out.println("      A     B     C");
                System.out.println("1     " + spielFeld[0][0] + "  |  " + spielFeld[1][0] + "  |  " + spielFeld[2][0]);
                System.out.println("    -----------------");
                System.out.println("2     " + spielFeld[0][1] + "  |  " + spielFeld[1][1] + "  |  " + spielFeld[2][1]);
                System.out.println("    -----------------");
                System.out.println("3     " + spielFeld[0][2] + "  |  " + spielFeld[1][2] + "  |  " + spielFeld[2][2]);
                spielen = ueberpruefung(spielen);
                spielen1 = gleichstand();
            }


        }
    }
    public static void spieler1(Scanner scanner){
        boolean okay = false;
        do {
            System.out.println("Spieler 1: Wählen Sie Ihre Spalte aus.");
            eingabe1 = scanner.next();
            System.out.println("Wählen Sie Ihre Zeile aus.");
            eingabe2 = scanner.nextInt();
            rechtschreibung();
            int eingabe1Int = 0;
            if (eingabe1.equalsIgnoreCase("a")) {
                eingabe1Int = 0;
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
            eingabe1 = scanner.next();
            System.out.println("Wählen Sie Ihre Zeile aus.");
            eingabe2 = scanner.nextInt();
            rechtschreibung();
            int eingabe1Int = 0;
            if (eingabe1.equalsIgnoreCase("a")) {
                eingabe1Int = 0;
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
        if (Arrays.asList(spielFeld[eingabe1Int][eingabe2-1]).contains(" ")) {
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
    public static void rechtschreibung() {
        String[] abc = {"A", "B", "C"};
        int[] zahl = {1,2,3};

        Scanner scanner1 = new Scanner(System.in);

        if (!Arrays.asList(abc).contains(eingabe1.toUpperCase())) {
            System.out.println("Rechtschreibfehler! Bitte geben Sie die Position nochmals ein.");
            System.out.println("Spalte:");
            eingabe1 = scanner1.next();
            rechtschreibung();
        }
        if (!(eingabe2 == 1 || eingabe2 == 2 || eingabe2 ==3)) {
            System.out.println(eingabe2);
            System.out.println("Rechtschreibfehler! Bitte geben Sie die Position nochmals ein.");
            System.out.println("Zeile:");
            eingabe2 = scanner1.nextInt();
            rechtschreibung();
        }
    }
    public static Boolean gleichstand() {
        counter += 1;
        System.out.println(counter);
        if (counter == 9) {
            return false;
        }
        return true;
    }
}
