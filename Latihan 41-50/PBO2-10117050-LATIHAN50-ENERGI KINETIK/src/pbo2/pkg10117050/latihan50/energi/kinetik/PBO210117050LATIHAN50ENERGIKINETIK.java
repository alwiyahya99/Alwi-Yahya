/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menghitung energi kinetik dan menghitung usahanya
 */
package pbo2.pkg10117050.latihan50.energi.kinetik;

public class PBO210117050LATIHAN50ENERGIKINETIK {

    public static void main(String[] args) {
        
        Energi nkinetik = new Energi();        
        nkinetik.setMassa(145);
        nkinetik.setKecepatan(25);
        
        System.out.println("Sebuah bola baseball dengan massa "+ nkinetik.getMassa() +" g dilempar dengan kecepatan "+ nkinetik.getKecepatan() +" m/s. \n"
                + "a. Berapakah energi kinetiknya ? \n"
                + "b. Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini, jika dimulai \n"
                + "   dari keadaan diam ? "); 
        System.out.println("");
        System.out.println("Energi Kinetik : " + nkinetik.hitungEmergiKinetik(nkinetik.getMassa(), nkinetik.getMassa()) + " Joul");
        System.out.println("Usaha yang dilakukan pada bola : " + (int)nkinetik.usaha());
        System.out.println("P.S : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    
}
