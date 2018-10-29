/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan warna dan dan sumbu kordinat
 */
package pbo2.pkg10117050.latihan54.kordinat;

public class PBO210117050LATIHAN54KORDINAT {

    public static void main(String[] args) {

        WarnaKoordinat nWarnaKoordinat = new WarnaKoordinat("Jingga", 10, 4);
        System.out.println("Warna Koordinat : " + nWarnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + nWarnaKoordinat.getX() +", y : " + nWarnaKoordinat.getY());
    }

}
