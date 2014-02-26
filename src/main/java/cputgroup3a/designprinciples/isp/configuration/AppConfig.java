/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.isp.configuration;

import cputgroup3a.designprinciples.isp.service.Impl.MusicServiceImpl;
import cputgroup3a.designprinciples.isp.MusicConsumptionIsp;
import cputgroup3a.designprinciples.isp.MusicDistributionIsp;
import cputgroup3a.designprinciples.isp.service.MusicServiceIsp;
import org.springframework.context.annotation.Bean;



/**
 *
 * @author kurvin
 */
public class AppConfig {
    @Bean (name="MusicServiceIsp")
        public MusicServiceIsp getService(){
            return new MusicServiceImpl();
        }
        
    @Bean (name="MusicDistributeIsp")
        public MusicDistributionIsp getDistribution(){
            return new MusicServiceImpl();
        }
    @Bean (name="MusicConsumptionIsp")
        public MusicConsumptionIsp getConsumption(){
            return new MusicServiceImpl();
        } 
            
}
