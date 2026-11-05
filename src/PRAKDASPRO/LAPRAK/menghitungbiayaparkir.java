package PRAKDASPRO.LAPRAK;
import java.util.Scanner;
public class menghitungbiayaparkir {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        
        System.out.println("jenis kendaraan yang ingin parkir. Pemilihan menggunakan angka(1,2,3): ");
        int pilihan=j.nextInt();

        String kendaraan;
    
        switch (pilihan) {
            case 1:
                kendaraan="sepeda";
                break;
            case 2:
                kendaraan="mobil";
                break;
            case 3:
                kendaraan="bus";
                break;
            default:
                System.out.println("jenis kendaraan tidak valid");
                return;
            }
            
            System.out.println("lama parkir: ");
            int lamaparkir=j.nextInt();
                
            int hargaparkir;
                
            if (kendaraan.equalsIgnoreCase("sepeda")) {
                if (lamaparkir <= 2) {
                    hargaparkir=3000;
                } else {
                    hargaparkir=5000;
                }
            }else if (kendaraan.equalsIgnoreCase("mobil")){
                if (lamaparkir <= 2) {
                    hargaparkir=5000;
                } else {
                    hargaparkir=10000;
                }
            }else if(kendaraan.equalsIgnoreCase("bus")){
                if (lamaparkir <= 2) {
                    hargaparkir=10000;
                } else {
                    hargaparkir=20000;
                }
            } else{
                hargaparkir=0;
                System.out.println("parkir tidak tersedia");
            }

            int biayaparkir=hargaparkir*lamaparkir;

               System.out.println("jenis kendaraan:"+kendaraan);
               System.out.println("biaya parkir="+biayaparkir);
    }
    
}
