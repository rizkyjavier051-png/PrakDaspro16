package pertemuan10;

import java.util.Scanner;
public class Ractangle16 {
    public static void main(String[] args) {
        Scanner javier = new Scanner(System.in);
        System.out.print("masukkan jumlah baris=");
        int baris=javier.nextInt();
        System.out.print("masukkan jumlah kolom=");
        int kolom=javier.nextInt();

        for (int i = 1; i <= kolom; i++) {
            for (int j = 1; j <= baris; j++) {
                System.out.print("*");
            }
        System.out.println();
    }
}
}
