public class Main {
    public static void main(String[] args) {
        System.out.println("Contoh for loop");

        String nama = "aku nomor";
        int nilai1;
        for (nilai1 = 1; nilai1 <= 10; nilai1 ++) {
            System.out.println(nama + " " + nilai1);
        }

        System.out.println("Contoh for while");

        int nilai2 = 1;
        while (nilai2 <= 10) {
            System.out.println("Kamu siapa?");
            nilai2++;
        }

        System.out.println("Contoh for do while");
        int x = 1;
        do {
            System.out.println(x);
            x++;
        }while (x <= 6);
    }
}