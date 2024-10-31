import java.util.Scanner;

public class ArrayRataNilai05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double totalLulus = 0, totalTidakLulus = 0;
        double rata2lulus, rata2tidakLulus;
        int lulus = 0, tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70){
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }
        rata2lulus = totalLulus / lulus;
        rata2tidakLulus = totalTidakLulus / tidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2lulus);
        System.out.println("Rata-rata nilai lulus = " + rata2tidakLulus);
        }   
    }