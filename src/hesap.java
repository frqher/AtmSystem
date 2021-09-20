import java.util.Scanner;

public class hesap {
    private String isim = "null";
    private String sifre = "null";
    private boolean kayit_kontrol = false;
    private boolean giris_kontrol = false;

            

    public void hesap() {
        Scanner inp = new Scanner(System.in);

        while (true) {
            if (kayit_kontrol == false) {
                System.out.println("Kayıt sayfasına yönlendirildiniz.");

                System.out.print("Kullanıcı adı: ");
                this.isim = inp.nextLine();
                System.out.print("Şifre: ");
                this.sifre = inp.nextLine();
                this.kayit_kontrol = true;

                System.out.println("Kayıt başarılı.");
            }
            else if (kayit_kontrol == true) {
                System.out.println("Giriş sayfasına yönlendirildiniz.");
                System.out.print("Kullanıcı adı: ");
                String kadi = inp.nextLine();
                System.out.print("Şifre: ");
                String sadi = inp.nextLine();

                if ((this.isim.equals(kadi)) && (this.sifre.equals(sadi))) {
                    System.out.println("Başarıyla giriş yaptınız.");
                    this.giris_kontrol = true;
                    break;
                }
                else{
                    System.out.println("Kullanıcı adı veya şifre hatalı");
                }
            }
        }
    }
   



    public boolean getGiris_kontrol() {
        return giris_kontrol;
    }

    public void setGiris_kontrol(boolean giris_kontrol) {
        this.giris_kontrol = giris_kontrol;
    }
}
