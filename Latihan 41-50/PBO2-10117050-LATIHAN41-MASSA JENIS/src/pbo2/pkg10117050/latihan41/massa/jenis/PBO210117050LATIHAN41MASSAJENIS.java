/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung massa jenis kubus
 */
package pbo2.pkg10117050.latihan41.massa.jenis;

import java.util.Scanner;

public class PBO210117050LATIHAN41MASSAJENIS {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Kubus KBS = new Kubus();
        
        System.out.println("======Massa Jenis Kubus=====");
        KBS.setSisi(5);
        KBS.setMassa(125);
        
        System.out.print("Sisi \t: "+ KBS.getSisi()+"\n");
        System.out.print("Massa \t: "+ KBS.getMassa()+"\n");
        
        System.out.println("");
        System.out.println("======Hasil Perhitungan=====");
        System.out.println("Volume : " + KBS.hitungVolume(5));
        System.out.println("Massa Jenis : "+ KBS.hitungMassaJenis(250, 125));     
        
    }
    
}
