package PRAKDASPRO.LAPRAK;
import java.util.Scanner;
public class menentukandiskon {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        System.out.println("Jenis pelanggan(member/Non-member/VIP/):");
        String pelanggan=j.nextLine();

        int harga;
        int diskon;
        
        if (pelanggan.equalsIgnoreCase("member")) {
            System.out.println("masukkan harga belanjaan:");
            harga=j.nextInt();
            
            if (harga > 500000) {
                diskon=10;
            } else {
                diskon=5;
            }
        } else if (pelanggan.equalsIgnoreCase("non member")){
            System.out.println("masukkan harga belanjaan:");
            harga=j.nextInt();

            if (harga > 1000000) {
                diskon=5;
            }else{
                diskon=0;
            }
        } else if (pelanggan.equalsIgnoreCase("vip")){
            System.out.println("masukkan harga belanjaan:");
            harga=j.nextInt();

            if (harga > 500000) {
                diskon=20;
            }else{
                diskon=15;
            }
        }else{
            System.out.println("langganan tidak valid");
            return;
        }

        int potdiskon=harga*diskon/100;
        int totalbiaya=harga-potdiskon;

        System.out.println("diskon:"+diskon);
        System.out.println("mendapatkan potongan harga:"+potdiskon);
        System.out.println("total biaya yang harus di bayar:"+totalbiaya);
    }
    
}
