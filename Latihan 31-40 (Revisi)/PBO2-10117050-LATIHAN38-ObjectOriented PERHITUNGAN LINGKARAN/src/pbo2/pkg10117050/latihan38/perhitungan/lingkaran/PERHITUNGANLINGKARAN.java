/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung lingkaran
 */
package pbo2.pkg10117050.latihan38.perhitungan.lingkaran;

import java.util.Scanner;

public class PERHITUNGANLINGKARAN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);    
        HitungLingkaran Lingkaran = new HitungLingkaran();
        Lingkaran.Hitung(Lingkaran.nDiameter,Lingkaran.nKeliling,Lingkaran.nJarijari,Lingkaran.nLuas);
    }
    
}
