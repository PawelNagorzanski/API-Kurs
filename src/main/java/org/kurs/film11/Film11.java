package org.kurs.film11;

public class Film11 {
    public static void main(String[] args) {
        int[] liczby = new int[5];
        liczby[0] = 10;
        liczby[1] = 20;
        liczby[2] = 30;
        liczby[3] = 40;
        liczby[4] = 50;

        System.out.println("Pierwszy element: " + liczby[0]);
        System.out.println("Długość tablicy: " + liczby.length);

        String[] imiona = {"Jan", "Anna", "Maria"};
        System.out.println("Drugie imię w tablicy: " + imiona[1]);

        imiona[1] = "Katarzyna";
        System.out.println("Zmienione drugie imię: " + imiona[1]);
    }
}
