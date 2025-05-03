/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_PROJECT;

/**
 *
 * @author ivanc
 */
// Subclass LaguRock merupakan turunan dari kelas abstrak Lagu
public class LaguRock extends Lagu {

    // Properti genre yang menunjukkan jenis lagu ini adalah Rock
    private String genre = "Rock";

    // Konstruktor LaguRock yang memanggil konstruktor dari superclass (Lagu)
    public LaguRock(String judul, String[] artis, double durasi, String[] lirik) {
        super(judul, artis, durasi, lirik);
    }

    // Getter untuk mengambil nilai genre
    public String getGenre() {
        return genre;
    }

    // Override method abstrak putar() dari kelas Lagu
    @Override
    public String putar() {
        return ">> Memutar Lagu Rock Dari Artis: " + gabungArtis(getArtis());
    }

    // Method tambahan khusus untuk lagu rock
    public String pesanRock() {
        return ">> Lagu ini cocok untuk membangkitkan semangat!";
    }
}
