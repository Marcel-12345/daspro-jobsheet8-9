import java.util.Scanner;

public class Tugas9_2_05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] menu = {"capcay", "ifu mie", "puyung hai", "ayam saus tiram",
        "ayam gurame", "nasi goreng seafood", "air putih", "teh", "jus mangga", "jus jeruk"};
        int[] harga = {26000, 29000, 34000, 32000, 37000, 31000, 3000, 4000, 9000, 9000};
        System.out.println();

        for (int i = 0; i <= 9; i++){
            System.out.println(i + ". " + menu[i] + " = Rp. " + harga[i]);
        }

        System.out.println();
        System.out.println("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();

        int[] pesan = new int[jumlah];
        int total = 0;

        System.out.println();
        System.out.println("Silakan menu apa saja yang dipesan: ");

        for (int i = 0; i < jumlah; i++){
            pesan[i] = sc.nextInt();
            System.out.println(menu[pesan[i]] + " = Rp. " + harga[pesan[i]]); 
            total += harga[pesan[i]];
        }

        System.out.println();
        System.out.println("Pesanan anda: ");
        for (int i = 0; i < jumlah; i++){
            System.out.println(menu[pesan[i]] + " = Rp. " + harga[pesan[i]]);
        }
        System.out.println("total biaya anda adalah Rp. " + total);

        }   
    }