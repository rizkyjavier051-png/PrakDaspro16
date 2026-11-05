package PRAKDASPRO.LAPRAK;

import java.util.Scanner;

public class penentuankategoribeasiswa {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        System.out.println("nama:");
        String nama = j.nextLine();
        System.out.println("jenis beasiswa (ekonomi/akademi/prestasi):");
        String jenis = j.nextLine().toLowerCase();

        String pesan;

        switch (jenis) {
            case "ekonomi":
                System.out.println("penghasilan orangtua:");
                int orangtua = Integer.parseInt(j.nextLine().trim());

                if (orangtua <= 2000000) {
                    System.out.println("ipk:");
                    double ipk = Double.parseDouble(j.nextLine().replace(",", "."));

                    if (ipk >= 3.50) {
                        pesan = "ipk cukup, beasiswa diberikan";
                    } else {
                        pesan = "ipk tidak cukup, beasiswa tidak diberikan";
                    }
                } else {
                    pesan = "tidak memenuhi ketentuan maksimal penghasilan ortu";
                }
                break;

            case "prestasi":
                System.out.println("ipk:");
                double ipkPrestasi = Double.parseDouble(j.nextLine().replace(",", "."));

                System.out.println("memiliki prestasi (true/false):");
                boolean status = Boolean.parseBoolean(j.nextLine().trim());

                if (status == true) {
                    if (ipkPrestasi >= 3.00) {
                        pesan = "ipk cukup, beasiswa diberikan";
                    } else {
                        pesan = "ipk belum mencukupi, beasiswa tidak diberikan";
                    }
                } else {
                    pesan = "tidak ada prestasi, beasiswa tidak diberikan";
                }
                break;

            default:
                pesan = "beasiswa tidak valid";
                break;
        }

        System.out.println("Nama  : " + nama);
        System.out.println("Hasil : " + pesan);
    }
}