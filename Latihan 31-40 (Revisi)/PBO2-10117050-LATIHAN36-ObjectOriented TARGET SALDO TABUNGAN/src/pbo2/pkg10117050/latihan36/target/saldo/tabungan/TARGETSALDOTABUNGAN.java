/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung saldo bulanan
 */
package pbo2.pkg10117050.latihan36.target.saldo.tabungan;

public class TARGETSALDOTABUNGAN {

    public static void main(String[] args) {

        targetSaldo saldo = new targetSaldo();
        saldo.nSaldo = 3500000;
        saldo.bulan = 1;

        saldo.hitungSaldo(saldo.nSaldo, saldo.bulan);

    }

}
