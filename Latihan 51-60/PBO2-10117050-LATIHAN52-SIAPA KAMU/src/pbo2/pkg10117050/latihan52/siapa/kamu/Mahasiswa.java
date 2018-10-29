/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan SIAPA KAMU dengan teori polymorpisme
 */
package pbo2.pkg10117050.latihan52.siapa.kamu;

/**
 *
 * @author ZeroXploit
 */
public class Mahasiswa extends Manusia {

    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang belajar di kelas " + kelas);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }

}
