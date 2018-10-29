/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan warna dan dan sumbu kordinat
 */
package pbo2.pkg10117050.latihan54.kordinat;

/**
 *
 * @author ZeroXploit
 */
public class Koordinat {

    protected int x;
    protected int y;

    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
