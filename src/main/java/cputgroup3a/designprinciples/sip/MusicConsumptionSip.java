/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.sip;

import cputgroup3a.designprinciples.sip.service.MusicServiceSip;

/**
 *
 * @author kurvin
 */
public interface MusicConsumptionSip extends MusicServiceSip{
    void play(String name);
}