package pertemuan12;
import java.util.Arrays;
public class arraybilangan16 {
public static void main(String[] args) {

        int[] bil = new int[4];
        bil[0] = 16; 
        bil[1] = 24;
        bil[2] = -3;
        bil[3] = 21;
  


        for (int i = 0; i < bil.length; i++) {
             System.out.println("bil[" + i+ "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));

      ;
    }
}
    

