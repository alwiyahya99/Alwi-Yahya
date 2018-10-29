/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menghitung bangun ruang
 */
package pbo2.pkg10117050.latihan61.bangun.datar;

/**
 *
 * @author Mahasiswa
 */
public class Kerucut extends BangunRuang {

    private double t;
    private double r;

    public void setT(double t) {
        this.t = t;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public double getR() {
        return r;
    }

    @Override
    public double hitungVolume() {
        return (1 * 22 * r * r * t)/ 7 / 3;
    }

}
