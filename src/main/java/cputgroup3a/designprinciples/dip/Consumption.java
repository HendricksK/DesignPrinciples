/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.dip;

/**
 *
 * @author kurvin
 */

public class Consumption {
    Music m = new Music();
    boolean checkSong = false;
   
    public void playSong(String songName){
        checkSong = m.searchSong(songName);
            
            if(checkSong == true){
                System.out.println(songName + "is now playing");
            }
    }
    
}
