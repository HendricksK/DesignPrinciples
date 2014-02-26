/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.isp;

import cputgroup3a.designprinciples.isp.service.MusicServiceIsp;


/**
 *
 * @author kurvin
 */
public interface MusicConsumptionIsp extends MusicServiceIsp{
    void play(String name);
}
