package aile;

import java.util.Scanner;

public class Baba {
    Scanner scanner = new Scanner(System.in);
    private String babaIsmi;
    private String babaYasi;


    public void setBabaIsmi() {
        try {
            System.out.println("Babanın İsmini giriniz:");
            this.babaIsmi = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Hatalı giriş! Lütfen doğru formatta bilgiler giriniz.");
        }
    }
    public void setBabaYasi() {
        try {
            System.out.println("Baba Olacak Kişinin Yaşını giriniz:");
            this.babaYasi = scanner.nextLine();

        } catch (Exception e) {
            System.out.println("Hatalı giriş! Lütfen doğru formatta bilgiler giriniz.");
        }
    }

    public String getBabaIsmi() {
        return babaIsmi;
    }

    public String getBabaYasi() {
        return babaYasi;
    }
}