import java.util.Scanner;

public class Tugas9_3_05{
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
        System.out.print("Masukkan pesanan yang ingin dicari: ");
        String key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])){
                System.out.println();
                System.out.println("Yes! Pesanan yang dicari tersedia!");
                break;
            }

            if (i >= menu.length - 1){
                System.out.println();
                System.out.println("Oops, maaf, pesanan yang dicari ternyata tidak tersedia.");
            }
        }

        }   
    }