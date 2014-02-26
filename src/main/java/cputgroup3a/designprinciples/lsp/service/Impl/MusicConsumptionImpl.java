/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.lsp.service.Impl;

import cputgroup3a.designprinciples.lsp.service.MusicConsumptionLsp;

/**
 *
 * @author kurvin
 */
public class MusicConsumptionImpl implements MusicConsumptionLsp{

    @Override
    public void play() {
        System.out.println("Song chosen is now playing");
    }

    @Override
    public void stop() {
        System.out.println("Song has been stopped");
    }
    
}
