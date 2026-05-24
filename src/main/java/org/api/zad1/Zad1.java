package org.api.zad1;

public class Zad1 {
    public static void main(String[] args) {
        System.out.println("Kody liczbowe i odpowiadające im znaki:");
        for (int i = 48; i <= 124; i++) {
            System.out.println("kod " + i + " odpowiada znakowi: " + (char) i);
        }
        
        System.out.print("\nDowolny napis z kodów (np. JAVA): ");
        System.out.print((char)74); // J
        System.out.print((char)65); // A
        System.out.print((char)86); // V
        System.out.print((char)65); // A
        System.out.println();
    }
}
