package pertemuan10;

import java.util.Scanner;
/**
 * star16
 */
public class star16 {

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        System.out.print("masukkan nilai n=");
        int nilai=j.nextInt();

        for (int i = 0; i <= nilai; i++) {
            System.out.print("*");
        }
        System.out.println();
        j.close();
    }
}