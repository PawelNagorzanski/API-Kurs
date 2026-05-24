package org.api.zad9;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        String s = "Jan Nowak 150 25,3";
        Scanner input = new Scanner(s);
        
        String s1 = input.next(); // Imię
        String s2 = input.next(); // Nazwisko
        int a = input.nextInt(); // Godziny
        double b = input.nextDouble(); // Stawka
        
        System.out.printf("Pracownik: %s %s, Wynagrodzenie: %.2f\n", s1, s2, (a * b));
        
        input.close();
    }
}
