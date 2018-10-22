/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung massa jenis kubus
 */
package pbo2.pkg10117050.latihan41.massa.jenis;

public class Kubus {

    private int sisi;
    private int massa;

    //SISI
    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    //MASSA
    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume(int parSisi) {
        return parSisi * parSisi * parSisi;
    }

    public int hitungMassaJenis(int parMassa, int volume) {
        return parMassa / volume;
    }

}
