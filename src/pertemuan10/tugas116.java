import java.util.Scanner;
public class tugas116 {
     public static void main(String[] args) {
        Scanner javier=new Scanner(System.in);
         System.out.print("masukkan nilai n=");
        int n=javier.nextInt();
       if (n < 1) {
            System.out.println("n harus minimal 1.");
        } else {
            int total = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                    if (j < i) {
                        System.out.print(" ");
                    }
                    total++;
                }
                System.out.println();
            }

            System.out.println("Total angka yang dicetak : " + total);
        }

    }
}
     

