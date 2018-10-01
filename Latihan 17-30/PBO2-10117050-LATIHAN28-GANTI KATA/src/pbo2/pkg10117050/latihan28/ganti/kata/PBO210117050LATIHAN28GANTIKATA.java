/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENGGANTI/MERUBAH KATA 
 * YANG TELAH DI INPUTKAN OLEH USER
 */
package pbo2.pkg10117050.latihan28.ganti.kata;

import java.util.Scanner;

public class PBO210117050LATIHAN28GANTIKATA {

    public static void main(String[] args) {

        String Kalimat;
        String nGanti,nJadi;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata : ");
        nGanti = scanner.nextLine();
        
        System.out.print("Menjadi Kata : ");
        nJadi = scanner.nextLine();
                      
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("ADALAH : "+ganti);        
    }

}
