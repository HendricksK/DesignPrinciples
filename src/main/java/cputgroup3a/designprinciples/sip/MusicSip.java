/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.sip;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurvin
 */
public class MusicSip {
    
    public String artistName;
    public String songName;
    public Double price;
    MusicSip m;
    
    public MusicSip(){};
    private static List<MusicSip> songList = new ArrayList();
    
    public MusicSip(String artName, String songNme, Double songPrice){
       m = new MusicSip();
       m.artistName = artName;
       m.songName = songNme;
       m.price = songPrice;
       songList.add(m);
    }
    
    public void play(String name){
        if(search(name) == true)
            System.out.println(name + " is now playing.");
        else if(search(name) == false)
            System.out.println("Cannot find the requested song: " + name);
            
        
    }
    
    public boolean search(String name){
        for (int x = 0; x < songList.size(); x++) {
            if (songList.get(x).songName.equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void purchase(String name, Double amountDue){
        for (int x = 0; x < songList.size(); x++) {
            if (songList.get(x).songName.equals(name)) {
                if (amountDue.equals(songList.get(x).price)) {
                    System.out.println("Your purchase has been succesful, you will now recieve your download of : " + songList.get(x).songName);
                    System.out.println("From : " + songList.get(x).artistName);
                    break;
                } else System.out.println("Purchase was unsuccesful");
            }else if(search(name) == false){
                System.out.println("The song " + name +" you are trying to purchase is not available for purchase. ");
                break;
            }
        }
    }
    
     public void displaySongList() {
        for (int x = 0; x < songList.size(); x++) {
            System.out.println(songList.get(x).artistName);
            System.out.println(songList.get(x).songName);
            System.out.println(songList.get(x).price);
        }
    }
    
}
