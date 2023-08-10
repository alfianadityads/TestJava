import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        KUBUS
        System.out.println("Inputkan panjang rusuk kubusnya : ");
        int rusukKubus = input.nextInt();

        Kubus volumeKubus = new Kubus(rusukKubus);
        volumeKubus.hitungVolumeKubus();
        System.out.println("Jadi, volume kubus tersebut adalah : " + volumeKubus.hitungVolumeKubus());

    }
}