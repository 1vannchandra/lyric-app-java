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
public class LaguRock extends Lagu {
    private String genre = "Rock";

    // Constructor
    public LaguRock(String judul, String[] artis, double durasi, String[] lirik) {
        super(judul, artis, durasi, lirik);
    }

    // Getter untuk genre
    public String getGenre() {
        return genre;
    }

    // Override method putar
    @Override
    public void putar() {
        System.out.println(">> Memutar lagu rock: " + getJudul());
        System.out.println(">> Artis: " + gabungArtis(getArtis()));
        System.out.println(">> Genre: " + getGenre());
    }

    // Menampilkan pesan khusus untuk lagu rock
    public void pesanRock() {
        System.out.println(">> Lagu ini cocok untuk membangkitkan semangat!");
    }
}