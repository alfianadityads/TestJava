public class Dimesion extends Input{
    @Override
    public float hitungDimensi() {
        float volumeBarang = 0;
        float per50 = 0;
        int harga = 0;
        double pembulatan = 0;

        volumeBarang = panjang * lebar * tinggi;

//        perhitungan per 50cm kubik
        per50 = volumeBarang / 50;
        pembulatan = Math.floor(per50);

        if (pembulatan <= 1) {
            harga = 5000;
        } else {
            harga = (int) pembulatan * 5000;
        }

        return harga;
    }
}
