/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan SIAPA KAMU dengan teori polymorpisme
 */
package pbo2.pkg10117050.latihan52.siapa.kamu;

public class Manusia {

    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void siapaKamu() {
        System.out.println("Saya manusia");
    }
}
