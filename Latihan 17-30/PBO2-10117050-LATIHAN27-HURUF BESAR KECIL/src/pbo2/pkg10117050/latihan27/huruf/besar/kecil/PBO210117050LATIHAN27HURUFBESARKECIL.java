/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENGUBAH HURURF BESAR DAN KECIL
 */
package pbo2.pkg10117050.latihan27.huruf.besar.kecil;

import java.util.Scanner;

public class PBO210117050LATIHAN27HURUFBESARKECIL {

    public static void main(String[] args) {

        String Kalimat;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();

        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("====Hasil Formating====");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf kecil = " + Kecil);
    }

}
