package org.kurs.film5;

public class Film5 {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        y = 20;
        System.out.println("x: " + x + ", y: " + y);

        Osoba o1 = new Osoba("Jan");
        Osoba o2 = o1;
        o2.imie = "Anna";
        System.out.println("o1: " + o1.imie + ", o2: " + o2.imie);
    }
}

class Osoba {
    String imie;

    Osoba(String imie) {
        this.imie = imie;
    }
}
