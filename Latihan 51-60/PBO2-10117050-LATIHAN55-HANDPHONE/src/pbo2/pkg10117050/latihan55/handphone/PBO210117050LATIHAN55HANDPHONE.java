/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan prodak handphone
 */
package pbo2.pkg10117050.latihan55.handphone;

public class PBO210117050LATIHAN55HANDPHONE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Handphone nHandphone1 = new Handphone(" Samsung", " Android", "Grand", 3000000);
        Android nAndroid = new Android(nHandphone1.manufacture, nHandphone1.operationalSystem,
                nHandphone1.model, nHandphone1.harga);
        nAndroid.setKeyStone("234ibfd3840fo");
        nHandphone1.displayProduct();
        System.out.println("Android Key Store : " + nAndroid.getKeyStone());
        System.out.println("");
        
        Handphone nHandphone2 = new Handphone("BlackB", "RIM", "Curve", 2000000);
        BlackBerry nBlackBerry = new BlackBerry(nHandphone2.manufacture, nHandphone2.operationalSystem,
                nHandphone2.model, nHandphone2.harga);
        nBlackBerry.setPinBB("BHS249");
        nHandphone2.displayProduct();
        System.out.println("PIN : " + nBlackBerry.getPinBB());
        System.out.println("");

        Handphone nHandphone3 = new Handphone("Nokia", "Win9", "Lumia", 1000000);
        WindowsPhone nWindowsPhone = new WindowsPhone(nHandphone3.manufacture, nHandphone3.operationalSystem,
                nHandphone3.model, nHandphone3.harga);
        nWindowsPhone.setWpKeyStone("UUUQIJWOR");
        nHandphone3.displayProduct();
        System.out.println("Wp Key Store : " + nWindowsPhone.getWpKeyStone());

    }

}
