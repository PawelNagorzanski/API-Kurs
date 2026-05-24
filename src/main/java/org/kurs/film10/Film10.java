package org.kurs.film10;

public class Film10 {
    public static void main(String[] args) {
        int dzienTygodnia = 3;

        switch (dzienTygodnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
            case 7:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Niepoprawny dzień tygodnia.");
                break;
        }

        String owoc = "Jabłko";
        switch (owoc) {
            case "Jabłko" -> System.out.println("To jest jabłko.");
            case "Banan" -> System.out.println("To jest banan.");
            default -> System.out.println("Inny owoc.");
        }
    }
}
