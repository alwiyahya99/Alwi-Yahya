/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan data kambing
 * dengan variabel instance
 */
package pbo2.pkg10117050.latihan5.kambing.global;

public class KambingGlobal {
    //variabel jumlah kambong menjadi variabel instance
    int jumlahKambing = 88;
    
    //methode untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing : " + jumlahKambing);
    }
    
    //methode untuk menampilkan jumlah kambing
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
    }
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat pertama x program dijalankan 
        kambingSusu.getJumlahKambing();
        
        //menambahkan satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
