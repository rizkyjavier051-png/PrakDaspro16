package pertemuan13;

import java.util.Scanner;

public class bioskopwithscanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

         while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextLine().trim();

            if (pilihan.equals("1")) {
                // Langkah 2 (input berulang)
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    // No.3 (validasi baris/kolom) & No.4 (cek kursi terisi)
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();

                        if (baris < 1 || baris > penonton.length
                                || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Kursi tidak tersedia! Baris 1-" + penonton.length
                                    + ", kolom 1-" + penonton[0].length + ".");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh "
                                    + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain!");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();
                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }

                } else if (pilihan.equals("2")) {
                System.out.println("\nDaftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.printf("%-10s", isi);
                    }
                    System.out.println();
                }
            } else if (pilihan.equals("3")) {
                System.out.println("Terima kasih.");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}

    


