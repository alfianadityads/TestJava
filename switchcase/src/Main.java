import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ini adalah contoh penggunaan switch case");

        Scanner scan = new Scanner(System.in);

        System.out.println("Input angka : ");
        int umur = scan.nextInt();
        String kelas = "";


        switch (umur) {
            case 7 :
                kelas = "Kelas 2";
                break;
            case 8:
                kelas = "kelas 3";
                break;
            case 9:
                kelas = "kelas 4";
                break;
            default:
                kelas = "kelas invalid";
                break;
        }

        System.out.println("Kamu masuk ke kelas : " + kelas);

    }
}