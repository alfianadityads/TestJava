public class Employee {
    String name;
    String idKaryawan;
    int gajiSebulan;

    public Employee(String name, String idKaryawan, int gajiSebulan) {
        this.name = name;
        this.idKaryawan = idKaryawan;
        this.gajiSebulan = gajiSebulan;
    }

    public void introduceKaryawan() {
        System.out.println("Nama karyawan = " + this.name + ": id = " + this.idKaryawan);
    }

    public int hitungGajiTahunan() {
        return this.gajiSebulan * 12;
    }
}
