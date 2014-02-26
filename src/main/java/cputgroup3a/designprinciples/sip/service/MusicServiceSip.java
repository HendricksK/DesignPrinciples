/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.sip.service;

import cputgroup3a.designprinciples.sip.service.Impl.MusicServiceImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurvin
 */
public interface MusicServiceSip {
    List<MusicServiceImpl> songList = new ArrayList();
    public boolean search(String name);
    public void displaySongList();
}
