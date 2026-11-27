package MATDAS;

import java.util.Scanner;

public class faktorial {

    static long faktorial(int n) {
        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String teks = input.nextLine();

        int n = teks.length();
        long penyebut = 1;

        int[] frekuensi = new int[65536];

        for (int i = 0; i < n; i++) {
            frekuensi[teks.charAt(i)]++;
        }

        for (int jumlah : frekuensi) {
            if (jumlah > 1) {
                penyebut *= faktorial(jumlah);
            }
        }

        long hasil = faktorial(n) / penyebut;

        System.out.println(
            "Jumlah string berbeda: " + hasil
        );

        input.close();
    }
}
