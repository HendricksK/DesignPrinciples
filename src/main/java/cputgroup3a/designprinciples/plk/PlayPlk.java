/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.plk;

/**
 *
 * @author kurvin
 */
public class PlayPlk {
    MusicPlk m = new MusicPlk();
    
    public void play(String song){
        m.addSong(song);
        System.out.println(m.searchSong(song));
    }
}
