package pertemuan10;

import java.util.Scanner;
public class triangle16 {
    public static void main(String[] args) {
        Scanner javier=new Scanner(System.in);
        System.out.print("masukkan nilai n=");
        int n=javier.nextInt();
       
        int i=n;
        while (i>=1) {
            int j=0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        javier.close();
    }
}

