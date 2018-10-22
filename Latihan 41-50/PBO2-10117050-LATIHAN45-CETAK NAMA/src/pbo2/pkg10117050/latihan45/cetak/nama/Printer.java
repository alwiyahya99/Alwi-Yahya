/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program mencetak nama sesuai jumlah yang dimasukan
 */
package pbo2.pkg10117050.latihan45.cetak.nama;

public class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama anda : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama){
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i+" "+nama);
        }
    }
}
