/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cputgroup3a.designprinciples.ocp.service.Impl;

import cputgroup3a.designprinciples.ocp.service.MusicOcpService;

/**
 *
 * @author kurvin
 */
public class MusicServiceOcpImpl implements MusicOcpService {

    private String song;
    
    public void setSong(String newSong){
        this.song = newSong;
    }
    
    public String getSongName(){
        return song;
    }
    
    @Override
    public void play() {
        System.out.println(getSongName() + "is now playing"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSong(String newSong) {
        setSong(newSong);
    }

}
