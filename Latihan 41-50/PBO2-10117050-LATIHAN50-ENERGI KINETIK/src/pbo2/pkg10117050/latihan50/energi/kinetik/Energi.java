/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menghitung energi kinetik dan menghitung usahanya
 */
package pbo2.pkg10117050.latihan50.energi.kinetik;

public class Energi {
    private int massa;
    private int kecepatan;
    public int energiKinetik;
    public int energiKinetik2;
    
    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public int hitungEmergiKinetik(int parmassa, int parkecepatan){
        energiKinetik = (int) (0.5 * massa * kecepatan);
        return energiKinetik;
    }
    
    public void hitungEmergiKinetik2(int parmassa, int parkecepatan){
        this.energiKinetik2 = (int) (0.5 * parmassa * 0);
    }
    
    public double usaha(){
        return energiKinetik-energiKinetik2;
    }
}
