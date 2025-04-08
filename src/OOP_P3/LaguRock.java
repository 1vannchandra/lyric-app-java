/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_P3;

/**
 *
 * @author ivanc
 */
public class LaguRock extends Lagu {
    String genre = "Rock";
    
    // Constructor
    public LaguRock(String judul, String[] artis, double durasi, String[] lirik) {
        super(judul, artis, durasi, lirik);
    }
    
    // Override method putar
    @Override
    public void putar() {
        System.out.println(">> Memutar lagu rock: " + judul);
        System.out.println(">> Artis: " + gabungArtis(artis));
        System.out.println(">> Genre: " + genre);
    }

    // Menampilkan pesan khusus untuk lagu pop
    public void pesanRock() {
        System.out.println(">> Lagu ini cocok untuk membangkitkan semangat!");
    }
}
