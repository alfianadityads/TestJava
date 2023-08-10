import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        PERSEGI
        System.out.println("Input sisi persegi : ");
        int sisiPersegi = input.nextInt();

        Persegi luasPersegi = new Persegi(sisiPersegi);
        luasPersegi.hitungLuasPersegi();
        System.out.println("Jadi, luas persegi tersebut adalah : " + luasPersegi.hitungLuasPersegi());

        Persegi kelilingPersegi = new Persegi(sisiPersegi);
        kelilingPersegi.hitungKelilingPersegi();
        System.out.println("Jadi, keliling persegi tersebut adalah : " + kelilingPersegi.hitungKelilingPersegi());

//        SEGITIGA
        System.out.println("Input alas segitiga : ");
        double alasSegitga = input.nextDouble();
        System.out.println("Input tinggi segitiga : ");
        double tinggiSegitga = input.nextDouble();

        Segitiga luasSegitiga = new Segitiga(alasSegitga,tinggiSegitga);
        luasSegitiga.hitungLuasSegitiga();
        System.out.println("Jadi, luas segitiga tersebut adalah : " + luasSegitiga.hitungLuasSegitiga());
        Segitiga kelilingSegitiga = new Segitiga(alasSegitga,tinggiSegitga);
        kelilingSegitiga.hitungKelilingSegitiga();
        System.out.println("Jadi, luas keliling tersebut adalah : " + kelilingSegitiga.hitungKelilingSegitiga());

//        Persegi Panjang
        System.out.println("Input panjang persegi panjang : ");
        int panjangPersegiPanjang = input.nextInt();
        System.out.println("Input lebar persegi panjang : ");
        int lebarPersegiPanjang = input.nextInt();

        PersegiPanjang luasPersegiPanjang = new PersegiPanjang(panjangPersegiPanjang,lebarPersegiPanjang);
        luasPersegiPanjang.hitungLuasPersegiPanjang();
        System.out.println("Jadi, luas persegi panjang tersebut adalah : " + luasPersegiPanjang.hitungLuasPersegiPanjang());
        PersegiPanjang kelilingPersegiPanjang = new PersegiPanjang(panjangPersegiPanjang,lebarPersegiPanjang);
        System.out.println("Jadi, keliling persegi panjang tersebut adalah : " + kelilingPersegiPanjang.hitungKelilingPersegiPanjang());
    }
}