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
public class Bola extends BangunRuang {

    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double hitungVolume() {
        return (4 * 22 * r * r * r)/ 7 / 3;
    }

}
