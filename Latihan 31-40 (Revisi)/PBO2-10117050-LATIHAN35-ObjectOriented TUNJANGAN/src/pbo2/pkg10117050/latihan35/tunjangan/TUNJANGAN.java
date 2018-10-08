/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung gaji karyawan
 */
package pbo2.pkg10117050.latihan35.tunjangan;

import java.util.Scanner;

public class TUNJANGAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Gaji gaji = new Gaji();
        System.out.println("======Program Tunjangan======");
        Scanner scn = new Scanner(System.in);

        System.out.print("Berapa gaji pokok anda perbulan : ");
        gaji.gajiPokok = scn.nextInt();
        
        System.out.print("Status Anda (menikah/belum) : ");
        gaji.status = scn.next();

        gaji.programTunjangan(gaji.gajiPokok, gaji.status, gaji.tunjangan, gaji.totalGaji);
        System.out.println("(Develop By : Alwi Yahya Muljabar)");
    }

    
}
