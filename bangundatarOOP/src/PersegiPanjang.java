public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuasPersegiPanjang() {
        return this.panjang * this.lebar;
    }

    public int hitungKelilingPersegiPanjang() {
        return (this.panjang + this.lebar) * 2;
    }
}
