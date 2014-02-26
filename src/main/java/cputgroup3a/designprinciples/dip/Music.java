/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cputgroup3a.designprinciples.dip;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 *
 * @author kurvin
 */
public class Music {

    public String artistName;
    public String songName;
    public double price;

    private static List<Music> songList = new ArrayList();

    public Music() {
    }; // default constructor
    
    public Music(String artistName, String songName, double price) {
        Music m = new Music();

        m.artistName = artistName;
        m.songName = songName;
        m.price = price;
        songList.add(m);
    }

    public void setArtist(String artistName) {
        artistName = this.artistName;
    }

    public void setSong(String songName) {
        songName = this.songName;
    }

    public void setPrice(double price) {
        price = this.price;
    }

    public void displaySongList() {
        for (int x = 0; x < songList.size(); x++) {
            System.out.println(songList.size());
            System.out.println(songList.get(x).artistName);
            System.out.println(songList.get(x).songName);
            System.out.println(songList.get(x).price);
        }
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public Double getPrice() {
        return price;
    }

    public boolean searchSong(String song) {
        for (int x = 0; x < songList.size(); x++) {
            if (songList.get(x).getSongName().equals(song)) {
                return true;
            }
        }
        return false;
    }

    public void purhcase(String song, Double price) {
        for (int x = 0; x < songList.size(); x++) {
            if (songList.get(x).getSongName().equals(song)) {
                if (price.equals(songList.get(x).getPrice())) {
                    System.out.println("Your purchase has been succesful, you will now recieve your download of : " + songList.get(x).getSongName());
                    System.out.println("From : " + songList.get(x).getArtistName());
                    break;
                } else {
                    System.out.println("Purchase was unsuccesful");
                }
            }else if(searchSong(song) == false){
                System.out.println("The song " + song +" you are trying to purchase is not available for purchase. ");
                break;
            }
        }
    }
}
