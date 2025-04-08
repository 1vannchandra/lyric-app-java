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
public class Lagu {

    String judul; // Variable judul dengan tipe String;
    String[] artis; // Variable artis dengan tipe String Array;
    double durasi; // Variable durasi dengan tipe double;
    String[] lirik; // Variable lirik dengan tipe String Array;
    
    // Constructor Lagu
    public Lagu(String judul, String[] artis, double durasi, String[] lirik) {
        this.judul = judul; // Input pada judul;
        this.artis = artis; // Input pada artis;
        this.durasi = durasi; // Input pada durasi;
        this.lirik = lirik;  // Input pada lirik;
    }

    // Fungsi untuk String Builder karena menggunakan Legacy Java
    public static String gabungArtis(String[] artis) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < artis.length; i++) {
            sb.append(artis[i]);
            if (i < artis.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    // Fungsi untuk memutar Musik
    public void putar() {
        System.out.println("🎵 Memutar lagu: " + judul);
        System.out.println("🎤 Artis: " + gabungArtis(artis));
    }

    // Fungsi untuk menampilkan Lirik
    public void tampilkanLirik() {
        System.out.println("🎶 Lirik lagu: " + judul);
        for (String baris : lirik) {
            System.out.println(baris);
        }
    }
}
