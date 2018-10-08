package pbo2.pkg10117050.latihan17.program.tunjanagan;

public class Gaji {

    public int gajiPokok;
    public String status;
    public double tunjangan, totalGaji;

    public void programTunjangan(int pargajiPokok, String parStatus, double parTunjangan, double parTotalGaji) {

        parTunjangan = (parStatus.equalsIgnoreCase("Menikah")) ? pargajiPokok * 0.35 : 0;

        parTotalGaji = parTunjangan + pargajiPokok;

        System.out.println("\n");
        System.out.println("===========Hasil Perhitungan=============");
        System.out.println("Gaji Pokok Anda \t: " + pargajiPokok);
        System.out.println("Status Anda \t\t: " + parStatus);
        System.out.println("Tunjangan Anda \t\t: " + parTunjangan);
        System.out.println("Total Gaji \t\t: " + parTotalGaji);
    }

}
