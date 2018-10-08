/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan bilangan terkecil dan terbesar
 * yang memanggil clas dari clas Nilai.java 
 */
package pbo2.pkg10117050.latihan39.nilai.terbesar.dan.terkecil;

import java.util.Scanner;

public class NILAITERBESARDANTERKECIL {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Nilai nNilai = new Nilai();
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        nNilai.Nama = input.nextLine();
        
        System.out.print("Masukkan Banyak Mahasiswa : ");
        nNilai.nBanyak = input.nextInt();
        nNilai.NilaiBesarKecil(nNilai.i, nNilai.nBanyak, nNilai.nilai);
        System.out.println("");
        System.out.println("Petugas : " + nNilai.Nama);
    }

}
