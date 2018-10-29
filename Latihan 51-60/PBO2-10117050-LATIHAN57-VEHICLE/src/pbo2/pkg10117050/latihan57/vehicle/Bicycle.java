/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan spesifikasi alat olahraga
 */
package pbo2.pkg10117050.latihan57.vehicle;

/**
 *
 * @author ZeroXploit
 */
public class Bicycle extends Vehicle{

    private int myGearCount;

    public Bicycle() {
        System.out.println("Bicycle");
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }

}
