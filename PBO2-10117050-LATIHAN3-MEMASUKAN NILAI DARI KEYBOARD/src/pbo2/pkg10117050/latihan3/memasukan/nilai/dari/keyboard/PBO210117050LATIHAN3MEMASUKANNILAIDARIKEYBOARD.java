/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk memasukan nilai 
 * dari keyboard
 */
package pbo2.pkg10117050.latihan3.memasukan.nilai.dari.keyboard;

import java.util.Scanner;
/**
 *
 * @author ZeroXploit
 */
public class PBO210117050LATIHAN3MEMASUKANNILAIDARIKEYBOARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah : " + nama);
    }
    
}
