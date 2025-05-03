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
public class Main {

    public static void main(String[] args) {
        // Data untuk Lagu Pop
        String[] artisPop = {"Taylor Swift"};
        String[] lirikPop = {
            "We were both young when I first saw you",
            "I close my eyes and the flashback starts"
        };
        LaguPop laguPop = new LaguPop("Love Story", artisPop, 3.55, lirikPop);

        // Data untuk Lagu Rock
        String[] artisRock = {"Linkin Park"};
        String[] lirikRock = {
            "I tried so hard and got so far",
            "But in the end, it doesn’t even matter"
        };
        LaguRock laguRock = new LaguRock("In the End", artisRock, 3.36, lirikRock);

        // Memutar Lagu Pop
        System.out.println(">> Memutar lagu: " + laguPop.getJudul());
        System.out.println(">> Artis: " + Lagu.gabungArtis(laguPop.getArtis()));
        System.out.println(">> Genre: " + laguPop.getGenre());
        laguPop.tampilkanLirik();
        laguPop.pesanPop();

        System.out.println("\n===========================\n");

        // Memutar Lagu Rock
        System.out.println(">> Memutar lagu: " + laguRock.getJudul());
        System.out.println(">> Artis: " + Lagu.gabungArtis(laguRock.getArtis()));
        System.out.println(">> Genre: " + laguRock.getGenre());
        laguRock.tampilkanLirik();
        laguRock.pesanRock();
    }
}
