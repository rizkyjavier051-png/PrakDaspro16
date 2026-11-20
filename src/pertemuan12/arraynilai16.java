package pertemuan12;
import java.util.Scanner;
public class arraynilai16 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
        //     System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        // }
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     if (nilaiAkhir[i] > 70) {
        //     System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
        //     }
        // }
        int jmlLulus = 0, jmlTidak = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) jmlLulus++;
            else jmlTidak++;
            }
        System.out.println("Jumlah LULUS       : " + jmlLulus);
        System.out.println("Jumlah TIDAK LULUS : " + jmlTidak);

    }
}