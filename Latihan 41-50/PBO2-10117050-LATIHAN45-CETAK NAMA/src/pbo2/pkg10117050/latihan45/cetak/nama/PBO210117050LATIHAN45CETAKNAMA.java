/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program mencetak nama sesuai jumlah yang dimasukan
 */
package pbo2.pkg10117050.latihan45.cetak.nama;

import java.util.Scanner;

/**
 *
 * @author ZeroXploit
 */
public class PBO210117050LATIHAN45CETAKNAMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Printer nprinter = new Printer();
        
        System.out.print("Masukan nama anda : ");
        nprinter.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali : ");
        nprinter.setJmlCetak(scn.nextInt());
        System.out.print("Nama anda : " + nprinter.getNama() + "\n");
        System.out.print("Hasil cetak : ");
        System.out.println(nprinter.getJmlCetak());             
        
        nprinter.cetak(nprinter.getJmlCetak(), nprinter.getNama());
    }
    
}
