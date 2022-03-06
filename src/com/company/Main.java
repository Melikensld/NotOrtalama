package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = sc.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = sc.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = sc.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = sc.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = sc.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = sc.nextInt();

        double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Ortalamanız : " +ort);

        String durum = (ort >= 60) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(durum);
    }
}
