/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.ocp;

/**
 *
 * @author kurvin
 */
public class MusicPlayOcp extends MusicOcp{
    
    MusicOcp m = new MusicOcp();
    
    void play(){
        System.out.println("Playing song" + m.Song);
    }
    
    void addSong(String songName){
        m.Song = songName;
    }
}
