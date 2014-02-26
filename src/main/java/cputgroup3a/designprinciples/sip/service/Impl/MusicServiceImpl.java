/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.sip.service.Impl;

import cputgroup3a.designprinciples.dip.service.MusicService;
import cputgroup3a.designprinciples.sip.service.MusicConsumptionSip;
import cputgroup3a.designprinciples.sip.service.MusicDistributionSip;

/**
 *
 * @author kurvin
 */
import cputgroup3a.designprinciples.sip.service.MusicServiceSip;
import java.util.ArrayList;
import java.util.List;

public class MusicServiceImpl implements MusicServiceSip, MusicConsumptionSip, MusicDistributionSip{
    
    private String songName;
    private String artist;
    private Double songPrice;
    
    
    
    public MusicServiceImpl(){};
    
    public MusicServiceImpl(String name, String artist, Double price){
        MusicServiceImpl mservice = new MusicServiceImpl();
        mservice.songName = name;
        mservice.artist = artist;
        mservice.songPrice = price;
        songList.add(mservice);
    }
    
    @Override
    public boolean search(String name){
        for (int x = 0; x < songList.size(); x++) {
            if (songList.get(x).songName.equals(name)) {
                return true;
            }
        }
        return false;
        
    }
    
    @Override
    public void play(){
        
    }
    
    @Override 
    public void purchase(){
        
    }
    
    @Override
    public void displaySongList(){
         for (int x = 0; x < songList.size(); x++) {
            System.out.println(songList.get(x).artist);
            System.out.println(songList.get(x).songName);
            System.out.println(songList.get(x).songPrice);
        }
    }
}
