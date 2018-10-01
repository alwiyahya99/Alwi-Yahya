/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan total gajih
 * bersih dan kotor karyawan dan beberapa tunjangan
 */
package pbo2.pkg10117050.latihan17.program.tunjanagan;

import java.util.Scanner;

/**
 *
 * @author ZeroXploit
 */
public class PBO210117050LATIHAN17PROGRAMTUNJANAGAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String status;
        int gajiPokok;
        double tunJangan, totalGaji;

        System.out.println("===========Program Tunjangan=============");
        System.out.print("Berapa gaji pokok anda perbulan?: ");
        gajiPokok = scanner.nextInt();

        System.out.print("Status Anda ?  (Menikah/Belum)  : ");
        status = scanner.next();

        tunJangan = (status.equalsIgnoreCase("Menikah")) ? gajiPokok * 0.35 : 0;
        
        totalGaji = tunJangan + gajiPokok;

        System.out.println("\n");
        System.out.println("===========Hasil Perhitungan=============");
        System.out.println("Gaji Pokok               : " + gajiPokok);
        System.out.println("Tunjangan Gaji           : " + tunJangan);
        System.out.println("Total Gaji               : " + totalGaji);
        System.out.println("(Develop By : Alwi Yahya Muljabar)");

    }
    
}
