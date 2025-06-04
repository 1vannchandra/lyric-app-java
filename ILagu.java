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
public interface ILagu {
    // Getter dan Setter untuk judul
    String getJudul();
    void setJudul(String judul);

    // Getter dan Setter untuk artis
    String[] getArtis();
    void setArtis(String[] artis);

    // Getter dan Setter untuk durasi
    double getDurasi();
    void setDurasi(double durasi);

    // Getter dan Setter untuk lirik
    String[] getLirik();
    void setLirik(String[] lirik);

    // Method abstrak untuk memutar lagu
    String putar();

    // Method untuk menampilkan semua lirik
    String tampilkanLirik();
}
