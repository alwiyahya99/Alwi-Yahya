/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan pemain dalam serial detektiv conan
 */
package pbo2.pkg10117050.latihan59.detective.conan;

/**
 *
 * @author ZeroXploit
 */
public class PemeranPembantu extends DetektifConan {

    private String status2;

    public PemeranPembantu(String status2, String nama, String peran, String keluarga, String penampilanPertama) {
        super(nama, peran, keluarga, penampilanPertama);
        this.status2 = status2;
    }

    public String getStatus2() {
        return status2;
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
