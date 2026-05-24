package org.kurs.film12;

public class Film12 {
    public static void main(String[] args) {
        int licznik = 5;

        System.out.println("Pętla while:");
        while (licznik > 0) {
            System.out.println("Odliczanie: " + licznik);
            licznik--;
        }

        int j = 10;
        System.out.println("Pętla do-while (warunek od razu fałszywy):");
        do {
            System.out.println("Wykona się przynajmniej raz, wartość j: " + j);
            j++;
        } while (j < 10);
    }
}
