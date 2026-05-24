package org.kurs.film13;

public class Film13 {
    public static void main(String[] args) {
        String[] owoce = {"Jabłko", "Banan", "Pomarańcza"};

        System.out.println("Klasyczna pętla for:");
        for (int i = 0; i < owoce.length; i++) {
            System.out.println("Indeks " + i + ": " + owoce[i]);
        }

        System.out.println("Pętla for-each:");
        for (String owoc : owoce) {
            System.out.println("Owoc: " + owoc);
        }
    }
}
