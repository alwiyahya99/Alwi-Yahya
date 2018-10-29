/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan haji karyawan
 */
package pbo2.pkg10117050.latihan51.gaji.karyawan;

import java.util.Scanner;

public class PBO210117050LATIHAN51GAJIKARYAWAN {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        Karyawan nKaryawan = new Karyawan();
        Manager nManager = new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK : ");
        nKaryawan.setNik(scn.next());
        System.out.print("Masukan Nama : ");
        nKaryawan.setNama(scn1.nextLine());       
        System.out.print("Masukan Golongan (1/2/3) : ");
        nKaryawan.setGolongan(scn.nextInt());
        System.out.print("Masukan jabatan (Manager/Kabag) : ");
        nKaryawan.setJabatan(scn.next());
        System.out.print("Masukan jumlah kehadiran : ");
        nManager.setKehadiran(scn.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK \t: "+ nKaryawan.getNik());
        System.out.println("NAMA \t: "+nKaryawan.getNama());
        System.out.println("GOLONGAN: "+nKaryawan.getGolongan());
        System.out.println("JABATAN : "+nKaryawan.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN \t: " + nManager.tunjanganGolongan(nKaryawan.getGolongan()));
        System.out.println("TUNJANGAN JABATAN \t: " + nManager.tunjanganJabatan(nKaryawan.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN \t: " + nManager.tunjanganKehadiran(nManager.getKehadiran()));
        
        
    }
    
}
