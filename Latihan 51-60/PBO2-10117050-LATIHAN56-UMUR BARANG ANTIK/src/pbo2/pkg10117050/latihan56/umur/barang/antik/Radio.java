/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan nama dan umur suatu barang
 */
package pbo2.pkg10117050.latihan56.umur.barang.antik;

/**
 *
 * @author ZeroXploit
 */
public class Radio extends BarangAntik {

    private String name;

    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
