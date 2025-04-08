/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_P4;

import OOP_P3.*;

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
    public void putar() {
        System.out.println(">> Memutar lagu pop: " + getJudul());
        System.out.println(">> Artis: " + gabungArtis(getArtis()));
        System.out.println(">> Genre: " + getGenre());
    }

    // Menampilkan pesan khusus untuk lagu pop
    public void pesanPop() {
        System.out.println(">> Lagu ini cocok untuk suasana santai dan bahagia!");
    }
}
