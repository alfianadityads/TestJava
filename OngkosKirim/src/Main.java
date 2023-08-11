import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i>0; i++) {

            Scanner input = new Scanner(System.in);

            System.out.println(" ");
            System.out.println("==================================================");
            System.out.println("Selamat Datang Di Program Perhitungan Ongkos Kirim");
            System.out.println("==================================================");
            System.out.println("1. Menghitung Ongkos Kirim : ");
            System.out.println("9. EXIT ");
            System.out.println("Silahkan masukkan menu pilihan Anda : ");
            float pilihanMenu = input.nextFloat();

            if (pilihanMenu == 1) {
                System.out.println("Silahkan masukkan panjang dimensi barang : ");
                int panjangBarang = input.nextInt();
                System.out.println("Silahkan masukkan lebar dimensi barang : ");
                int lebarBarang = input.nextInt();
                System.out.println("Silahkan masukkan tinggi dimensi barang : ");
                int tinggiBarang = input.nextInt();
                Dimesion dimensi = new Dimesion();
                dimensi.InputDimensi(panjangBarang,lebarBarang,tinggiBarang);
                System.out.println("Silahkan masukkan berat barang : ");
                float beratBarang = input.nextFloat();
                Weight berat = new Weight();
                berat.InputBerat(beratBarang);

//                Perkondisian dimensi barang dan berat barang
                if (dimensi.hitungDimensi() > berat.hitungBerat()) {
                    System.out.println("Harga ongkirnya adalah : Rp " + dimensi.hitungDimensi());
                } else {
                    System.out.println("Harga ongkirnya adalah : Rp " + berat.hitungBerat());
                }
            } else if (pilihanMenu == 9) {
                System.out.println("Anda telah keluar dari program :) ");
                break;
            } else {
                System.out.println("Invalid input. Silahkan masukkan pilihan menu yang benar!");
            }
        }
    }
}