/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN EJAAN HURUF 
 * YANG DI INPUTKAN OLEH USER
 */
package pbo2.pkg10117050.latihan25.ejaan.nama;

import java.util.Scanner;

public class PBO210117050LATIHAN25EJAANNAMA {

    public static void main(String[] args) {

        String Nama;
        int Panjang;
        char huruf;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama depan anda untuk di eja : ");
        Nama = scanner.nextLine();
        
        Panjang = Nama.length();
        
        System.out.println("Ejaan untuk "+Nama+" adalah : ");
        
        for (int i = 0; i < Panjang; i++) {
            System.out.println("Huruf ke-" + (i+1) + " : " + Nama.charAt(i));
        }
    }
}
