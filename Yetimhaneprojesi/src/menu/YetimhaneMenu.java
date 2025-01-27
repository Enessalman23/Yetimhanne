package menu;

import detay.Bosluklar;
import detay.Yazdir;
import cocuk.Cocuk;
import menuMetot.Yetimhane;

import java.util.Scanner;

public class YetimhaneMenu implements Menu {
    private Yetimhane yetimhane;

    public YetimhaneMenu() {
        this.yetimhane = new Yetimhane();
    }

    @Override
    public void menuyuGoster() {
        Scanner scanner = new Scanner(System.in);
        Bosluklar.bosluk();
        Yazdir.yazdir();
        try {
            while (true) {
                System.out.println("Yetimhane İşlemleri");
                System.out.println("1 - Yetimhane Çocuk Ekle");
                System.out.println("2 - Yetimhane Çocuk Çıkar");
                System.out.println("3 - Çocukları Listele (Bebek)");
                System.out.println("4 - Çocukları Listele (Genç)");
                System.out.println("5 - Çocukları Listele (OrtaYaş)");
                System.out.println("0 - Ana Menü");
                System.out.print("Seçim yapınız: ");
                Yazdir.yazdir();
                int secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        try {
                            System.out.print("Çocuk Adı: ");
                            String cocukAdi = scanner.next();
                            System.out.print("Çocuk Yaş Grubu (Bebek/Genç/OrtaYaş): ");
                            String yasGrubu = scanner.next();
                            Cocuk cocuk = new Cocuk(cocukAdi, yasGrubu);
                            yetimhane.cocukEkle(cocuk);
                        } catch (Exception e) {
                            System.out.print("Hatalı giriş yaptınız!!!");
                        }
                        break;
                    case 2:
                        System.out.print("Silinecek Çocuğun Adı: ");
                        String silinecekCocukAdi = scanner.next();
                        yetimhane.cocukCikar(silinecekCocukAdi);
                        break;
                    case 3:
                        yetimhane.cocuklariListele("Bebek");
                        break;
                    case 4:
                        yetimhane.cocuklariListele("Genç");
                        break;
                    case 5:
                        yetimhane.cocuklariListele("OrtaYaş");
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Geçersiz seçim. Tekrar deneyin.");
                }
            }
        } catch (Exception e) {
            System.out.print("Hatalı giriş yaptınız!!!");
        }
    }

    public Yetimhane getYetimhane() {
        return yetimhane;
    }
}
