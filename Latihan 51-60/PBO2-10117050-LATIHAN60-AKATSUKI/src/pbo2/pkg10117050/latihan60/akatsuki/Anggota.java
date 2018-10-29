/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan anggota organisasi akatsuki
 */
package pbo2.pkg10117050.latihan60.akatsuki;

public class Anggota extends Akatsuki {

    private String posisi2;

    public Anggota(String posisi2, String parNama, String parAsal, String parPasangan, String parCincin, String parCiri) {
        super(parNama, parAsal, parPasangan, parCincin, parCiri);
        this.posisi2 = posisi2;
    }

    public String getPosisi2() {
        return posisi2;
    }
    
    public void tampilAnggota(){
        System.out.println("Posisi di organisasi : " + posisi2);
    } 

}

