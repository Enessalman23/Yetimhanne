import detay.Detaylar;
import menu.AnaMenu;
import menu.EvlatEdinenMenu;
import menu.EvlatEdinmeMenu;
import menu.YetimhaneMenu;
import menu.BagisMenu;


public class Main {
    public static void main(String[] args) {
        Detaylar detaylar = new Detaylar();
        detaylar.baslangic();
        BagisMenu bagisMenu = new BagisMenu();
        EvlatEdinenMenu evlatEdinenMenu = new EvlatEdinenMenu();
        YetimhaneMenu yetimhaneMenu = new YetimhaneMenu();
        EvlatEdinmeMenu evlatEdinmeMenu = new EvlatEdinmeMenu();

        AnaMenu anaMenu = new AnaMenu(evlatEdinenMenu, yetimhaneMenu, evlatEdinmeMenu ,bagisMenu);
        anaMenu.menuyuGoster();
        detaylar.bitis();
    }
}