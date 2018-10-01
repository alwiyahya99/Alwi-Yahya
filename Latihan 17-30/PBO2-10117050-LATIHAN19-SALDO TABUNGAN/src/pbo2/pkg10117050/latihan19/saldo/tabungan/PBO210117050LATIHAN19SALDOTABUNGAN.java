/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menampilkan saldo tabungan
 * Saldo awal Rp.2.500.000 , Bungan 15% , Lama(Bulan) 6.
 */
package pbo2.pkg10117050.latihan19.saldo.tabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PBO210117050LATIHAN19SALDOTABUNGAN {

    public static void main(String[] args) {

        int nSaldo, bulan;
        double nBungan;

        nSaldo = 2500000;
        bulan = 1;

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        while (bulan <= 6) {

            nSaldo = (int) (nSaldo + (nSaldo * 0.15));
            System.out.printf("Saldo di bulan ke-" + bulan + " Rp.%s \n", kursIndonesia.format(nSaldo));
            bulan = bulan + 1;

        }

    }

}
