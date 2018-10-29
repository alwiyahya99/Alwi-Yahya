/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan anggota organisasi akatsuki
 */
package pbo2.pkg10117050.latihan60.akatsuki;

public class PBO210117050LATIHAN60AKATSUKI {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====AKATSUKI=====");
        Akatsuki nAkatsuki = new Akatsuki("Pain", 
                "Amegakure", 
                "Konan", 
                "Nol, (Tidak ada)", 
                "Memiliki besi hitam berupa tindikan \n \t\t  di hampir seluruh tubuh, rambut berwarna jingga.");
        Anggota nAnggota = new Anggota("Pemimpin", nAkatsuki.getNama(), nAkatsuki.getAsal(), nAkatsuki.getPasangan(), nAkatsuki.getCincin(), nAkatsuki.getCiri());
        nAkatsuki.tampilAnggota();
        nAnggota.tampilAnggota();
        System.out.println("");

        Akatsuki nAkatsuki1 = new Akatsuki("Konan", 
                "Amegakure", 
                "Konan", 
                "白 (\"Putih\")", 
                "Memiliki aksesoris origami bunga di kepala, berambut biru.");
        Anggota nAnggota1 = new Anggota("Pemimpin", nAkatsuki1.getNama(), nAkatsuki1.getAsal(), nAkatsuki1.getPasangan(), nAkatsuki1.getCincin(), nAkatsuki1.getCiri());
        nAkatsuki1.tampilAnggota();
        nAnggota1.tampilAnggota();
        System.out.println("");

        Akatsuki nAkatsuki2 = new Akatsuki("Zetsu", 
                "Chakra Kaguya Otsutsuki", 
                "Tobi/Obito Uchiha", 
                "亥 (\"Babi Hutan\")", 
                "Berwajah hitam dan putih, mempunyai dua kepribadian, \n\t\t  kanibal, memiliki kerudung kepala seperti tumbuhan venus.");
        Anggota nAnggota2 = new Anggota("Anggota", nAkatsuki2.getNama(), nAkatsuki2.getAsal(), nAkatsuki2.getPasangan(), nAkatsuki2.getCincin(), nAkatsuki2.getCiri());
        nAkatsuki2.tampilAnggota();
        nAnggota2.tampilAnggota();
        System.out.println("");

        Akatsuki nAkatsuki3 = new Akatsuki("Kisame Hoshigaki", 
                "Kirigakure", 
                "Itachi Uchiha", 
                "南 (\"Selatan\")", 
                "Memiliki Kulit seperti ikan hiu, bergigi seperti ikan hiu.");
        Anggota nAnggota3 = new Anggota("Anggota", nAkatsuki3.getNama(), nAkatsuki3.getAsal(), nAkatsuki3.getPasangan(), nAkatsuki3.getCincin(), nAkatsuki3.getCiri());
        nAkatsuki3.tampilAnggota();
        nAnggota3.tampilAnggota();
        System.out.println("");
        
        Akatsuki nAkatsuki4 = new Akatsuki("Tobi (Obito Uchiha)", 
                "Konohagakure", 
                "--", 
                "玉 (\"Berlian\")", 
                "Topeng jingga dengan satu lubang mata dengan \n\t\t  pola pusaran yang terpusat pada mata kanan. Mata kanannya memiliki Sharingan \n\t\t  dan topeng putih dengan tiga lubang dengan titik di tengah mirip seperti Sharingan. \n\t\t  Saat perang dunia shinobu keempat, mata kirinya berupa rinnegan.");
        Anggota nAnggota4 = new Anggota("Anggota", nAkatsuki4.getNama(), nAkatsuki4.getAsal(), nAkatsuki4.getPasangan(), nAkatsuki4.getCincin(), nAkatsuki4.getCiri());
        nAkatsuki4.tampilAnggota();
        nAnggota4.tampilAnggota();
        System.out.println("");
        
        Akatsuki nAkatsuki5 = new Akatsuki("Deidara", 
                "Iwagakure", 
                "Sasori, kemudian Tobi", 
                "青(\"Biru/Hijau\")", 
                "Berambut pirang dan dikuncir, spesialis ledakan menggunakan \n\t\t  "
                        + "tanah liat dengan mulut di telapak tangan dan dada, mata \n\t\t  "
                        + "kiri yang terlatih untuk meneropong dan menggagalkan genjutsu Sharingan");
        Anggota nAnggota5 = new Anggota("Anggota", nAkatsuki5.getNama(), nAkatsuki5.getAsal(), nAkatsuki5.getPasangan(), nAkatsuki5.getCincin(), nAkatsuki5.getCiri());
        nAkatsuki5.tampilAnggota();
        nAnggota5.tampilAnggota();
        System.out.println("");
        
        Akatsuki nAkatsuki6 = new Akatsuki("Hidan", 
                "Yugakure", 
                "Kakuzu", 
                "三 (\"Tiga\")", 
                "Tidak bisa Mati, membawa sabit besar bermata tiga, rambut cepak berwarna pucat");
        Anggota nAnggota6 = new Anggota("Anggota", nAkatsuki6.getNama(), nAkatsuki6.getAsal(), nAkatsuki6.getPasangan(), nAkatsuki6.getCincin(), nAkatsuki6.getCiri());
        nAkatsuki6.tampilAnggota();
        nAnggota6.tampilAnggota();
        System.out.println("");
        
        Akatsuki nAkatsuki7 = new Akatsuki("Kakuzu", 
                "akigakure", 
                "Hidan", 
                "北 (\"Utara\")", 
                "Memakai penutup wajah, dapat memperpanjang hidupnya dengan cara \n\t\t  "
                        + "mengambil jantung manusia, dapat memiliki lima jantung manusia secara bersamaan, \n\t\t  "
                        + "dapat menggunakan seluruh lima elemen chakra, tubuh terdiri dari jaring-jaring \n\t\t  "
                        + "untuk menyerang dan memanipulasi tubuh yang lain.");
        Anggota nAnggota7 = new Anggota("Anggota", nAkatsuki7.getNama(), nAkatsuki7.getAsal(), nAkatsuki7.getPasangan(), nAkatsuki7.getCincin(), nAkatsuki7.getCiri());
        nAkatsuki7.tampilAnggota();
        nAnggota7.tampilAnggota();
        System.out.println("");
        
        Akatsuki nAkatsuki8 = new Akatsuki("Orochimaru", 
                "Konohagakure, lalu pindah ke Otogakure", 
                "Sasori", 
                "空 (\"Langit\")", 
                "Berambut panjang berwarna hitam, berkulit pucat.");
        Anggota nAnggota8 = new Anggota("Anggota", nAkatsuki8.getNama(), nAkatsuki8.getAsal(), nAkatsuki8.getPasangan(), nAkatsuki8.getCincin(), nAkatsuki8.getCiri());
        nAkatsuki8.tampilAnggota();
        nAnggota8.tampilAnggota();
        System.out.println("");
        
        Akatsuki nAkatsuki9 = new Akatsuki("Sasori", 
                "Sunagakure", 
                "Orochimaru, lalu Deidara", 
                "玉 (\"Virgo\")", 
                "Berambut pendek berwarna merah. Bertubuh boneka sehingga \n\t\t  "
                        + "tidak bisa menua. Ahli racun.");
        Anggota nAnggota9 = new Anggota("Pemimpin", nAkatsuki9.getNama(), nAkatsuki9.getAsal(), nAkatsuki9.getPasangan(), nAkatsuki9.getCincin(), nAkatsuki9.getCiri());
        nAkatsuki9.tampilAnggota();
        nAnggota9.tampilAnggota();
        System.out.println("");
        
        Akatsuki nAkatsuki10 = new Akatsuki("Itachi Uchiha", 
                "Konohagakure", 
                "Konan", 
                "朱 (\"Merah Darah\")", 
                "Berambut belah tengah, ahli dalam Genjutsu, memakai sharingan dan mangekyo sharingan.");
        Anggota nAnggota10 = new Anggota("Pemimpin", nAkatsuki10.getNama(), nAkatsuki10.getAsal(), nAkatsuki10.getPasangan(), nAkatsuki10.getCincin(), nAkatsuki10.getCiri());
        nAkatsuki10.tampilAnggota();
        nAnggota10.tampilAnggota();
        System.out.println("");
    }

}
