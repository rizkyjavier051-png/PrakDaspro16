package pertemuan9;
import java.util.Scanner;
public class SIAKADWHILE16 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int jml, nilai;
        int i=0;
        System.out.println("masukkan jumlah mahasiswa:");
        jml=j.nextInt();
        while (i < jml) {
            System.out.println("masukkkan nilai mahasiswa ke "+(i+1)+":");
            nilai=j.nextInt();
            if (nilai<0 || nilai >100) {
                System.out.println("nilai tidak valid");
            }
            if (nilai > 85 && nilai <= 100) {
                System.out.println("nilai mahasiswa ke "+(i+1)+" adalah A");
                System.out.println("bagus pertahankan nilainya");
            }else if (nilai >73 && nilai <=80){
            System.out.println("nilai mahasiswa ke "+(i+1)+" adalah B+");
            }else if (nilai >65 && nilai <=73){
            System.out.println("nilai mahasiswa ke "+(i+1)+" adalah B");
            }else if (nilai >60 && nilai <=65){
            System.out.println("nilai mahasiswa ke "+(i+1)+" adalah C+");
            }else if (nilai >50 && nilai <=60){
            System.out.println("nilai mahasiswa ke "+(i+1)+" adalah C");
            }else if (nilai >39 && nilai <=50){
            System.out.println("nilai mahasiswa ke "+(i+1)+" adalah D");
            }else {
                System.out.println("nilai mahasiswa ke "+(i+1)+" adalah E");
            }
            i++;
        }
    }
    
}
