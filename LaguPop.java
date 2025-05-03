/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB5.IVAN;

/**
 *
 * @author ivanc
 */
public class LaguPop extends Lagu {

    private String genre = "Pop";

    // Constructor
    public LaguPop(String judul, String[] artis, double durasi, String[] lirik) {
        super(judul, artis, durasi, lirik);
    }

    // Getter untuk genre
    public String getGenre() {
        return genre;
    }

    // Override method putar
    @Override
    public String putar() {
        return ">>Memutar Lagu Dari Artis: " + gabungArtis(getArtis());
    }

    // Menampilkan pesan khusus untuk lagu pop
    public String pesanPop() {
        return ">> Lagu ini cocok untuk suasana santai dan bahagia!";
    }
}
