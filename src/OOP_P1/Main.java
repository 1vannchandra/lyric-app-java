/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_P1;

/**
 *
 * @author ivanc
 */
public class Main {
    public static void main(String[] args) {
        // Data lagu
        String judul = "WKWK Land";
        String[] artis = {"Weird Genius"};
        double durasi = 3.58; // durasi lagu dalam satuan menit
        String[] lirik = {
            "Wkwk land, beautiful country\n" +
            "Wkwk land, no need to worry\n" +
            "Wkwk land, I'm your guide tonight\n" +
            "Don't expect, I'm gonna make you ride",
            "We call it Indonesia, but they call us wkwk land\n" +
            "We always laugh with wkwk, that's why we are wkwk land\n" +
            "You know om telolet, tow missle horn from wkwk land\n" +
            "Of course because we spam your DJs, we are wkwk land",
            "We have komodo, we ride and fly on it\n" +
            "We boiled the puppet and we cry over it\n" +
            "Our TV show? Please you don't ask for it\n" +
            "You made a robot? Hey, what's your religion? Stop it!"
        };

        // Membuat objek Lagu
        Lagu laguBaru = new Lagu(judul, artis, durasi, lirik);
        
        // Memutar lagu
        laguBaru.putar();
        
        // Menampilkan lirik lagu
        laguBaru.tampilkanLirik();
    }
}
