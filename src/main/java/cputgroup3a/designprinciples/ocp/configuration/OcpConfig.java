/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.ocp.configuration;

import cputgroup3a.designprinciples.ocp.service.Impl.MusicServiceOcpImpl;
import cputgroup3a.designprinciples.ocp.service.MusicOcpService;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurvin
 */
public class OcpConfig {
    @Bean(name="MusicOcp")
    public MusicOcpService getService(){
        return new MusicServiceOcpImpl();
    }
}
