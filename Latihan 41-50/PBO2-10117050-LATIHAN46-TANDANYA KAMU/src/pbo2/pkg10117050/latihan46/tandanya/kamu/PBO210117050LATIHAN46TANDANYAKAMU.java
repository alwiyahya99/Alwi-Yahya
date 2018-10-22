/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung dan menampilkan umur dan statusnya
 */
package pbo2.pkg10117050.latihan46.tandanya.kamu;

import java.util.Scanner;

/**
 *
 * @author ZeroXploit
 */
public class PBO210117050LATIHAN46TANDANYAKAMU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Age nAge = new Age(2018);
        
        System.out.print("Masukan tahun lahir anda : ");
        nAge.setYearBirth(scn.nextInt());
        System.out.println("");
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + nAge.getYearBirth());
        System.out.println("Hari ini tahun : " + nAge.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + nAge.hitungUmur() + " tahun");
        nAge.tandanyaKamu(nAge.hitungUmur());
    }
    
}
