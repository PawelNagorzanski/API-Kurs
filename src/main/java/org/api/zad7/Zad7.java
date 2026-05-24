package org.api.zad7;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        
        double celsius = input.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        
        // Symbol stopnia \u00B0
        System.out.printf("Temperatura wynosi: %.1f\u00B0F\n", fahrenheit);
        
        input.close();
    }
}
