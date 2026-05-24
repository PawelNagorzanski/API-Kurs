package org.api.zad10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) throws IOException {
        File f = new File("dane.txt");
        Scanner input = new Scanner(f);
        
        while (input.hasNext()) {
            String s1 = input.next();
            String s2 = input.next();
            int a = input.nextInt();
            double b = input.nextDouble();
            
            System.out.printf("Pracownik: %s %s, Wynagrodzenie: %.2f\n", s1, s2, (a * b));
        }
        
        input.close();
    }
}
