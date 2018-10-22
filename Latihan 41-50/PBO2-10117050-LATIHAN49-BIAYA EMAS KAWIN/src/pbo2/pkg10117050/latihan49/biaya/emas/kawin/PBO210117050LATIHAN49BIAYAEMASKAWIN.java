/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menghitung Biaya Mas Kawin
 */
package pbo2.pkg10117050.latihan49.biaya.emas.kawin;

public class PBO210117050LATIHAN49BIAYAEMASKAWIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biaya nbiaya = new Biaya();
        nbiaya.setBerat(15.7);
        nbiaya.setHarga(570000);
        System.out.println("Hendi akan membeli emas kawin sebagai mahar nikah nya \n"
                + "dengan total seberat 15,7 gram. jika harga 1 gram emas \n"
                + "per bulan oktober ini adalah Rp 570.000. Berapa total \n"
                + "bayar yang harus dikeluarkan oleh dendi?");
        
        System.out.println("Total bayar : Rp " + (int)nbiaya.hitungBiayaEmas(nbiaya.getBerat(), nbiaya.getHarga()));
    }
    
}
