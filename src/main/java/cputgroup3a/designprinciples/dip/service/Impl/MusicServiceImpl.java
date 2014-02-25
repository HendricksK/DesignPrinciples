/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cputgroup3a.designprinciples.dip.service.Impl;

import cputgroup3a.designprinciples.dip.service.MusicService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurvin
 */
public class MusicServiceImpl implements MusicService {

    private String songName;
    private String artistName;
    private Double songPrice;
    
    //private static List<MusicServiceImpl> musicList = new ArrayList();
    
    public MusicServiceImpl(){};
    public MusicServiceImpl(String name, String artist, Double price){
        MusicServiceImpl ms = new MusicServiceImpl();
        ms.artistName = artist;
        ms.songName = name;
        ms.songPrice = price;
        musicList.add(ms);
    }
    
    @Override
    public void buySong() {
        
    }

    @Override
    public void playSong() {

    }
    
    @Override
    public String getSongName(){
        return songName;
    }
    
    @Override
    public void display(){
        for(int x = 0; x < musicList.size(); x++){
            System.out.println(musicList.get(x).getSongName());
        }
    }
    
    
    
    
}
