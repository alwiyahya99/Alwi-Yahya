/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung gaji pegawai
 */
package pbo2.pkg10117050.latihan43.gaji.pegawai;

public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return uangTunjangan + uangTransport + gajiPokok;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTrnsport, int gajiPokok){       
        return uangTunjangan + uangTrnsport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){               
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan : "+ nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Uang Transport : " + uangTransport);
        System.out.println("Uang Tunjangan : " + uangTunjangan);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("TOTAL GAJI : " + totalGaji);
        
    }
}
