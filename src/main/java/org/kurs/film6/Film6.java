package org.kurs.film6;

public class Film6 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // Dla typów ref. stosujemy equals

        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b: " + (a == b));
        System.out.println("c == d: " + (c == d));
        System.out.println("c.equals(d): " + c.equals(d));
    }
}
