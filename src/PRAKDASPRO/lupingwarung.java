package PRAKDASPRO;
import java.util.Scanner;
/**
 * lupingwarung
 */
public class lupingwarung {

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.print("jumlah ruang baca:");
        int n=j.nextInt();
        System.out.print("jumlah hari:");
        int h=j.nextInt();
        
        if (n<=0||h<=0) {
            System.out.println("tidak valid");
        }else{
            int totalseluruhpengunjung=0,ruangpalingramai=0, hariramai=0;
            double rataperhari=0;
        
        int a=1;
        while (a<=n) {
            System.out.println("ruang "+a);
            int total=0;
            for (int i = 1; i <= h; i++) {
                int pengunjung;
                do {
                    System.out.print("pengunjung hari ke-"+i+":");
                    pengunjung=j.nextInt();
                    if (pengunjung < 0) {
                        System.out.println("input tidak boleh negatif");
                    }
                } while (pengunjung < 0);
                total+=pengunjung;
                if (pengunjung > 50) {
                    hariramai++;
                }
            }
            rataperhari=(double)total/h;

            System.out.println("Ruang"+a+"-total: "+total+",rata-rata perhari: "+rataperhari);
            totalseluruhpengunjung+=total;
            if (total>ruangpalingramai) {
                ruangpalingramai=total;
                ruangpalingramai=a;
            }
            a++;
        }
        System.out.println("total seluruh pengunjung:"+totalseluruhpengunjung);
        System.out.println("ruang paling ramai:"+ruangpalingramai);
        System.out.println("hari ramai:"+hariramai);
        }
    }
}