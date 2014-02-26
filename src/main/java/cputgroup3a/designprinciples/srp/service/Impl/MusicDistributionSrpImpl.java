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
public class MusicDistributionSrpImpl implements MusicServiceSrp
{
    
    public void purchase(String song){
        for(int x = 0; x < songList.size(); x++){
            if(songList.get(x).equals(song)){
                System.out.println("Song has been purchase succesfully");
                break;
            }else System.out.println("Song " + song + " could not be found, purchase failed");
        }
    }

    @Override
    public void displaySongs() {
        
    }
    
}
