/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan anggota organisasi akatsuki
 */
package pbo2.pkg10117050.latihan60.akatsuki;

public class Pemimpin extends Akatsuki {

    private String posisi;

    public Pemimpin(String posisi, String parNama, String parAsal, String parPasangan, String parCincin, String parCiri) {
        super(parNama, parAsal, parPasangan, parCincin, parCiri);
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }
    
    public void tampilAnggota(){
        System.out.println("Posisi di organisasi : " + posisi);
    }

}
