package aile;

import cocuk.Cocuk;

import java.util.ArrayList;
import java.util.List;

public class Aile extends Anne {
    private String aileSoyadi;
    private String evinGeliri;
    private final List<Cocuk> cocuklar;

    public Aile() {
        cocuklar = new ArrayList<>();
    }

    public void setAileSoyadi() {
        try {
            System.out.println("Aile soyadınızı giriniz:");
            this.aileSoyadi = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Hatalı giriş! Lütfen doğru formatta bilgiler giriniz.");
        }
    }

    public void setEvinGeliri() {
        try {
            System.out.println("Evin gelirinizi giriniz:");
            this.evinGeliri = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Hatalı giriş! Lütfen doğru formatta bilgiler giriniz.");
        }
    }

    public void addCocuk(Cocuk cocuk) {
        this.cocuklar.add(cocuk);
    }

    public String getAileSoyadi() {
        return aileSoyadi;
    }

    public String getEvinGeliri() {
        return evinGeliri;
    }

    public List<Cocuk> getCocuklar() {
        return cocuklar;
    }

    public String toString() {
        return "Aile Soyadı: " + aileSoyadi + "\n" +
                "Evin Geliri: " + evinGeliri + "\n" +
                "Baba İsmi: " + getBabaIsmi() + "\n" +
                "Baba Yaşı: " + getBabaYasi() + "\n" +
                "Anne İsmi: " + getAnneIsmi() + "\n" +
                "Anne Yaşı: " + getAnneYasi() + "\n" +
                "Çocuklar: " + cocuklar + "\n";
    }
}
