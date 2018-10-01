/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan nilai terkecil dan terbesar
 */
package pbo2.pkg10117050.latihan23.nilai.terbesar.dan.terkecil;

import java.util.Scanner;

public class PBO210117050LATIHAN23NILAITERBESARDANTERKECIL {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, nBanyak, nilai[];
        float rata = 0;
        String Nama;

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        Nama = input.nextLine();

        System.out.print("Masukkan Banyak Mahasiswa : ");
        nBanyak = input.nextInt();

        nilai = new int[20];

        for (i = 1; i <= nBanyak; i++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-" + i + " : ");
            nilai[i] = input.nextInt();
        }

        System.out.println("");
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= nBanyak; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }

        System.out.println("");
        int max = 0;
        int min = nilai[0];
        for (int val : nilai) {
            if (max < val) {
                max = val;
                System.out.println("Nilai terbesar adalah " + max);
            } else if (min > val) {
                min = val;
                System.out.println("Nilai terkecil adalah " + min);
            }
        }

        System.out.println("Petugas : " + Nama);

    }

}
