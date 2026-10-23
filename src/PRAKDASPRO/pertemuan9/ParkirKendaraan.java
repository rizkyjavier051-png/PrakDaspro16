package PRAKDASPRO.pertemuan9;
import java.util.Scanner;

public class ParkirKendaraan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int TARIFMOBIL = 3500; 
        int TARIFMOTOR = 2500;  

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();

                if (jenis == 1) {
                    total += durasi * TARIFMOBIL;
                } else {
                    total += durasi * TARIFMOTOR;
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);

    }
}