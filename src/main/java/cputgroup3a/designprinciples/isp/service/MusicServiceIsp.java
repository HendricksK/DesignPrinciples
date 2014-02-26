/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.isp.service;

import cputgroup3a.designprinciples.dip.service.Impl.MusicServiceImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurvin
 */
public interface MusicServiceIsp {
    public List<MusicServiceIsp> songList = new ArrayList();
    public boolean search(String name);
    public void displaySongList();
    public String getSongName();
    public String getArtist();
    public Double getPrice();
}
