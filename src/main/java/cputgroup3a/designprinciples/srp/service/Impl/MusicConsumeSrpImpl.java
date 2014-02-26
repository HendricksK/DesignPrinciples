/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.srp.service.Impl;

import cputgroup3a.designprinciples.srp.service.MusicServiceSrp;

/**
 *
 * @author kurvin
 */
public class MusicConsumeSrpImpl implements MusicServiceSrp{
    
    public void playSong(String song){
        System.out.println(song + " is now playing.");
        songList.add(song);
    }
    
    @Override
    public void displaySongs() {
        for(int x = 0; x < songList.size(); x++){
            System.out.println(songList.get(x));
            x++;
        }
    }
    
}
