/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.plk.configuration;

import cputgroup3a.designprinciples.plk.service.Impl.MusicServicePlkImpl;
import cputgroup3a.designprinciples.plk.service.MusicServicePlk;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurvin
 */
public class PlkConfig {
    @Bean (name="Plk")
    public MusicServicePlk getService(){
        return new MusicServicePlkImpl();
    }
}
