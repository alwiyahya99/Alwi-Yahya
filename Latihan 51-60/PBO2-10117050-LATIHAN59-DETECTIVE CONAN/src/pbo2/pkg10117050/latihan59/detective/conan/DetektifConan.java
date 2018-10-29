/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan pemain dalam serial detektiv conan
 */
package pbo2.pkg10117050.latihan59.detective.conan;

public class DetektifConan {

    protected String nama;
    protected String peran;
    protected String keluarga;
    protected String penampilanPertama;

    public DetektifConan(String nama, String peran, String keluarga, String penampilanPertama) {
        this.nama = nama;
        this.peran = peran;
        this.keluarga = keluarga;
        this.penampilanPertama = penampilanPertama;
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }

    public String getKeluarga() {
        return keluarga;
    }

    public String getPenampilanPertama() {
        return penampilanPertama;
    }

}
