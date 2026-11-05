package PRAKDASPRO.LAPRAK;
import java.util.Scanner;
public class pemesanantiket {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);

        System.out.println("pilih transportasi yang akan di tumpangi (kereta/bus/pesawat) input berupa angka(1,2,3):");
        int pilihan=j.nextInt();

        String kendaraan;
        double hargatiket;

     switch (pilihan) {
        case 1:
            kendaraan="bus";
            hargatiket=50000;
            break;
        case 2:
            kendaraan="kereta";
            hargatiket=100000;
            break;
        case 3:
            kendaraan="pesawat";
            hargatiket=500000;
            break;
        default:
            System.out.println("pilihan kendaraan tidak valid");
            return;
     }
        double diskon;
        

        // if (usia > 0) {
            System.out.println("masukkan usia penumpang: ");
            int usia=j.nextInt();    
           
            if (usia <= 12) {
            diskon=30;
            }else if  (usia > 12 && usia <= 59){
            diskon=0;
            }else{
            diskon=20;
            }
            
        // }else {
        //     System.out.println("pemesanan tiket tidak tersedia");
        // }

        double diskonpot=hargatiket*diskon/100;
        double totalbayar=hargatiket-diskonpot;

        System.out.println("kendaraan:"+kendaraan);
        System.out.println("harga dasar:"+hargatiket);
        System.out.println("diskon:"+diskon);
        System.out.println("total bayar:"+totalbayar);
        
    }
    
}
