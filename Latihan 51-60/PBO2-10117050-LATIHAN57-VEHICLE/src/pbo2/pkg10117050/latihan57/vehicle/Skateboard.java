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
public class Skateboard extends Vehicle {

    private double myBoardLenght;

    public Skateboard() {
        System.out.println("Skateboard");
    }

    public double getMyBoardLenght() {
        return myBoardLenght;
    }

    public void setMyBoardLenght(double boardLenght) {
        this.myBoardLenght = boardLenght;
    }

}
