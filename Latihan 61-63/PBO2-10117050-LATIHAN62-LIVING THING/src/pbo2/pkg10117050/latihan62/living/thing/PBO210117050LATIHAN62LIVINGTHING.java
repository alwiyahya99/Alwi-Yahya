/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan nama dan kegiatan dengan metode abstrak
 */
package pbo2.pkg10117050.latihan62.living.thing;

public class PBO210117050LATIHAN62LIVINGTHING {

    public static void main(String[] args) {

        Human nHuman = new Human();
        nHuman.setNama("Rizki Adam Kurniawan");
        nHuman.walk(nHuman.getNama());       
        nHuman.breath("Rizki Adam Kurniawan");
        nHuman.eat("Rizki Adam Kurniawan");
    }

}
