/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.dip;

/**
 *
 * @author kurvin
 */
public class Distribution extends Music{
    
    
    public Distribution(){};
    
    Music m = new Music();
    
    public void buySong(String songName, Double songPrice){
        m.purhcase(songName, songPrice); 
    }
}
