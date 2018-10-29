/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan SIAPA KAMU dengan teori polymorpisme
 */

package pbo2.pkg10117050.latihan52.siapa.kamu;

public class PBO210117050LATIHAN52SIAPAKAMU {

    public static void main(String[] args) {

        Dosen ndosen = new Dosen();

        ndosen.setNama("Rizki Adam Kurniawan");
        ndosen.setUmur(27);
        ndosen.setNip("41227829930");
        ndosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : " + ndosen.getNip());
        ndosen.siapaKamu();
        ndosen.mengajarApa();
        System.out.println("");

        Mahasiswa nmahasiswa = new Mahasiswa();
        nmahasiswa.setNama("Nindi");
        nmahasiswa.setUmur(17);
        nmahasiswa.setNim("10110269");
        nmahasiswa.setKelas("PBO2");
        
        System.out.println("NIM MAHASISWA : "+nmahasiswa.getNim());
        nmahasiswa.siapaKamu();
        nmahasiswa.kelasApa();
    }

}
