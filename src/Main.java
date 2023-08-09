import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Menghitung keliling balok");

/*
                int panjangBalok = 12;
                int lebarBalok = 10;
                int tinggiBalok = 15;
*/

        Scanner input = new Scanner(System.in);
        System.out.println("input nilai Panjang balok : ");
        int panjangBalok = input.nextInt();

        System.out.println("input nilai Lebar balok : ");
        int lebarBalok = input.nextInt();

        System.out.println("input nilai Tinggi balok : ");
        int tinggiBalok = input.nextInt();


        int kelilingBalok = (panjangBalok + lebarBalok + tinggiBalok) * 4;

        System.out.println("Kelilingnya adalah = " + kelilingBalok);
    }
}