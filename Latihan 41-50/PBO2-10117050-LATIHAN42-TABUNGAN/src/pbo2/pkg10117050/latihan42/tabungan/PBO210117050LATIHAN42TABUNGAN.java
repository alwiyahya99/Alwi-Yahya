/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung saldo tabungan
 */
package pbo2.pkg10117050.latihan42.tabungan;

import java.util.Scanner;

public class PBO210117050LATIHAN42TABUNGAN {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan ntabungan = new Tabungan(scn.nextInt());
        
        System.out.print("Jumlah yang mau di ambil : ");
        ntabungan.ambilUang(scn.nextInt());
        
        System.out.println("Saldo anda sekarang : " + ntabungan.ambilUang(0));
    }

}
