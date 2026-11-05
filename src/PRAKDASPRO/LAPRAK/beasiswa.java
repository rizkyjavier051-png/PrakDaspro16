package PRAKDASPRO.LAPRAK;
import java.util.Scanner;
public class beasiswa {
    public static void main(String[] args) {
        Scanner jav=new Scanner(System.in);

        System.out.println("masukkan nama:");
        String nama=jav.nextLine();
        System.out.println("masukkan nilai IPK:");
        double ipk=jav.nextInt();
        System.out.println("Status mahasiswa(aktif/tidak aktif):");
        String status=jav.nextLine();
       System.out.println("pilih beasiswa(prestasi/sosial):");
       String jenis=jav.nextLine();

       boolean diterima;
       String alasan;

        if (ipk >= 3.50) {
            switch (jenis) {
                case "prestasi":
                    // Beasiswa prestasi: IPK harus lebih dari 3
                    if (ipk > 3.00) {
                        diterima = true;
                    } else {
                        alasan = "IPK tidak memenuhi syarat beasiswa prestasi.";
                    }
                    break;
 
                case "sosial":
                    // Beasiswa sosial: status mahasiswa harus aktif
                    if (status.equalsIgnoreCase("aktif")) {
                        diterima = true;
                    } else {
                        alasan = "Status mahasiswa tidak aktif.";
                    }
                    break;
 
                default:
                    alasan = "Jenis beasiswa tidak dikenali.";
            }
        } else {
            alasan = "IPK kurang dari 3.50.";
        }



                
        
            
        
    }
}
