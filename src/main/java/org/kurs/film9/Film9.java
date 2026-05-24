package org.kurs.film9;

import java.util.Scanner;
import java.util.prefs.Preferences;

public class Film9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj punkty:");
        int punkty = scanner.nextInt();

        if (punkty >= 90) {
            System.out.println("Ocena: Bardzo dobry (5.0)");
        } else if (punkty >= 80) {
            System.out.println("Ocena: Ponadprzeciętny (4.5)");
        } else if (punkty >= 70) {
            System.out.println("Ocena: Dobry (4.0)");
        } else if (punkty >= 60) {
            System.out.println("Ocena: Dostateczny (3.0)");
        } else {
            System.out.println("Ocena: Niedostateczny (2.0)");
        }

        boolean zdanaTeoria = true;
        boolean zdanaPraktyka = false;

        if (zdanaTeoria && zdanaPraktyka) {
            System.out.println("Gratulacje! Zdałeś egzamin.");
        } else if (zdanaTeoria || zdanaPraktyka) {
            System.out.println("Musisz poprawić jeden z etapów.");
        } else {
            System.out.println("Niestety, oba etapy do poprawy.");
        }
    }
}
