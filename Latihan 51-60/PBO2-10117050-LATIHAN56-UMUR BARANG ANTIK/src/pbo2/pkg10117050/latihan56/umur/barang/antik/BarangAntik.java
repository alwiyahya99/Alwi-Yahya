/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan nama dan umur suatu barang
 */
package pbo2.pkg10117050.latihan56.umur.barang.antik;

/**
 *
 * @author ZeroXploit
 */
public class BarangAntik {
    int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tammpilUmur(){
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun");
    }
}
