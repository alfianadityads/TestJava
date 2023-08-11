public class Kubus extends BangunRuang{
    int rusuk;

    public Kubus(int rusuk) {
        this.rusuk = rusuk;
    }

    public void hitungVolume() {
        System.out.println("Volume kubus adalah : " + rusuk * rusuk *rusuk);
    }
}
