public class Kubus {
    int rusuk;

    public Kubus(int rusuk) {
        this.rusuk = rusuk;
    }

    public double hitungVolumeKubus() {
        int pangkat = 3;
        return Math.pow(this.rusuk,pangkat);
    }
}
