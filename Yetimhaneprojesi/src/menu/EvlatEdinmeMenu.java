package menu;

import aile.Aile;
import detay.Bosluklar;
import detay.Yazdir;
import cocuk.Cocuk;
import menuMetot.EvlatEdinme;

import java.util.List;
import java.util.Scanner;

public class EvlatEdinmeMenu {

    private final EvlatEdinme evlatEdinme;

    public EvlatEdinmeMenu() {
        this.evlatEdinme = new EvlatEdinme();
    }

    public void menuyuGoster(List<Aile> aileler, List<Cocuk> cocuklar) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Yazdir.yazdir();
            try {
                System.out.println("Evlat Edinme İşlemler");
                System.out.println("1 - Evlat edindir");
                System.out.println("2 - Bilgileri Göster");
                System.out.println("0 - Ana Menü");
                System.out.print("Seçim yapınız: ");
                int secim = scanner.nextInt();

                Bosluklar.bosluk(1);
                Yazdir.yazdir();

                switch (secim) {
                    case 1:
                        System.out.print("Çocuk Ismi: ");
                        String cocukIsmi = scanner.next();
                        Cocuk cocuk = cocukBul(cocukIsmi, cocuklar);
                        if (cocuk == null) {
                            System.out.println("Çocuk bulunamadı.");
                            break;
                        }
                        if (cocuk.getEvlatEdinildiMi()) {
                            System.out.println("Bu çocuk zaten evlat edinilmiş.");
                            break;
                        }

                        System.out.print("Aile Soyadı: ");
                        String aileSoyadi = scanner.next();
                        Aile aile = aileBul(aileSoyadi, aileler);
                        if (aile == null) {
                            System.out.println("Aile bulunamadı.");
                            break;
                        }

                        evlatEdinme.evlatEdin(aile, cocuk);
                        break;
                    case 2:
                        evlatEdinme.bilgileriGoster();
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

    private Cocuk cocukBul(String cocukIsmi, List<Cocuk> cocuklar) {
        for (Cocuk cocuk : cocuklar) {
            if (cocuk.getCocukIsmi().equalsIgnoreCase(cocukIsmi)) {
                return cocuk;
            }
        }
        return null;
    }

    private Aile aileBul(String aileSoyadi, List<Aile> aileler) {
        for (Aile aile : aileler) {
            if (aile.getAileSoyadi().equalsIgnoreCase(aileSoyadi)) {
                return aile;
            }
        }
        return null;
    }
}
