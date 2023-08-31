public class Tabung {
    int jariJari;
    int tinggi;

    public Tabung(int jariJari, int tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public float hitungVolumeTabung() {
        float luasLingkaran = ((22) * this.jariJari * this.jariJari) / 7;
        return luasLingkaran * this.tinggi;
    }
}
