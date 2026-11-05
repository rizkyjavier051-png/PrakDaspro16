// NAMA:JAVIER RIZKY AMARRAMADHAN
// NIM:264107020220
// ABSEN:16
// P=16,harga1=3000, harga2=5000, harga=15000, B=19, S=45
import java.util.Scanner;
public class UTS_Prakdaspro_1E {
    public static void main(String[] args) {
        Scanner j=new Scanner(System.in);

        System.out.println("masukkan berapa lembar");
        int lembar=j.nextInt();
        System.out.println("pilihan kode lembar(1/2/3):");
        int kode=j.nextInt();
        
        String pesan;
        String jenis;

        switch (kode) {
            case 1:
            jenis=foto 4r;
            int hargaperlembar=3000;
            break;
            case 2:
            jenis=foto5r;
            int hargaperlembar=5000;
            break;
            case 3:
                jenis=foto10r
            int hargaperlembar=15000;
            break;
            default:
                pesan="kode lembar tidak valid";
                return ;
        }
            int biaya;

if (45>=lembar) {
    pesan="mencapai batas";
}    if (lembar == 19) {
        if (kode == 1){ 
            biaya=3000*lembar;
        } else if (kode == 2){
        if (kode == 2){ 
            biaya=5000*lembar;
        } else if (kode == 2){
        if (kode == 3){ 
            biaya=15000*lembar;
        }

    }else{
        biaya+500;
    }
}else {
    double diskon=biaya*25/100;
}
    System.out.println();
    
}
