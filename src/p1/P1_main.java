package p1;

import java.util.Scanner;

public class P1_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib eine Zahl zwischen 1 und 6 ein: ");
        int wuerfel = input.nextInt();
        System.out.print("Du hast dich für die Zahl" + wuerfel + " entschieden und hast ");

        if (wuerfel == 1 || wuerfel == 4) {
            System.out.println("gewonnen!");
        } else if (wuerfel == 2) {
            System.out.println("leider verloren :(");
        } else if (wuerfel == 5) {
            System.out.println("unentschieden gespielt");
        } else {
            System.out.println("ein unbekanntes Ergebnis");
        }
    }
}
