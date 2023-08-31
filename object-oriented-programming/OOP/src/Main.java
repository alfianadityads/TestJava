import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input nama kalian : ");
        String namaKaryawan = input.nextLine();
        System.out.println("Input ID karyawan : ");
        String ids = input.nextLine();
        System.out.println("Input gaji karyawan : ");
        int gajinya = input.nextInt();

        Employee employee1 = new Employee(namaKaryawan,ids,gajinya);
        employee1.introduceKaryawan();
        System.out.println("Gaji setahun = " + employee1.hitungGajiTahunan());

        Employee windy = new Employee("Windy", "99999", 250000);
        windy.introduceKaryawan();
        System.out.println("Gaji setahun windy = " + windy.hitungGajiTahunan());

    }
}