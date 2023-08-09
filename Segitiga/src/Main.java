import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menghitung Luas Segitiga");

        Scanner input = new Scanner(System.in);

        System.out.println("Silahkan input nilai Alas Segitiga : ");
        float alasSegitiga = input.nextFloat();

        System.out.println("Silahkan input nilai Tinggi Segitiga : ");
        float tinggiSegitiga = input.nextFloat();

        float luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2;

        System.out.println("Jadi luas segitiga diatas adalah : " + luasSegitiga);
    }
}