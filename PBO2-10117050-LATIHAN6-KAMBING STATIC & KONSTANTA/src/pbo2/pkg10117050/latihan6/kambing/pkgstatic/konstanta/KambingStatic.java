/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menampilkan data kambing 
 * dengan variabel STATIK dan NAMA_KAMBING sebagai konstanta
 */
package pbo2.pkg10117050.latihan6.kambing.pkgstatic.konstanta;

public class KambingStatic {    
    // NAMA_KAMBING sebagai konstanta   
    public static final String NAMA_KAMBING = "MIDUN"; 
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
        
    }

}
