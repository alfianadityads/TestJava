import java.util.Scanner;

public class Main {

    private static boolean palindrome(String value) {
//        membuat variable penampung
        char[] array = value.toCharArray();
        char[] reverseArray = new char[array.length];
        int temp = 0;
        boolean res = false;

//        looping huruf
        for (int i = 0; i < value.length(); i++) {
            reverseArray[i] = array[array.length - i - 1];
        }

//        memasukkan hasil looping ke dalam variable penampung
        for (int i = 0; i < value.length(); i++) {
            if (reverseArray[i] == array[i]) {
                temp++;
            }

        }

//        perkondisian apakah huruf sama atau tidak
        if (temp == reverseArray.length) {
            res = true;
        } else {
            res = false;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Silahkan masukkan kata yang Anda akan cek : ");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        System.out.println("Hsilnya : " + palindrome(value));
    }
}