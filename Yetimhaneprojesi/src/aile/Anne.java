package aile;

public class Anne extends Baba {
    private String anneIsmi;
    private String anneYasi;

    public void setAnneIsmi() {
        try {
            System.out.println("Annenin ismini giriniz:");
            this.anneIsmi = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Hatalı giriş! Lütfen doğru formatta bilgiler giriniz.");
        }
    }

    public void setAnneYasi() {
        try {
            System.out.println("Anne Olacak Kişinin Yaşını giriniz:");
            this.anneYasi = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Hatalı giriş! Lütfen doğru formatta bilgiler giriniz.");
        }
    }

    public String getAnneIsmi() {
        return anneIsmi;
    }

    public String getAnneYasi() {
        return anneYasi;
    }

}