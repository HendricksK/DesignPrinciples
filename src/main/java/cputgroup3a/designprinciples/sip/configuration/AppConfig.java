/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.sip.configuration;

import cputgroup3a.designprinciples.sip.service.Impl.MusicServiceImpl;
import cputgroup3a.designprinciples.sip.service.MusicServiceSip;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurvin
 */
public class AppConfig {
    @Bean (name="MusicServiceSip")
        public MusicServiceSip getService(){
            return new MusicServiceImpl();
        }
}
