import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Operation operasi = new Operation();
        for (int i = 1; i> 0; i ++) {
            System.out.println("===============================================");
            System.out.println("Selamat Datang Di Program Kalkulator Sederhana");
            System.out.println("===============================================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("9. EXIT");

            System.out.println("Silahkan masukkan pilihan operasi : ");
            int pilihanOperasi = input.nextInt();

//            Penjumlahan
            if (pilihanOperasi == 1) {
                System.out.println("Menu Penjumlahan");
                System.out.println(" ");
                System.out.println("Silahkan masukkan angka pertama : ");
                float angkaPenjumlahan1 = input.nextFloat();
                System.out.println("Silahkan masukkan angka kedua : ");
                float angkaPenjumalahan2 = input.nextFloat();
                operasi.InputNumber(angkaPenjumlahan1,angkaPenjumalahan2);
                System.out.println(angkaPenjumlahan1 + " + " + angkaPenjumalahan2 + " = " + operasi.penjumlahan());
                System.out.println(" ");

//             Pengurangan
            } else if (pilihanOperasi == 2) {
                System.out.println("Menu Pengurangan");
                System.out.println(" ");
                System.out.println("Silahkan masukkan angka pertama : ");
                float angkaPengurangan1 = input.nextFloat();
                System.out.println("Silahkan masukkan angka kedua : ");
                float angkaPengurangan2 = input.nextFloat();
                operasi.InputNumber(angkaPengurangan1,angkaPengurangan2);
                System.out.println(angkaPengurangan1 + " - " + angkaPengurangan2 + " = " + operasi.pengurangan());
                System.out.println(" ");

            } else if (pilihanOperasi == 3) {
                System.out.println("Menu Perkalian");
                System.out.println(" ");
                System.out.println("Silahkan masukkan angka pertama : ");
                float angkaPerkalian1 = input.nextFloat();
                System.out.println("Silahkan masukkan angka kedua : ");
                float angkaPerkalian2 = input.nextFloat();
                operasi.InputNumber(angkaPerkalian1,angkaPerkalian2);
                System.out.println(angkaPerkalian1 + " * " + angkaPerkalian2 + " = " + operasi.perkalian());
                System.out.println(" ");
            } else if (pilihanOperasi == 4) {
                System.out.println("Menu Pembagian");
                System.out.println(" ");
                System.out.println("Silahkan masukkan angka pertama : ");
                float angkaPembagian1 = input.nextFloat();
                System.out.println("Silahkan masukkan angka kedua : ");
                float angkaPembagian2 = input.nextFloat();
                operasi.InputNumber(angkaPembagian1,angkaPembagian2);
                System.out.println(angkaPembagian1 + " / " + angkaPembagian2 + " = " + operasi.pembagian());
                System.out.println(" ");
            } else if (pilihanOperasi == 9) {
                System.out.println("Anda telah keluar dari program :) ");
                break;
            } else {
                System.out.println("Invalid input, silahkan masukkan menu yang tepat");
            }

        }
        }


    }