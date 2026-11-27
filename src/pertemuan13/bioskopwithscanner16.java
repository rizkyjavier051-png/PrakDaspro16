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
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();
                    
                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
        }

    }
}
}

