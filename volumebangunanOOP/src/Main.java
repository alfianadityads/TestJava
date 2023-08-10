import javafx.scene.control.Tab;

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

//        BALOK
        System.out.println("Inputkan panjang baloknya : ");
        int panjangBalok = input.nextInt();
        System.out.println("Inputkan lebar baloknya : ");
        int lebarBalok = input.nextInt();
        System.out.println("Inputkan tinggi baloknya : ");
        int tinggiBalok = input.nextInt();

        Balok volumeBalok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
        volumeBalok.hitungVolumeBalok();
        System.out.println("Jadi, volume balok tersebut adalah : " + volumeBalok.hitungVolumeBalok());

//        TABUNG
        System.out.println("Inputkan jari - jari tabung : ");
        int jariJariTabung = input.nextInt();
        System.out.println("Inputkan tinggi tabung : ");
        int tinggiTabung = input.nextInt();

        Tabung volumeTabung = new Tabung(jariJariTabung,tinggiTabung);
        volumeTabung.hitungVolumeTabung();
        System.out.println("Jadi, volume tabung tersebut adalah : " + volumeTabung.hitungVolumeTabung());
    }
}