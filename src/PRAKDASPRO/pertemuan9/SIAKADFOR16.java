package PRAKDASPRO.pertemuan9;
import java.util.Scanner;
public class SIAKADFOR16 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        int jmlMahasiswa= 8+(16%5);
        int batasKelulusan=55+(16%11);
        double nilai, tertinggi=0, terendah=100;
        int jmlMahasiswalulus=0;
        int jmlhtdklulus=0;
        for (int i = 1; i <=jmlMahasiswa; i++) {
            System.out.println("masukkan nilai mahasisawa"+ i+":");
            nilai=j.nextDouble();
         if (nilai > tertinggi) {
            tertinggi=nilai;
         }if (nilai < terendah) {
            terendah=nilai;
         }if (nilai >= batasKelulusan) {
            jmlMahasiswalulus++;
         }if (nilai <= batasKelulusan) {
            jmlhtdklulus++;
         }
         }   
         System.out.println("nilai tertinggi:"+tertinggi);
         System.out.println("nilai terendah:"+terendah);
         System.out.println("jumlah mahasiswa yang lulus:"+jmlMahasiswalulus);
         System.out.println("jumlah mahasiswa yang tidak lulus:"+jmlhtdklulus);
        }
    }


