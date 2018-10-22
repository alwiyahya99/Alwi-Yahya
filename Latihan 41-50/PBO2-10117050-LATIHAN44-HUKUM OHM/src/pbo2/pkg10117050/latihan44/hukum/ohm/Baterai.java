
/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitunh OHM
 */
package pbo2.pkg10117050.latihan44.hukum.ohm;

public class Baterai {

    private float kuatArus;
    private float hambatan;

    public Baterai() {
        System.out.println("=====HUKUM OHM=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar \n"
                + "akan berbanding lurus dengan beda potensial \n"
                + "pada ujung-ujung kawat penghantar tersen=but \n"
                + "salkan suhu kawat dijaga konstan.");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}
