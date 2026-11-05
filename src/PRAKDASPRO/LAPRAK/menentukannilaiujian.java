package PRAKDASPRO.LAPRAK;
import java.util.Scanner;
public class menentukannilaiujian {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

    System.out.println("Jenis ujian: ");
    String ujian=j.nextLine();
    System.out.println("Nilai ujian: ");
    int nilai=j.nextInt();

    String status;

    if (ujian.equalsIgnoreCase("uts")) {
        if (nilai >= 70 && nilai <= 100) {
            System.out.println("lulus");
        } else if (nilai >= 50 && 70 > nilai) {
            System.out.println("remed");
        } else if (nilai < 50) {
            System.out.println("tidak lulus");
        }else{
            System.out.println("nilai tidak valid");
        }
    }else if (ujian.equalsIgnoreCase("uas")){
        if (nilai >= 75 && nilai <= 100) {
            System.out.println("lulus");
        } else if (nilai >= 60 && nilai < 75){
            System.out.println("remed");
        }else if (nilai < 60) {
            System.out.println("tidak lulus");
        } else{
            System.out.println("nilai tidak valid");
        }
    }else if (ujian.equalsIgnoreCase("praktikum")){
        if (nilai >= 80 && nilai <= 100) {
            System.out.println("lulus");
        } else if (nilai >= 65 && nilai < 80){
            System.out.println("remed");
        }else if (nilai < 65) {
            System.out.println("tidak lulus");
        } else{
            System.out.println("nilai tidak valid");
        }
    }else {
        System.out.println("jenis ujian tidak valid");
    }
    
    }
}
