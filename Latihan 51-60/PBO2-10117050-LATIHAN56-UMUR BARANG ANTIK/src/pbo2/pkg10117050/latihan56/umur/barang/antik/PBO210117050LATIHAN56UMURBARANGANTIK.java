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
public class PBO210117050LATIHAN56UMURBARANGANTIK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BarangAntik nBarangAntik = new BarangAntik(234);
        Radio nRadio = new Radio(nBarangAntik.umur);
        nRadio.setName("Radio AM");
        
        System.out.println("Nama barang antik : " + nRadio.getName());
        nBarangAntik.tammpilUmur();
    }
    
}
