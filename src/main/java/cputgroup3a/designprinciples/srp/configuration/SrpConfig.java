/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.srp.configuration;

import cputgroup3a.designprinciples.srp.service.Impl.MusicConsumeSrpImpl;
import cputgroup3a.designprinciples.srp.service.Impl.MusicDistributionSrpImpl;
import cputgroup3a.designprinciples.srp.service.MusicServiceSrp;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurvin
 */
public class SrpConfig {
    @Bean(name="ConsumeSrp")
    public MusicServiceSrp getConsume(){
        return new MusicConsumeSrpImpl();
    }
    
    @Bean(name="DistributeSrp")
    public MusicServiceSrp getDistribute(){
        return new MusicDistributionSrpImpl();
    }
}
