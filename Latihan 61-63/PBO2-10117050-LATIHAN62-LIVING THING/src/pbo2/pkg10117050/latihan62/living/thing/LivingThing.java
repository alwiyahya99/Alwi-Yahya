/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan nama dan kegiatan dengan metode abstrak
 */
package pbo2.pkg10117050.latihan62.living.thing;

public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama + " Bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama + " Makan");
    }
}
