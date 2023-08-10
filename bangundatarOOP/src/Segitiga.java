public class Segitiga {
    double alas;
    double tinggi;


    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuasSegitiga() {
        return (this.alas * this.tinggi) / 2;
    }

    public double hitungKelilingSegitiga() {
        double kelilingSegitiga = 0;
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        kelilingSegitiga = sisiMiring + alas + tinggi;
        return kelilingSegitiga;
    }
}
