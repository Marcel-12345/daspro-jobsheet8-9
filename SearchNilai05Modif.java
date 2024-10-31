import java.util.Scanner;

public class SearchNilai05Modif{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] mhs = new int[jmlMhs];

        for (int i = 0; i < mhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            mhs[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = 0;
        for (int i = 0; i < mhs.length; i++) {
            if (key == mhs [i]){
                hasil = i;
                System.out.println();
                System.out.println("Nilai "+ key +" ketemu, merupakan nilai mahasiswa ke-" + hasil);
                break;             
            }
        
            if (i >= mhs.length - 1){
                System.out.println();
                System.out.println("Nilai yang dicari tidak ditemukan");
            }
        }
        }   
    }