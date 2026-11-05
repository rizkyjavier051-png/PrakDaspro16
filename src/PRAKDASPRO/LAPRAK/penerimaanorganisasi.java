package PRAKDASPRO.LAPRAK;
import java.util.Scanner;

public class penerimaanorganisasi {
    public static void main(String[] args) {
        Scanner jav = new Scanner(System.in);

        System.out.print("Namamu: ");
        String nama = jav.nextLine();

        System.out.print("Semester: ");
        int semester = jav.nextInt();
        jav.nextLine(); // buang sisa Enter di buffer

        System.out.print("Pilihan organisasi (BEM/HIMA/UKM): ");
        String pilihan = jav.nextLine().trim().toLowerCase();

        String pesan;
        double ipk;

        switch (pilihan) {
            case "bem":
                if (semester > 2) {
                    System.out.print("IPK: ");
                    ipk = jav.nextDouble();
                    if (ipk >= 3.0) {
                        pesan = "diterima";
                    } else {
                        pesan = "ditolak (IPK kurang)";
                    }
                } else {
                    pesan = "ditolak (masih maba)";
                }
                break;

            case "hima":
                if (semester == 1) {
                    System.out.print("IPK: ");
                    ipk = jav.nextDouble();
                    if (ipk >= 2.75) {
                        pesan = "diterima";
                    } else {
                        pesan = "ditolak (IPK kurang)";
                    }
                } else {
                    pesan = "ditolak (masih maba)";
                }
                break;

            case "ukm":
                System.out.print("Memiliki KTM (udah/belum): ");
                String ktm = jav.nextLine().trim();
                if (ktm.equalsIgnoreCase("udah")) {
                    pesan = "diterima";
                } else {
                    pesan = "ditolak (belum punya KTM)";
                }
                break;

            default:
                pesan = "organisasi tidak valid";
                break;
        }

        System.out.println("\nHalo, " + nama + "!");
        System.out.println("Hasil pendaftaran " + pilihan.toUpperCase() + ": " + pesan);

        // jav.close();
    }
}