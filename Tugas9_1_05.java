import java.util.Scanner;

public class Tugas9_1_05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double total = 0, rata2, tertinggi = 0, terendah = 100;;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiMhs[i]);
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Nilai rata-rata mahasiswa adalah: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        }   
    }