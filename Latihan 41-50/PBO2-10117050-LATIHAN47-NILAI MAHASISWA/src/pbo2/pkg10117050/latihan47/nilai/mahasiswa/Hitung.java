/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program menghitung dan menampilkan nilai mahasiswa
 */
package pbo2.pkg10117050.latihan47.nilai.mahasiswa;

public class Hitung {
    private double quiz;
    private double uts;
    private double uas;
    private String index;
    private String keterangan;

    public Hitung(double quiz, double uts, double uas){
        this.quiz =quiz;
        this.uts = uts;
        this.uas = uas;
    }
    
    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }
    
    public double hitungNilaiAkhir(){
        return (quiz*0.2)+(uts*0.3)+(uas*0.5);
    }
    
    public String indexNilai(double parNA){
        if(parNA >= 80 && parNA <= 100){
            index = "A";
        }else if(parNA >= 68 && parNA < 80){
            index = "B";
        }else if(parNA >= 56 && parNA < 68){
            index = "C";
        }else if(parNA >= 45 && parNA < 56){
            index = "D";
        }else if(parNA >= 0 && parNA < 45){
            index = "E";
        }
        return index;
    }
    
    public String keterangan(String parIndex){
        if (parIndex.equals("A")) {
            keterangan = "Sangat Baik";
        } else if (parIndex.equals("B")) {
            keterangan = "Baik";
        } else if (parIndex.equals("C")) {
            keterangan = "Cukup";
        } else if (parIndex.equals("D")) {
            keterangan = "Kurang";
        } else if (parIndex.equals("E")) {
            keterangan = "Sangat Kurang";
        }
        return keterangan;
    }
}
