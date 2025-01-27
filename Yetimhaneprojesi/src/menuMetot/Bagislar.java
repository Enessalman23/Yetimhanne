package menuMetot;

public class Bagislar {

    private String bagisciAd;
    private String bagisSoyad;
    private String bagisMiktari;


    public Bagislar(String bagisciAd, String bagisSoyad, String bagisMiktari) {
        this.bagisciAd = bagisciAd;
        this.bagisSoyad = bagisSoyad;
        this.bagisMiktari = bagisMiktari;

    }

    public String getBagisciAd() {
        return bagisciAd;
    }

    public String getBagisSoyad() {
        return bagisSoyad;
    }

    public String getBagisMiktari() {
        return bagisMiktari;
    }

    public String toString() {
        return "Bağışcı Adı: " + this.getBagisciAd() + " Bağışcı Soyadı: " + this.getBagisSoyad() + " Bağış Miktarı: " + this.getBagisMiktari();
    }
}
