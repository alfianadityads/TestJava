import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ini merupakan program pencetakan faktor bilangan");

//        inisiasi variable penampung
        int angka = 0;
//        int faktorBilangan = 0;

        System.out.println("Silahkan masukkan angkanya : ");

//        Penampungan input angka dari user
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();

//        print faktor angka yang dimasukkan user
        System.out.println("Jadi faktor bilangan dari angka " + angka + " adalah : ");

//        looping angka yang dimasukkan user
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                System.out.println(i);
            }
        }

    }
}