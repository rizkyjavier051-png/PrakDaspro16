package PRAKDASPRO;
import java.util.Scanner;
/**
 * loopingnilai
 */
public class loopingnilai {

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.println("jumlah mahasiswa:");
        int n=j.nextInt();

        int tuntas=0,remidi=0,nilaitertinggi=0, nilaiterendah=100, totalsemua=0;
        double ratarata=0;

        for (int i = 1; i <= n; i++) {
            int nilai;
            do {
                System.out.print("nilai tugas ke-"+i+":");
                nilai=j.nextInt();
                if (nilai < 0 && nilai > 100) {
                    System.out.print("nilia tidak valid");
                }
            } while (nilai < 0 || nilai > 100);
            totalsemua+=nilai;

            if (nilai > nilaitertinggi) {
                nilaitertinggi=nilai;
            }if (nilai<nilaiterendah) {
                nilaiterendah=nilai;
            }if (nilai>=70) {
                tuntas++;
            }else
                remidi++;
        }
        ratarata=totalsemua/n;

        System.out.println("rata rata:"+ratarata);
        System.out.println("nilai tertinggi:"+nilaitertinggi);
        System.out.println("nilai terendah:"+nilaiterendah);
        System.out.println("tuntas:"+tuntas);
        System.out.println("remidi:"+remidi);
    }
}