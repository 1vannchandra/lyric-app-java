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
// Mendeklarasikan kelas Lagu sebagai abstract
public abstract class Lagu implements ILagu {

    // Properti privat untuk menyimpan judul, artis, durasi, dan lirik lagu
    private String judul;
    private String[] artis;
    private double durasi;
    private String[] lirik;

    // Konstruktor untuk menginisialisasi data lagu
    public Lagu(String judul, String[] artis, double durasi, String[] lirik) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
        this.lirik = lirik;
    }

    // Getter dan Setter untuk properti judul
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter dan Setter untuk properti artis
    public String[] getArtis() {
        return artis;
    }

    public void setArtis(String[] artis) {
        this.artis = artis;
    }

    // Getter dan Setter untuk properti durasi
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

    // Getter dan Setter untuk properti lirik
    public String[] getLirik() {
        return lirik;
    }

    public void setLirik(String[] lirik) {
        this.lirik = lirik;
    }

    // Method statis untuk menggabungkan array artis menjadi satu string
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

    // Method abstrak yang harus diimplementasikan oleh subclass
    public abstract String putar();

    // Method untuk menampilkan semua lirik lagu
    public String tampilkanLirik() {
        StringBuilder lirikLagu = new StringBuilder();
        for (String baris : lirik) {
            lirikLagu.append(baris).append("\n");
        }
        return lirikLagu.toString();
    }
}
