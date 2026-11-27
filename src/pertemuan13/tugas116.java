package pertemuan13;

import java.util.Scanner;

public class tugas116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int RESPONDEN = 10;
        final int PERTANYAAN = 6;
        int[][] survei = new int[RESPONDEN][PERTANYAAN];

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                int jawaban;
                do {
                    System.out.print("  Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();
                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("  Jawaban harus 1 sampai 5!");
                    }
                } while (jawaban < 1 || jawaban > 5);
                survei[i][j] = jawaban;
            }
        }

        System.out.println("\n===== Rata-rata setiap responden =====");
        for (int i = 0; i < survei.length; i++) {
            double total = 0;
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
            System.out.printf("Responden %d: %.2f%n", (i + 1), total / survei[i].length);
        }

        System.out.println("\n===== Rata-rata setiap pertanyaan =====");
        for (int j = 0; j < survei[0].length; j++) {
            double total = 0;
            for (int i = 0; i < survei.length; i++) {
                total += survei[i][j];
            }
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), total / survei.length);
        }

        double totalSemua = 0;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalSemua += survei[i][j];
            }
        }
        System.out.println("\n===== Rata-rata keseluruhan =====");
        System.out.printf("%.2f%n", totalSemua / (RESPONDEN * PERTANYAAN));
        sc.close();
    }
}
