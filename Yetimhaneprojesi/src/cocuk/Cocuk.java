package cocuk;

public class Cocuk {

    private String cocukIsmi;
    private String yasGrubu; //Bebek, Genç, ortayaş

    private boolean evlatEdinildiMi;
    public Cocuk(String cocukIsmi, String yasGrubu) {
        this.cocukIsmi = cocukIsmi;
        this.yasGrubu = yasGrubu;
        this.evlatEdinildiMi = false;
    }

    public String getCocukIsmi() {
        return cocukIsmi;
    }

    public String getYasGrubu() {
        return yasGrubu;
    }

    public boolean getEvlatEdinildiMi() {
        return evlatEdinildiMi;
    }

    public void setEvlatEdinildiMi(boolean evlatEdinildiMi) {
        this.evlatEdinildiMi = evlatEdinildiMi;
    }

    public String toString() {
        String evlatEdinildiMi = this.getEvlatEdinildiMi() ? "Evet" : "Hayır";
        return "Cocuk ismi: " + this.getCocukIsmi() + ", Yas grubu: " + this.getYasGrubu() + ", Evlat edinildi mi: " + evlatEdinildiMi;
    }

}