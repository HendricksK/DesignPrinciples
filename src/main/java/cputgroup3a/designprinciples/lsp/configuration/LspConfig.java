/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.lsp.configuration;

import cputgroup3a.designprinciples.lsp.service.Impl.MusicConsumptionImpl;
import cputgroup3a.designprinciples.lsp.service.Impl.MusicDistributionImpl;
import cputgroup3a.designprinciples.lsp.service.MusicConsumptionLsp;
import cputgroup3a.designprinciples.lsp.service.MusicDistributionLsp;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurvin
 */
public class LspConfig {
    @Bean (name="LspConsume")
    public MusicConsumptionLsp getMSConsume(){
        return new MusicConsumptionImpl();
    }
    
    @Bean (name="LspDistribute")
    public MusicDistributionLsp getMSDistribute(){
        return new MusicDistributionImpl();
    }
}
