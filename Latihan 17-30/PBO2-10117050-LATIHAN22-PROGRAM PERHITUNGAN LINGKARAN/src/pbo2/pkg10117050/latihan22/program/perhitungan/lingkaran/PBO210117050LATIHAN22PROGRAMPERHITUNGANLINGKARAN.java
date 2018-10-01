/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program MENGHITUNG LINGKARAN
 */
package pbo2.pkg10117050.latihan22.program.perhitungan.lingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PBO210117050LATIHAN22PROGRAMPERHITUNGANLINGKARAN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double PHI = 3.14159265358979323846;
        double nKeliling, nDiameter = 0, nJarijari, nLuas;

        do {
            System.out.print("Masukan nilai diameter lingkaran : ");
            try {
                nDiameter = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Nilai diameter tidak sesuai");
                scanner.nextLine();
            }
        } while (nDiameter == 0);

        nJarijari = nDiameter / 2;
        nLuas = (float) (PHI * (nJarijari * nJarijari));
        nKeliling = (PHI * nDiameter);

        DecimalFormat DF = new DecimalFormat("#.##");
        System.out.printf("Jari-jari Lingkaran \t= %s%n", DF.format(nJarijari));
        System.out.printf("Luas Lingkaran \t\t= %s%n", DF.format(nLuas));
        System.out.printf("Keliling Lingkaran \t= %s%n", DF.format(nKeliling));
    }

}
