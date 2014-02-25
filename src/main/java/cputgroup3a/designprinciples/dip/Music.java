/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.dip;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurvin
 */
public class Music {
    public String artistName;
    public String songName;
    public double price;
    
    private static List<Music> songList = new ArrayList();
    
    public Music(){}; // default constructor
    
    public Music(String artistName, String songName, double price){
        Music m = new Music();
        
        m.artistName = artistName;
        m.songName = songName;
        m.price = price;
        songList.add(m);
    }
    
    
    public void setArtist(String artistName){
        artistName = this.artistName;
    }
    
    public void setSong(String songName){
        songName = this.songName;
    }
    
    public void setPrice(double price){
        price = this.price;
    }
    
    public void displaySongList(){
        for(int x = 0; x < songList.size(); x++){
            System.out.println(songList.size());
            System.out.println(songList.get(x).artistName);
            System.out.println(songList.get(x).songName);
            System.out.println(songList.get(x).price);
        }
    }
    
    public String getSongName(){
        return songName;
    }
    
    public String getArtistName(){
        return artistName;
    }
    
    public double getPrice(){
        return price;
    }
    
    public boolean searchSong(String song){
        for(int x = 0; x < songList.size(); x++){
            if(songList.get(x).getSongName().equals(song))
                return true;
        }
    return false;
    }
}
