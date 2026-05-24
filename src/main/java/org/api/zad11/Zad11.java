package org.api.zad11;

import java.util.Scanner;

public class Zad11 {
    public static final String[] days = {"niedziela", "poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj datę w formacie dd.mm.rrrr: ");
        String data = input.next();

        int d = Integer.parseInt(data.substring(0, 2));
        int m = Integer.parseInt(data.substring(3, 5));
        int y = Integer.parseInt(data.substring(6, 10));

        int z, c;
        if (m == 1 || m == 2) {
            z = y - 1;
            c = 0;
        } else {
            z = y;
            c = 2;
        }

        int dt = (23 * m / 9 + d + 4 + y + z / 4 - z / 100 + z / 400 - c) % 7;

        System.out.println("Dzień tygodnia to: " + days[dt]);
        
        input.close();
    }
}
