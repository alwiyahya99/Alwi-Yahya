/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menampilkan target saldo tabungan
 * Saldo awal Rp.3.500.00 , Bungan 8% , saldo target Rp.6.000.000
 */
package pbo2.pkg10117050.latihan20.target.saldo.tabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
//import java.text.NumberFormat;
//import java.util.Locale;

public class PBO210117050LATIHAN20TARGETSALDOTABUNGAN {

    public static void main(String[] args) {

        int nSaldo, nBungan, bulan;

        nSaldo = 3500000;
        bulan = 1;

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        while (nSaldo <= 6000000) {

            nSaldo = (int) ((nSaldo * 0.08) + nSaldo);
            //System.out.printf("Saldo di bulan ke-" + bulan + " Rp.%,-10d%n", nSaldo);
            System.out.printf("Saldo di bulan ke-" + bulan + " Rp.%s \n", kursIndonesia.format(nSaldo));
            bulan = bulan + 1;

        }
    }

}
