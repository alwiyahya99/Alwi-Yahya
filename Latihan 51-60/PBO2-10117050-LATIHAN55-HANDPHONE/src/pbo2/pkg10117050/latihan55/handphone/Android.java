/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan prodak handphone
 */
package pbo2.pkg10117050.latihan55.handphone;

/**
 *
 * @author ZeroXploit
 */
public class Android extends Handphone{

    private String keyStone;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getKeyStone() {
        return keyStone;
    }

    public void setKeyStone(String keyStone) {
        this.keyStone = keyStone;
    }

}
