/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung gaji pegawai
 */
package pbo2.pkg10117050.latihan43.gaji.pegawai;

import java.util.Scanner;

/**
 *
 * @author ZeroXploit
 */
public class PBO210117050LATIHAN43GAJIPEGAWAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        GajiPegawai gajipegawai = new GajiPegawai();
        
        gajipegawai.setNama("Rizki Adam");
        gajipegawai.setAlamat("Jalan Semar dlm 4 No 72/66");
        gajipegawai.setUangTransport(250000);
        gajipegawai.setUangTunjangan(300000);
        gajipegawai.setGajiPokok(4500000);
        gajipegawai.setTotalGaji(gajipegawai.getTotalGaji());
        
        gajipegawai.tampilData(gajipegawai.getNama(),
                gajipegawai.getAlamat(),
                gajipegawai.getUangTransport(),
                gajipegawai.getUangTunjangan(),
                gajipegawai.getGajiPokok(), 
                gajipegawai.getTotalGaji());
        
    }
    
}
