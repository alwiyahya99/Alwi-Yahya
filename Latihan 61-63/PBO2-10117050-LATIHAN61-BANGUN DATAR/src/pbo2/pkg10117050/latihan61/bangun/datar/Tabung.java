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
public class Tabung extends BangunRuang {

    private double r;
    private double h;

    public void setR(double r) {
        this.r = r;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    @Override
    public double hitungVolume() {
        return (22 * r * r * h)/7;
    }

}
