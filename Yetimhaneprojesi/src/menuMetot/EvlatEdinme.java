package menuMetot;

import aile.Aile;
import cocuk.Cocuk;

import java.util.ArrayList;
import java.util.List;

public class EvlatEdinme {

    public List<Aile> evlatEdinenAileler;

    public EvlatEdinme() {
        this.evlatEdinenAileler = new ArrayList<>();
    }

    public void evlatEdin(Aile aile, Cocuk cocuk) {
        cocuk.setEvlatEdinildiMi(true);
        aile.addCocuk(cocuk);
        evlatEdinenAileler.add(aile);
        System.out.println(aile.getAileSoyadi() + " adlı aile " + cocuk.getCocukIsmi() + " adlı çocuğu evlat edindi.");
    }

    public void bilgileriGoster() {
        System.out.println("Evlat Edinme Bilgileri");
        System.out.println("-----------------------");

        for (Aile aile : evlatEdinenAileler) {
            System.out.println(aile.toString());
            System.out.println("-----------------------");
        }
    }
}
