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
public class Lagu {
    private String judul;
    private String[] artis;
    private double durasi;
    private String[] lirik;

    // Constructor Lagu
    public Lagu(String judul, String[] artis, double durasi, String[] lirik) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
        this.lirik = lirik;
    }

    // Getter dan Setter untuk judul
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter dan Setter untuk artis
    public String[] getArtis() {
        return artis;
    }

    public void setArtis(String[] artis) {
        this.artis = artis;
    }

    // Getter dan Setter untuk durasi
    public double getDurasi() {
        return durasi;
    }

    public void setDurasi(double durasi) {
        if (durasi > 0) {
            this.durasi = durasi;
        } else {
            System.out.println("Durasi tidak valid!");
        }
    }

    // Getter dan Setter untuk lirik
    public String[] getLirik() {
        return lirik;
    }

    public void setLirik(String[] lirik) {
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


