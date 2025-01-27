package menu;

import menuMetot.Bagislar;

import java.util.ArrayList;
import java.util.List;

public class BagislarList {
        private List<Bagislar> bagislarListesi;
    public BagislarList(){
    this.bagislarListesi=new ArrayList<>();
    }
        public List<Bagislar> getBagisListesi() {
            return this.bagislarListesi;
        }

        public void bagisEkleme(Bagislar bagislar) {
            try {
                bagislarListesi.add(bagislar);
                System.out.println(bagislar.getBagisciAd());
            } catch (Exception e) {
                System.out.print("Hatali Giriş Yaptınız!!!");
            }
        }

        public void bagislariListele() {
            List<Bagislar> bagislarListesi = getBagisListesi();

            if (bagislarListesi.isEmpty()) {
                System.out.println("Henüz bağış yapılmamış.");
            } else {
                System.out.println("Bağışta Bulunanlar:");
                for (Bagislar bagis : bagislarListesi) {
                    System.out.println("Ad: " + bagis.getBagisciAd() + ", Soyad: " + bagis.getBagisSoyad() + ", Miktar: " + bagis.getBagisMiktari());
                }
            }
        }
    }

