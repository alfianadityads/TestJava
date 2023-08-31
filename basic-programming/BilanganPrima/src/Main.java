import java.util.Scanner;

public class Main {

    private static boolean primeNumber(int number) {
        boolean prima = true;

        if (number <= 1) {
            prima = false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prima = false;
                break;
            }

        }

        return prima;
    }



    public static void main(String[] args) {
        System.out.println("Indentifikasi bilangan prima");
        System.out.println("Masukkan angka : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Hasilnya adalah : " + primeNumber(number));
    }
}