public class Weight  extends Input{
    @Override
    public float hitungBerat() {
        int harga = 0;
        double pembulatan = Math.floor(berat);
        return harga = (int) pembulatan * 5000;
    }
}
