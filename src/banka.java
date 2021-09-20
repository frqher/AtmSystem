import java.util.Scanner;

public class banka {
    private double bakiye = 0.0;
    private boolean kapat = false;
    private boolean durum = false;

    public void banka(){
        Scanner inp = new Scanner(System.in);
        String bilgi = "*************************"
                     + "\nPara çekme işlemi 1"
                     + "\nPara yatırma işlemi 2"
                     + "\nBakiye görüntüleme işlemi 3"
                     + "\nÇıkış işlemi 4"
                     + "\n*************************";

        while(true){
            this.durum = true;
            System.out.println(bilgi);
            System.out.print("İşlem giriniz: ");
            String islem = inp.nextLine();

            if (islem.equals("1")) {
                System.out.print("Çekilecek miktar: ");
                double bakiye = inp.nextDouble();
                cekBakiye(bakiye);
            }
            else if (islem.equals("2")) {
                System.out.print("Yatırılıcak miktar: ");
                double bakiye = inp.nextDouble();
                setBakiye(bakiye);
            }
            else if (islem.equals("3")) {
                getBakiye();
            }
            else if (islem.equals("4")) {
                System.out.println("Sistem kapatıldı.");
                setKapat(true);
                break;
            }
        }
    }

    public void getBakiye() {
        System.out.println("Güncel bakiyeniz: " + this.bakiye);
    }

    public void setBakiye(double bakiye) {
        this.bakiye += bakiye;
        System.out.println("Güncel bakiyeniz: " + this.bakiye);
    }
    public void cekBakiye(double bakiye) {
       if ((this.bakiye < bakiye)) {
            System.out.println("Yetersiz bakiye.");
            System.out.println("Bakiyeniz: " + this.bakiye);
       }
       else if (bakiye > 1500.0) {
            System.out.println("Günlük sadece 1500TL Çeke bilirsiniz");
       }
       else{
           this.bakiye -= bakiye;
           System.out.println("Para başarıyla çekildi, çekilen tutar: " + bakiye);
           System.out.println("Güncel bakiye: " + this.bakiye);
       }
    }

    public boolean getKapat() {
        return kapat;
    }


    public void setKapat(boolean kapat) {
        this.kapat = kapat;
    }

    public boolean getDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }


}
