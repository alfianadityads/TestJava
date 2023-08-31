public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int hitungLuasPersegi() {
        return this.sisi * this.sisi;
    }

    public int hitungKelilingPersegi() {
        return this.sisi * 4;
    }
}
