/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan anggota organisasi akatsuki
 */
package pbo2.pkg10117050.latihan60.akatsuki;

public class Akatsuki {

    protected String nama;
    protected String asal;
    protected String pasangan;
    protected String cincin;
    protected String ciri;

    public Akatsuki(String parNama, String parAsal, String parPasangan, String parCincin, String parCiri) {
        this.nama = parNama;
        this.asal = parAsal;
        this.pasangan = parPasangan;
        this.cincin = parCincin;
        this.ciri = parCiri;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getPasangan() {
        return pasangan;
    }

    public String getCincin() {
        return cincin;
    }

    public String getCiri() {
        return ciri;
    }

    public void tampilAnggota() {
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Asal Desa \t: " + asal);
        System.out.println("pasangan \t: " + pasangan);
        System.out.println("Cincin \t\t: " + cincin);
        System.out.println("Ciri khas \t: " + ciri);

    }
}
