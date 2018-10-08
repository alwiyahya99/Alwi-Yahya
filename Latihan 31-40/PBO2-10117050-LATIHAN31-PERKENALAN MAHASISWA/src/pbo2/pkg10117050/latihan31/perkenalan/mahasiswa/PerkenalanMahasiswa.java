/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan Nama Mahasiswa
 * yang memanggil clas dari clas Mahasiswa.java 
 */
package pbo2.pkg10117050.latihan31.perkenalan.mahasiswa;

public class PerkenalanMahasiswa {

    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa Mhs = new Mahasiswa();
        Mhs.nim = "10110269 \n";
        Mhs.nama = "Rizki Adam Kurniawan \n";
        
        Mahasiswa Mhs2 = new Mahasiswa();
        Mhs2.nim = "10110270 \n";
        Mhs2.nama = "Indra Tiola \n";
        
        Mahasiswa Mhs3 = new Mahasiswa();
        Mhs3.nim = "10110271 \n";
        Mhs3.nama = "Robi Tanjil Genefi \n";
        
        Mahasiswa Mhs4 = new Mahasiswa();
        Mhs4.nim = "10110272 \n";
        Mhs4.nama = "Muhammad Nur Awaludin \n";
        
        Mhs.perkenalanDiri(Mhs.nim, Mhs.nama);
        Mhs2.perkenalanDiri(Mhs2.nim, Mhs2.nama);
        Mhs3.perkenalanDiri(Mhs3.nim, Mhs3.nama);
        Mhs4.perkenalanDiri(Mhs4.nim, Mhs4.nama);
    }
    
}
