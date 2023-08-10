import javafx.scene.control.Tab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        MENU
        int pilihanMenu;
        System.out.println("MENU PERHITUNGAN VOLUME : ");
        System.out.println("1. Menghitung volume Kubus");
        System.out.println("2. Menghitung volume Balok");
        System.out.println("3. Menghitung volume Tabung");
        System.out.println("9. EXIT");
        System.out.println("Silahkan masukkan angka menu : ");
        pilihanMenu = input.nextInt();


        switch (pilihanMenu) {
            case 1:
                System.out.println("Anda telah memilih operasi perhitungan KUBUS : ");
                System.out.println(" ");
//                  KUBUS
                System.out.println("Inputkan panjang rusuk kubusnya : ");
                int rusukKubus = input.nextInt();

                Kubus volumeKubus = new Kubus(rusukKubus);
                volumeKubus.hitungVolumeKubus();
                System.out.println("Jadi, volume kubus tersebut adalah : " + volumeKubus.hitungVolumeKubus());
                break;

            case 2:
                System.out.println("Anda telah memilih operasi perhitungan BALOK : ");
                System.out.println(" ");
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
                break;

            case 3:
                System.out.println("Anda telah memilih operasi perhitungan TABUNG : ");
                System.out.println(" ");
//        TABUNG
                System.out.println("Inputkan jari - jari tabung : ");
                int jariJariTabung = input.nextInt();
                System.out.println("Inputkan tinggi tabung : ");
                int tinggiTabung = input.nextInt();

                Tabung volumeTabung = new Tabung(jariJariTabung,tinggiTabung);
                volumeTabung.hitungVolumeTabung();
                System.out.println("Jadi, volume tabung tersebut adalah : " + volumeTabung.hitungVolumeTabung());
                break;

//                EXIT PROGRAM
            case 9:
                System.out.println("Anda telah keluar dari program :)");
                break;
        }

    }
}