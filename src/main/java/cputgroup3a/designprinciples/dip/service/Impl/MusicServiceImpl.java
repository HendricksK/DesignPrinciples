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
    public void buySong(String song, Double price) {
        for (int x = 0; x < musicList.size(); x++) {
            if (musicList.get(x).getSongName().equals(song)) {
                if (price.equals(musicList.get(x).getPrice())) {
                    System.out.println("Your purchase has been succesful, you will now recieve your download of : " + musicList.get(x).getSongName());
                    System.out.println("From : " + musicList.get(x).getArtist());
                    break;
                } else if(price != musicList.get(x).getPrice()){
                    System.out.println("Purchase was unsuccesful");
                    break;
                }
            }else if(search(song) == false){
                System.out.println("The song " + song +" you are trying to purchase is not available for purchase. ");
                break;
            }
        }
    }

    @Override
    public void playSong(String song) {
     for (int x = 0; x < musicList.size(); x++) {
            if (musicList.get(x).getSongName().equals(song)) {
                System.out.println(song + " is now playing.");
                break;
            }
            else System.out.println("The song chosen cannot be found");
            break;
        }
    }
    
    @Override
    public String getSongName(){
        return songName;
    }
    
    @Override
    public String getArtist(){
        return artistName;
    }
    
    @Override
    public Double getPrice(){
        return songPrice;
    }
    
    @Override
    public void display(){
        for(int x = 0; x < musicList.size(); x++){
            System.out.println(musicList.get(x).getSongName());
            System.out.println(musicList.get(x).getArtist());
            System.out.println(musicList.get(x).getPrice());
        }
    }
    
    @Override
    public boolean search(String song){
        for (int x = 0; x < musicList.size(); x++) {
            if (musicList.get(x).getSongName().equals(song)) {
                return true;
            }
        }
        return false;
    }
    
    
}
