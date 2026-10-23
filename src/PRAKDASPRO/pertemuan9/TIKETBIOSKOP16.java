package PRAKDASPRO.pertemuan9;
import java.util.Scanner;
public class TIKETBIOSKOP16 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int hargatiket=48000, totaltiket=0, pelanggan=0, jumlah, totalpenjualan=0;
        double totalharga;
        while (true) {
            System.out.print("Jumlah tiket pelanggan ke-" + (pelanggan + 1) + ": ");
            jumlah = j.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid, silakan input ulang.");
                continue; 
            }
            if (jumlah == 0) {
                break;
            }

            int diskon=0;
            if (jumlah > 8) {
                diskon = 9;
            } else if (jumlah > 4) {
                diskon = 15;
            }

            int hargakotor=jumlah*hargatiket;
            int potongan=hargakotor*diskon/100;
            int hargabersih=hargakotor-potongan;

            System.out.println("harga:"+hargakotor);
            System.out.println("diskon "+diskon+"% ");
            System.out.println("total harga:"+hargabersih);

            totaltiket += jumlah;
            totalpenjualan += hargabersih;
            pelanggan++;
        }
        System.out.println("total tiket:"+totaltiket);
        System.out.println("total penjualan:"+totalpenjualan);
    }
}
