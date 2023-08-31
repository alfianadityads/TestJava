import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ini adalah program konversi nilai");

        System.out.println("Silahkan masukkan nilai Anda : ");

//      inisiasi variable penampung
        String grade = "";
        int inputNilai = 0;

//      Scan input nilai dari user
        Scanner input = new Scanner(System.in);
        inputNilai = input.nextInt();

//      perkondisian nilai
        if (inputNilai <= 100 && inputNilai >= 80) {
            grade = "A";
        } else if (inputNilai <= 79 && inputNilai >= 65) {
            grade = "B+";
        } else if (inputNilai <= 64 && inputNilai >= 50) {
            grade = "B";
        } else if (inputNilai <= 49 && inputNilai >= 35) {
            grade = "C";
        } else if (inputNilai <= 34 && inputNilai >= 0) {
            grade = "D";
        } else {
            grade = "invalid";
        }

//      print nilai yang sudah terkonversikan
        System.out.println("Jadi, nilai konversi kamu adalah : " + grade);

    }
}