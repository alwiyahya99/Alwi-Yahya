/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan nama dan kegiatan dengan metode abstrak
 */
package pbo2.pkg10117050.latihan62.living.thing;

public class Human extends LivingThing{

    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan");
    }

}
