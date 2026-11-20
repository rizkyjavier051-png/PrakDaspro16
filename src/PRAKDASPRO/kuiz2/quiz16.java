package PRAKDASPRO.kuiz2;
import java.util.Scanner;
public class quiz16 {
    public static void main(String[] args) {
        Scanner j=new Scanner(System.in);
        System.out.print("nama toko:");
        String nama=j.nextLine();
        System.out.print("jumlah hari:");
        int hari = j.nextInt();

        int harinaik=0;
        String Status;
        boolean tambahtoko;
        
        for (int i = 1; i <= hari; i++) {
            int pengunjung;
            do {
                System.out.println("pengunjung hari ke-"+i+":");
                pengunjung=j.nextInt();
                if (pengunjung < 0) {
                    System.out.println("data tidak valid, ulangi!");
                }
            } while (pengunjung < 0);
            if (hari<pengunjung) {
                hari++;
            }if (hari>=3) {
                Status="BERKEMBANG";
            }else{
                Status="TIDAK BERKEMBANG";
            }
            System.out.println("Tambah toko (y/t) ?");
            tambahtoko=j.nextBoolean();

                return;
            }
        }
        
        System.out.println("hari naik:"+harinaik);
        System.out.println("status"+Status);
        System.out.println("Tambah toko?"+tambahtoko);
    }
