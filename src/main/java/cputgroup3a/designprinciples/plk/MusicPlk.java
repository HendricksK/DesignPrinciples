/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.plk;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurvin
 */
public class MusicPlk {
    public String song;
    public static List<MusicPlk> list = new ArrayList();
    
    public void addSong(String s){
        MusicPlk m = new MusicPlk();
        m.song = s;
        list.add(m);
    }
    
    public String searchSong(String search){
        for(int x = 0; x < list.size(); x++){
            if(list.get(x).song.equals(search))
                return list.get(x).song + " is now playing";
        }
        return "Song was not found";
    }
    
    public String searchPurchase(String search){
        for(int x = 0; x < list.size(); x++){
            if(list.get(x).song.equals(search))
                return list.get(x).song + " is available for purchase";
        }
        return "Song was not found";
    }
}
