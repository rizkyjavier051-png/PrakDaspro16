package pertemuan10;
import java.util.Scanner;

public class tugas216 {
    public static void main(String[] args) {
        Scanner javier = new Scanner(System.in);

        int n;   
        System.out.println("Nilai n = ");
        n = javier.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        int jumlah = 0;
        System.out.println("Tabel Perkalian " + n + " x " + n );

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil); 
                jumlah += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka pada tabel = " + jumlah);
    }
}