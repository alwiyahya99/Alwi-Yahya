/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung rata-rata nilai
 */
package pbo2.pkg10117050.latihan37.program.rata.rata.nilai;

import java.util.Scanner;

public class PROGRAMRATARATANILAI {

    public static void main(String[] args) {
        DataNilai inputdata = new DataNilai();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        inputdata.jumlah = input.nextInt();

        inputdata.inputNilaiMHS((int) inputdata.jumlah, inputdata.nilai, inputdata.jumlah, inputdata.rata);

    }

}
