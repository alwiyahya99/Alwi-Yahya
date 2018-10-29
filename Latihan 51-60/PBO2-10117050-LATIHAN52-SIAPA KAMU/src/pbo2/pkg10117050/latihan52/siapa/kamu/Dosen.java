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
public class Dosen extends Manusia {

    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println("saya " + nama + " umur " + umur + " tahun sedang mengajar matakuliah " + mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya dosen");
    }
}
