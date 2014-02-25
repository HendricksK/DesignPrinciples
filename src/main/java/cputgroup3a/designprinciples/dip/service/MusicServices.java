/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.dip.service;

/**
 *
 * @author kurvin
 */
public interface MusicServices {
    
    public void play(String songName);
    public void stop(String songName);
    public void search(String songName);
    public void purchaseAlbum(String albumName, double amountPayed);
    public void purchaseSong(String songName, double amountPayed);
    
}
