/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.isp.service.Impl;

import cputgroup3a.designprinciples.isp.MusicConsumptionIsp;
import cputgroup3a.designprinciples.isp.MusicDistributionIsp;
import cputgroup3a.designprinciples.isp.service.MusicServiceIsp;
import java.util.ArrayList;
import java.util.List;

public class MusicServiceImpl implements MusicServiceIsp, MusicConsumptionIsp, MusicDistributionIsp{
    
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
    public String getSongName(){
        return songName;
    }
    
    @Override
    public String getArtist(){
        return artist;
    }
    
    @Override
    public Double getPrice(){
        return songPrice;
    }
    
    @Override
    public boolean search(String name){
        for (int x = 0; x < songList.size(); x++) {
            if (songList.get(x).getSongName().equals(name)) {
                return true;
            }
        }
        return false;
        
    }
    
    @Override
    public void play(String name){
        for (int x = 0; x < songList.size(); x++) {
            if (songList.get(x).getSongName().equals(name)) {
                System.out.println(name + " is now playing.");
                break;
            }
            else System.out.println("The song chosen cannot be found");
            break;
        }
        
    }
    
    @Override 
    public void purchase(String name, Double amountDue){
        for (int x = 0; x < songList.size(); x++) {
            if (songList.get(x).getSongName().equals(name)) {
                if (amountDue.equals(songList.get(x).getPrice())) {
                    System.out.println("Your purchase has been succesful, you will now recieve your download of : " + songList.get(x).getSongName());
                    System.out.println("From : " + songList.get(x).getArtist());
                    break;
                } else System.out.println("Purchase was unsuccesful");
            }else if(search(name) == false){
                System.out.println("The song " + name +" you are trying to purchase is not available for purchase. ");
                break;
            }
        }
    }
    
    @Override
    public void displaySongList(){
         for (int x = 0; x < songList.size(); x++) {
            System.out.println(songList.get(x).getArtist());
            System.out.println(songList.get(x).getSongName());
            System.out.println(songList.get(x).getPrice());
        }
    }
}
