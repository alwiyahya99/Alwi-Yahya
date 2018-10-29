/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menghitung bangun ruang
 */
package pbo2.pkg10117050.latihan61.bangun.datar;

public class MAIN {

    public static void main(String[] args) {
        // TODO code application logic here

        Bola nBola = new Bola();
        Tabung nTabung = new Tabung();
        Kerucut nKerucut = new Kerucut();

        nBola.setR(7);
        System.out.println("1. Volume Bola :");
        System.out.printf("    Hasil = %,12.1f%n", (double) nBola.hitungVolume(), "cm3") ;
        System.out.println("");

        nTabung.setH(21);
        nTabung.setR(10);
        System.out.println("2. Volume Tabung : ");
        System.out.println("   Hasil = " + (int) nTabung.hitungVolume()+"cm3");
        System.out.println("");

        nKerucut.setR(14);
        nKerucut.setT(9);

        System.out.println("3. Volume Kerucut : ");
        System.out.println("   Hasil = " + (int) nKerucut.hitungVolume()+"cm3");

    }

}
