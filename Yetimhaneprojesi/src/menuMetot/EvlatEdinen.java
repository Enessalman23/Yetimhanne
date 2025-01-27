package menuMetot;

import aile.Aile;

import java.util.ArrayList;
import java.util.List;

public class EvlatEdinen {
    private final List<Aile> aileler;

    public EvlatEdinen() {
        this.aileler = new ArrayList<>();
    }

    public void aileEkle(Aile aile) {
        aileler.add(aile);
        System.out.println(aile.getAileSoyadi() + " adlı aile yetimhaneye evlat edinmek için kaydoldu.");
    }

    public void bilgileriGoster() {
        System.out.println("Evlat Edinen Bilgileri");
        System.out.println("-----------------------");

        for (Aile aile : aileler) {
            System.out.println(aile.toString());
            System.out.println("-----------------------");
        }
    }

    public List<Aile> getAileler() {
        return aileler;
    }
}