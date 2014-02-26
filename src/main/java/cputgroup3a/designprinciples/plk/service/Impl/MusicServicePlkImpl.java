/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.plk.service.Impl;

import cputgroup3a.designprinciples.plk.service.MusicServicePlk;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurvin
 */
public class MusicServicePlkImpl implements MusicServicePlk{

    private static List<String> songs = new ArrayList();
    
    @Override
    public void addSong(String song) {
        songs.add(song);
    }

    @Override
    public boolean search(String song) {
        for(int x = 0; x < songs.size(); x++){
            if(songs.get(x).equals(song)){
                System.out.println("Song has been found");
                return true;
            }
        }
        return false;
    }
    
    public void play(String song){
        if(search(song) == true)
            System.out.println(song + " is now playing");
        else
            System.out.println("song could not be played");
    }
    
    public void purchase(String song){
            if(search(song)== true)
                System.out.println("Song is available for purchase");
            else
                System.out.println("Song is not available to purchase");
    }
}
