package org.kurs.film2;

public class Film2 {
    public static void main(String[] args) {
        System.out.println("--- Szczegóły instalacji Javy (JDK vs OpenJDK) ---");
        System.out.println("Wersja Javy: " + System.getProperty("java.version"));
        System.out.println("Dostawca Javy: " + System.getProperty("java.vendor"));
        System.out.println("Nazwa maszyny wirtualnej: " + System.getProperty("java.vm.name"));
        System.out.println("Katalog domowy Javy (JAVA_HOME): " + System.getProperty("java.home"));
    }
}
