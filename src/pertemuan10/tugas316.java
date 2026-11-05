package pertemuan10;
import java.util.Scanner;

public class tugas316 {

    static int bacaAngka(Scanner in, String pesan, int minimal) {
        int nilai;
        while (true) {
            System.out.print(pesan);
            nilai = in.nextInt();
            if (nilai >= minimal) {
                return nilai;
            }
            System.out.println("  Input tidak valid! Nilai minimal " + minimal + ".");
        }
    }

    public static void main(String[] args) {
        Scanner javier = new Scanner(System.in);

        int jumlahToko = bacaAngka(javier, "Masukkan jumlah toko: ", 1);

        int totalSemuaBarang = 0;
        int maxBarang = -1;      
        int tokoTerbanyak = 0;

        for (int t = 1; t <= jumlahToko; t++) {
            System.out.println("\n=== Toko " + t + " ===");
            int jumlahPelanggan = bacaAngka(javier, "Jumlah pelanggan: ", 0);

            int barangToko = 0;
            for (int p = 1; p <= jumlahPelanggan; p++) {
                int barang = bacaAngka(javier, "  Jumlah barang pelanggan " + p + ": ", 0);
                barangToko += barang;
            }

            System.out.println("Toko " + t + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + barangToko);

            totalSemuaBarang += barangToko;

            if (barangToko > maxBarang) {
                maxBarang = barangToko;
                tokoTerbanyak = t;
            }
        }

        System.out.println("\nTotal barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        javier.close();
    }
}