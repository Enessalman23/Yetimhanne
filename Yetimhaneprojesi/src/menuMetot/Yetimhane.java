package menuMetot;

import cocuk.Cocuk;

import java.util.ArrayList;
import java.util.List;

public class Yetimhane {

    private final List<Cocuk> cocuklar;

    public Yetimhane() {
        this.cocuklar = new ArrayList<>();
    }

    public void cocukEkle(Cocuk cocuk) {
        this.cocuklar.add(cocuk);
        System.out.println(cocuk.getCocukIsmi());
    }

    public void cocukCikar(String cocukIsmi) {
        for (Cocuk cocuk : cocuklar) {
            if (cocuk.getCocukIsmi().equalsIgnoreCase(cocukIsmi)) {
                this.cocuklar.remove(cocuk);
                System.out.println(cocukIsmi + " adlı çocuk yetimhaneden çıkarıldı.");
                return;
            }
        }
        System.out.println(cocukIsmi + " adlı çocuk yetimhanede bulunamadı.");
    }

    public void cocuklariListele(String yasGrubu) {
        System.out.println(yasGrubu + " Çocuklar:");
        for (Cocuk cocuk : cocuklar) {
            if (cocuk.getYasGrubu().equalsIgnoreCase(yasGrubu)) {
                System.out.println(cocuk);
            }
        }
    }

    public List<Cocuk> getCocuklar() {
        return cocuklar;
    }
}