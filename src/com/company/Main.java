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
        System.out.println(eingabe2 - 1);

    }
    public static Boolean ueberpruefung(Boolean spielen) {
        {
            char Winner = ' ';


            if (spielFeld[0][0] == "0" && spielFeld[0][1] == "0" && spielFeld[0][2] == "0") Winner = "0";
            if (spielFeld[1][0] == "0" && spielFeld[1][1] == "0" && spielFeld[1][2] == "0") Winner = "0";
            if (spielFeld[2][0] == "0" && spielFeld[2][1] == "0" && spielFeld[2][2] == "0") Winner = "0";
            if (spielFeld[0][0] == "0" && spielFeld[1][0] == "0" && spielFeld[2][0] == "0") Winner = "0";
            if (spielFeld[0][0] == "0" && spielFeld[0][1] == "0" && spielFeld[0][2] == "0") Winner = "0";
            if (spielFeld[0][1] == "0" && spielFeld[1][1] == "0" && spielFeld[2][1] == "0") Winner = "0";
            if (spielFeld[0][0] == "0" && spielFeld[0][1] == "0" && spielFeld[0][2] == "0") Winner = "0";
            if (spielFeld[0][0] == "0" && spielFeld[0][1] == "0" && spielFeld[0][2] == "0") Winner = "0";

            if (Winner == "0" )
            {System.out.println("Spieler 1 hat gewonnen!" );
                return Winner;
            }

            // Check if O wins
            if (po[1] == 'O' && posn[2] == 'O' && posn[3] == 'O') Winner = 'O';

            if (Winner == 'O' )
            {
                System.out.println( "Player2 wins the game." );
                return Winner; }

            // check for Tie
            for(int i=1;i<10;i++)
            {
                if(posn[i]=='X' || posn[i]=='O')
                {
                    if(i==9)
                    {
                        char Draw='D';
                        System.out.println(" Game is stalemate ");
                        return Draw;
                    }
                    continue;
                }
                else
                    break;

            }

            return Winner;
        }

    }
}
