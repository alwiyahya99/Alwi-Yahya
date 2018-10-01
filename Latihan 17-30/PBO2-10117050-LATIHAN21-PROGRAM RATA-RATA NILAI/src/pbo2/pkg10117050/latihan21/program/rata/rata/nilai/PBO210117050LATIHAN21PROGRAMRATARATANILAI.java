/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menampilkan rata-rata nilai mahasiswa
 */
package pbo2.pkg10117050.latihan21.program.rata.rata.nilai;

import java.util.Scanner;

public class PBO210117050LATIHAN21PROGRAMRATARATANILAI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nBanyak, jml, nilai[];
        float rata, jumlah = 0;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        nBanyak = input.nextInt();

        nilai = new int[nBanyak];

        for (int i = 0; i <= nBanyak - 1; i++) {
            System.out.print("Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }

        for (int j = 0; j <= nBanyak - 1; j++) {
            jumlah = jumlah + nilai[j];
        }

        rata = jumlah / nBanyak;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata);
        System.out.println("Developed by : Alwi Yahya Muljabar");
    }

}
