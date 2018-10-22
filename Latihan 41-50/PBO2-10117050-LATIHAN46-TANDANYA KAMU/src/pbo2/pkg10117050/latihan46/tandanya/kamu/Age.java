/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung dan menampilkan umur dan statusnya
 */
package pbo2.pkg10117050.latihan46.tandanya.kamu;

public class Age {
    private int yearBirth;
    private int yearNow;
    private String red  = "\u001b[31m";
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow-yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        if (umur >= 0 && umur <= 5) {
            System.out.println("Tandanya kamu "+ red +"LAGI LUCU-LUCUNYA");
        } else if (umur > 5  && umur <= 10) {
            System.out.println("Tandanya kamu "+ red +"MASIH ANAK-ANAK");
        } else if (umur > 10  && umur <= 13) {
            System.out.println("Tandanya kamu "+ red +"MASIH REMAJA");
        } else if (umur > 13  && umur <= 19) {
            System.out.println("Tandanya kamu "+ red +"4L4Y");
        } else if (umur > 19  && umur <= 29) {
            System.out.println("Tandanya kamu "+ red +"LAGI GALAU NYARI JODOH");
        } else if (umur > 29  && umur <= 35) {
            System.out.println("Tandanya kamu "+ red +"LAGI SIBUK NYARI UANG");
        } else if (umur > 35  && umur <= 150) {
            System.out.println("Tandanya kamu "+ red +"SUDAH TUA");
        } else if (umur > 0  && umur < 150) {
            System.out.println("Tandanya kamu "+ red +"TIDAK TERDETEKSI DI KEHIDUPAN");
        }
        return red;
    }
}
