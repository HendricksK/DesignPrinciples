/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.lsp.service.Impl;

import cputgroup3a.designprinciples.lsp.service.MusicDistributionLsp;

/**
 *
 * @author kurvin
 */
public class MusicDistributionImpl implements MusicDistributionLsp{

    @Override
    public void purchase() {
        System.out.println("Song has been purchased");
    }
    
}
