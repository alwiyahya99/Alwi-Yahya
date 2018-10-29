/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan spesifikasi alat olahraga
 */
package pbo2.pkg10117050.latihan57.vehicle;

/**
 *
 * @author ZeroXploit
 */
public class PBO210117050LATIHAN57VEHICLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vehicle nVehicle1 = new Vehicle();
        Vehicle nVehicle2 = new Vehicle();

        Bicycle nBicycle = new Bicycle();
        nVehicle1.setMyBrand("Trek Bike");
        nVehicle1.setMyModel("7.4FX");
        nBicycle.setMyGearCount(23);
        System.out.println("Brand : " + nVehicle1.getMyBrand());
        System.out.println("Model : " + nVehicle1.getMyModel());
        System.out.println("Jumlah Gear : " + nBicycle.getMyGearCount());
        System.out.println("");

        Skateboard nSkateboard = new Skateboard();
        nVehicle2.setMyBrand("Ally Skate");
        nVehicle2.setMyModel("Rocket");
        nSkateboard.setMyBoardLenght(54.5);
        System.out.println("Brand : " + nVehicle2.getMyBrand());
        System.out.println("Model : " + nVehicle2.getMyModel());
        System.out.println("Panjang Board : " + nSkateboard.getMyBoardLenght());

    }

}
