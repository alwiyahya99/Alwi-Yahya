/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan Daftar Film
 */
 
package pbo2.pkg10117050.latihan32.daftar.film;

public class DAFTARFILM {

    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println("");
        Film film = new Film();
        film.filmName = "Venom \n";
        film.filGenre = "Action, Horor, Scifi \n";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        
        film.nowPlaying(film.filmName,film.filGenre,film.filmRating,film.filmDuration);
        
        Film film2 = new Film();
        film2.filmName = "Small Foot \n";
        film2.filGenre = "Animation \n";
        film2.filmRating = 89.0;
        film2.filmDuration = 96;
        
        film2.nowPlaying(film2.filmName,film2.filGenre,film2.filmRating,film2.filmDuration);
        
        Film film3 = new Film();
        film3.filmName = "Crazy Rich Asian \n";
        film3.filGenre = "Comedy \n";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        
        film3.nowPlaying(film3.filmName,film3.filGenre,film3.filmRating,film3.filmDuration);
        
        Film film4 = new Film();
        film4.filmName = "Asih \n";
        film4.filGenre = "Horror \n";
        film4.filmRating = 6.0;
        film4.filmDuration = 100;
        
        film4.nowPlaying(film4.filmName,film4.filGenre,film4.filmRating,film4.filmDuration);
    }
    
}
