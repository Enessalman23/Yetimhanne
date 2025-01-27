package menu;

import aile.Aile;
import detay.Bosluklar;
import detay.Yazdir;
import menuMetot.EvlatEdinen;

import java.util.Scanner;

public class EvlatEdinenMenu implements Menu {

    private final EvlatEdinen evlatEdinen;

    public EvlatEdinenMenu() {
        this.evlatEdinen = new EvlatEdinen();
    }

    @Override
    public void menuyuGoster() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Yazdir.yazdir();
            try {
                System.out.println("Evlat Edinen Bilgileri");
                System.out.println("1 - Aile Ekle");
                System.out.println("2 - Bilgileri Göster");
                System.out.println("0 - Ana Menü");
                System.out.print("Seçim yapınız: ");
                int secim = scanner.nextInt();

                Bosluklar.bosluk(1);
                Yazdir.yazdir();

                switch (secim) {
                    case 1:
                        Aile aile = new Aile();
                        aile.setAileSoyadi();
                        aile.setEvinGeliri();
                        aile.setBabaIsmi();
                        aile.setBabaYasi();
                        aile.setAnneIsmi();
                        aile.setAnneYasi();
                        evlatEdinen.aileEkle(aile);
                        break;
                    case 2:
                        evlatEdinen.bilgileriGoster();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Geçersiz seçim. Tekrar deneyin.");
                }
            } catch (Exception e) {
                System.out.print("Hatalı giriş yaptınız!!!");
            }
        }
    }

    public EvlatEdinen getEvlatEdinme() {
        return evlatEdinen;
    }
}
