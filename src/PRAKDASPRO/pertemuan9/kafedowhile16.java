package PRAKDASPRO.pertemuan9;
import java.util.Scanner;
public class kafedowhile16 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        String namaPelanggan;
        int hargakopi=11000, hargateh=5000, hargaroti=16000;
        int i = 1;


        do{
            System.out.println("masukkan nama anda(ketik batal jika tidak jadi pesan):");
            namaPelanggan=j.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("pesan dibatalkan");
                break;
            }
            System.out.print("jumlah kopi:");
            int kopi=j.nextInt();
            System.out.print("jumlah teh:");
            int teh=j.nextInt();
            System.out.print("jumlah roti:");
            int roti=j.nextInt();
            int totalharga=(kopi*hargakopi)+(teh*hargateh)+(roti*hargaroti);
            System.out.println("total yang harus dibayar:"+totalharga);
            j.nextLine();
        }while(true);
    }
}
