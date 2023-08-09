import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Contoh pembuatan dan penggunaan function");

        Scanner input = new Scanner(System.in);
        System.out.println("Input your name first : ");
        String name = input.nextLine();
        System.out.println("Input your year of birth : ");
        int year = input.nextInt();
        callMe(name, year);

        System.out.println("Menhitung keliling balok : ");
        System.out.println("Input panjang balok : ");
        int p = input.nextInt();
        System.out.println("Input panjang lebar : ");
        int l = input.nextInt();
        System.out.println("Input panjang tinggi : ");
        int t = input.nextInt();
//        int result = hitungKelilingBalok(p,l,t);
        System.out.println("Jadi, keliling balok tersebut adalah = " + hitungKelilingBalok(p,l,t));
    }

    private static void callMe(String name, int yearBirth) {
        int age = 2023 - yearBirth;
        System.out.println("Your name is " + name + ", and your age is " + age);
    }

    private static int hitungKelilingBalok(int panjang,int lebar,int tinggi) {
        return (panjang + lebar + tinggi) * 4;
    }
}