/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk membandingkan 2 buah nilai
 */
package pbo2.pkg10117050.latihan24.perbandingan.dua.buah.nilai;

import java.util.Scanner;

public class PBO210117050LATIHAN24PERBANDINGANDUABUAHNILAI {

    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        int nNilai1, nNilai2, Hasil, i;
        String jawaban, perintah;

        boolean ulang = true;

        while (ulang == true) {
            System.out.print("Masukan Nilai Pertama : ");
            Scanner scanner = new Scanner(System.in);
            nNilai1 = scanner.nextInt();

            System.out.print("Masukan Nilai Kedua : ");
            nNilai2 = scanner.nextInt();

            jawaban = (nNilai1 > nNilai2 ? "besar" : "kecil");

            System.out.println("Hasil : " + nNilai1 + " Lebih " + jawaban + " dari " + nNilai2);

            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            perintah = scanner.next();

            if (perintah.equals("tidak")) {
                ulang = false;
                System.out.println("Keluar");
                
            } else {
                System.out.print("Masukan Nilai Pertama : ");
                nNilai1 = scanner.nextInt();

                System.out.print("Masukan Nilai Pertama : ");
                nNilai2 = scanner.nextInt();

                jawaban = (nNilai1 > nNilai2 ? "besar" : "kecil");

                System.out.println("Hasil : " + nNilai1 + " Lebih " + jawaban + " dari " + nNilai2);

                System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
                perintah = scanner.next();
            }
        }
    }

}
