/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menghitung Biaya Mas Kawin
 */
package pbo2.pkg10117050.latihan49.biaya.emas.kawin;

public class Biaya {

    private double berat;
    private int harga;

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    

    public double hitungBiayaEmas(double nBerat, int nHarga) {      
        return harga * berat;
    }

}
