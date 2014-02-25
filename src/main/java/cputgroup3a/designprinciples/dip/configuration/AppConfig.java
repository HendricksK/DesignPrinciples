/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.dip.configuration;

import cputgroup3a.designprinciples.dip.service.Impl.MusicServiceImpl;
import cputgroup3a.designprinciples.dip.service.MusicService;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurvin
 */
public class AppConfig {
    @Bean (name="MusicService")
        public MusicService getService(){
            return new MusicServiceImpl();
        }
        
    /*@Bean (name="SuperMusic")
        public MusicService getService(String nme, String art, Double price){
            return new MusicServiceImpl(nme, art, price);
        }*/
}
