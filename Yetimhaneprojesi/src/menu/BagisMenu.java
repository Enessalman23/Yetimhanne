package menu;
import detay.*;
import menuMetot.Bagislar;



import java.util.Scanner;

public class BagisMenu implements Menu{

    private BagislarList bagislarList;
    public BagisMenu() {
       this.bagislarList = new BagislarList();
    }
    @Override
    public void menuyuGoster() {
        Scanner scanner = new Scanner(System.in);
        Bosluklar.bosluk();
        Yazdir.yazdir();
        try {


            while (true) {
                System.out.println("Bağış İşlemleri");
                System.out.println("1 - Bağışcı Ekle");
                System.out.println("2 - Bağışta Bulunanları Listele");
                System.out.println("0 - Ana Menü");
                Yazdir.yazdir();
                int secim = scanner.nextInt();
                switch (secim) {
                    case 1:

                        try {
                            System.out.print("Bağışcı Adı: ");
                            String bagisciAd = scanner.next();
                            System.out.print("Bağışcı Soyadı:");
                            String bagisSoyad = scanner.next();
                            System.out.print("Bağış Miktarı:");
                            String bagisMiktari = scanner.next();

                            Bagislar bagislar = new Bagislar(bagisciAd, bagisSoyad, bagisMiktari);
                            bagislarList.bagisEkleme(bagislar);

                        } catch (Exception e) {
                            System.out.print("Hatalı giriş yaptınız!!!");
                        }
                        break;
                    case 2:
                        bagislarList.bagislariListele();
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

}