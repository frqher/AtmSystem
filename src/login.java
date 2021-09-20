import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        hesap hesap = new hesap();
        banka banka = new banka();
        
        while (true) {
            if (banka.getKapat() == true) {
                break;
            }
            if (banka.getDurum() == true) {
                return;
            }

            if (hesap.getGiris_kontrol() == false) {
                hesap.hesap();
            }
            else if (hesap.getGiris_kontrol() == true) {
                banka.banka();
            }
            
        }

    }

}
