import java.util.Scanner;

public class ArrayBilangan05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] bil = new int[4];

        bil[0] = 3463849;
        bil[1] = 1286737;
        bil[2] = 4675631;
        bil[3] = 2000000;

        for (int i = 0; i < 4; i++){
            System.out.println(bil[i]);
        }

    }
}