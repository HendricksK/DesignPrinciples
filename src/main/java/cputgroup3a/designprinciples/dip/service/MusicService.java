/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.dip.service;

import cputgroup3a.designprinciples.dip.service.Impl.MusicServiceImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurvin
 */
public interface MusicService {
    
    static List<MusicService> musicList = new ArrayList();
    public void buySong();
    public void playSong();
    public void display();
    public String getSongName();

}
