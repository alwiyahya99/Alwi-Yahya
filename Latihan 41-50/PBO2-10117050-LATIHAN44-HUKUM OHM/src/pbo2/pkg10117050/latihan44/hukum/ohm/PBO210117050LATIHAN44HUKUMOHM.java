/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitunh OHM
 */
package pbo2.pkg10117050.latihan44.hukum.ohm;

import java.util.Scanner;

public class PBO210117050LATIHAN44HUKUMOHM {

    public static void main(String[] args) {

        Scanner scn1 = new Scanner(System.in);

        Baterai btr1 = new Baterai();
        Baterai btr2 = new Baterai(3, 12);

        System.out.println("");
        System.out.println("Kuat Arus : " + btr2.getHambatan() + " ampere");
        System.out.println("Hambatan : " + btr2.getKuatArus() + " ohm");
        System.out.println("Hasil Tegangan : " + btr2.hitungTegangan() + " volt");
    }

}
