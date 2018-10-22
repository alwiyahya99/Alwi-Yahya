/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program kalkulator sederhana
 */
package pbo2.pkg10117050.latihan48.kalkulator;

public class PBO210117050LATIHAN48KALKULATOR {

    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator nkalkulator = new Kalkulator();
        nkalkulator.setValue1(7);
        nkalkulator.setValue2(5);
        System.out.println("VALUE 1 = " + nkalkulator.getValue1());
        System.out.println("VALUE 2 = " + nkalkulator.getValue2());
        nkalkulator.setNameProject();
        nkalkulator.setNoteProject(null);
        System.out.println("Result Add is = " + nkalkulator.add(nkalkulator.getValue1(), nkalkulator.getValue2()));
        System.out.println("Result Minus is = " + nkalkulator.minus(nkalkulator.getValue1(), nkalkulator.getValue2()));
        System.out.println("Result Multiple is = " + nkalkulator.multiplication(nkalkulator.getValue1(), nkalkulator.getValue2()));
        System.out.println("Result Division is = " + nkalkulator.division(nkalkulator.getValue1(), nkalkulator.getValue2()));
    }
    
}
