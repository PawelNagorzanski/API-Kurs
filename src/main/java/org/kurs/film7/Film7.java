package org.kurs.film7;

public class Film7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println("Suma: " + (x + y));
        System.out.println("Różnica: " + (x - y));
        System.out.println("Iloczyn: " + (x * y));
        System.out.println("Iloraz: " + (x / y));
        System.out.println("Reszta (modulo): " + (x % y));

        int a = 5;
        System.out.println("Inkrementacja post: " + a++);
        System.out.println("Po inkrementacji: " + a);
        System.out.println("Inkrementacja pre: " + ++a);

        int b = 10;
        b += 5;
        System.out.println("b += 5: " + b);

        System.out.println("10 == 3: " + (x == y));
        System.out.println("10 != 3: " + (x != y));
        System.out.println("10 > 3: " + (x > y));
    }
}
