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
public class Lagu {
    String judul;
    String[] artis;
    double durasi;
    String[] lirik;

    // Constructor Lagu
    public Lagu(String judul, String[] artis, double durasi, String[] lirik) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
        this.lirik = lirik;
    }

    // Menggabungkan nama artis menjadi satu string
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

    // Memutar lagu
    public void putar() {
        System.out.println(">> Memutar lagu: " + judul);
        System.out.println(">> Artis: " + gabungArtis(artis));
    }

    // Menampilkan lirik lagu
    public void tampilkanLirik() {
        System.out.println(">> Lirik lagu: " + judul);
        for (String baris : lirik) {
            System.out.println(baris);
        }
    }
}

