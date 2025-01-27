package menu;

import detay.Bosluklar;
import detay.Yazdir;

import java.util.Scanner;

public class AnaMenu implements Menu {
    private EvlatEdinenMenu evlatEdinenMenu;
    private YetimhaneMenu yetimhaneMenu;
    private EvlatEdinmeMenu evlatEdinmeMenu;
    private BagisMenu bagisMenu;

    public AnaMenu(EvlatEdinenMenu evlatEdinenMenu, YetimhaneMenu yetimhaneMenu, EvlatEdinmeMenu evlatEdinmeMenu, BagisMenu bagisMenu) {
        this.evlatEdinenMenu = evlatEdinenMenu;
        this.yetimhaneMenu = yetimhaneMenu;
        this.evlatEdinmeMenu = evlatEdinmeMenu;
        this.bagisMenu=bagisMenu;
    }

    @Override
    public void menuyuGoster() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Bosluklar.bosluk();
            Yazdir.yazdir();
            System.out.println("Ana Ekran");
            System.out.println("1 - Evlat Edinen Bilgileri");
            System.out.println("2 - Yetimhane İşlemleri");
            System.out.println("3 - Evlat edinme işlemleri");
            System.out.println("4 - Bağış işlemleri");
            System.out.println("0 - Çıkış");
            System.out.print("Seçim yapınız: ");
            int secim = scanner.nextInt();
            Yazdir.yazdir();
            Bosluklar.bosluk(1);


            switch (secim) {
                case 1:
                    evlatEdinenMenu.menuyuGoster();
                    break;
                case 2:
                    yetimhaneMenu.menuyuGoster();
                    break;

                case 3:
                    evlatEdinmeMenu.menuyuGoster(evlatEdinenMenu.getEvlatEdinme().getAileler(), yetimhaneMenu.getYetimhane().getCocuklar());
                    break;
                case 4:
                    bagisMenu.menuyuGoster();
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }
    }
}