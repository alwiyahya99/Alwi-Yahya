/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung dan menampilkan nilai mahasiswa
 */
package pbo2.pkg10117050.latihan47.nilai.mahasiswa;

import java.util.Scanner;

/**
 *
 * @author ZeroXploit
 */
public class PBO210117050LATIHAN47NILAIMAHASISWA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hitung nHitung1 = new Hitung(75,45,34);
        System.out.println("QUIZ \t\t= " + nHitung1.getQuiz());
        System.out.println("UTS \t\t= " + nHitung1.getUts());
        System.out.println("UAS \t\t= " + nHitung1.getUas());     
        System.out.println("");
        System.out.println("Nilai Akhir \t= " + nHitung1.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Index \t\t= " + nHitung1.indexNilai(nHitung1.hitungNilaiAkhir()));       
        System.out.println("Keterangan \t= " + nHitung1.keterangan(nHitung1.indexNilai(nHitung1.hitungNilaiAkhir())));
        System.out.println("");
        
        Hitung nHitung2 = new Hitung(60,80,75);
        System.out.println("QUIZ \t\t= " + nHitung2.getQuiz());
        System.out.println("UTS \t\t= " + nHitung2.getUts());
        System.out.println("UAS \t\t= " + nHitung2.getUas());     
        System.out.println("");
        System.out.println("Nilai Akhir \t= " + nHitung2.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Index \t\t= " + nHitung2.indexNilai(nHitung2.hitungNilaiAkhir()));       
        System.out.println("Keterangan \t= " + nHitung2.keterangan(nHitung2.indexNilai(nHitung2.hitungNilaiAkhir())));
        System.out.println("");
        
        Hitung nHitung3 = new Hitung(30,80,40);
        System.out.println("QUIZ \t\t= " + nHitung3.getQuiz());
        System.out.println("UTS \t\t= " + nHitung3.getUts());
        System.out.println("UAS \t\t= " + nHitung3.getUas());     
        System.out.println("");
        System.out.println("Nilai Akhir \t= " + nHitung3.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Index \t\t= " + nHitung3.indexNilai(nHitung3.hitungNilaiAkhir()));       
        System.out.println("Keterangan \t= " + nHitung3.keterangan(nHitung3.indexNilai(nHitung3.hitungNilaiAkhir())));
        System.out.println("");
    }
    
}
