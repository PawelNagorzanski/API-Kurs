package org.kurs.film8;

import java.util.Arrays;
import java.util.Scanner;

public class Film8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość A prostokąta");
        double sideLengthA = scanner.nextDouble();
        System.out.println("Podaj długość B prostokąta");
        double sideLengthB = scanner.nextDouble();
        System.out.println("Pole prostokąta: " + (sideLengthA * sideLengthB));

        scanner.close();
    }
}
