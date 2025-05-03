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
// Subclass LaguPop merupakan turunan dari kelas abstrak Lagu
public class LaguPop extends Lagu {

    // Properti genre khusus untuk lagu pop
    private String genre = "Pop";

    // Konstruktor LaguPop yang memanggil konstruktor dari superclass (Lagu)
    public LaguPop(String judul, String[] artis, double durasi, String[] lirik) {
        super(judul, artis, durasi, lirik);
    }

    // Getter untuk mengambil nilai genre
    public String getGenre() {
        return genre;
    }

    // Override method abstrak putar() dari kelas Lagu
    @Override
    public String putar() {
        return ">> Memutar Lagu Dari Artis: " + gabungArtis(getArtis());
    }

    // Method tambahan khusus untuk lagu pop
    public String pesanPop() {
        return ">> Lagu ini cocok untuk suasana santai dan bahagia!";
    }
}
