/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.lsp;

import cputgroup3a.designprinciples.lsp.configuration.LspConfig;
import cputgroup3a.designprinciples.lsp.service.MusicConsumptionLsp;
import cputgroup3a.designprinciples.lsp.service.MusicDistributionLsp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class LspCorrectionTest {
    
    public LspCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    static MusicConsumptionLsp mc;
    static MusicDistributionLsp md;
    
    @Test
    public static void testMusicConsume(){
        mc.play();
    }
    
    @Test
    public static void testMusicDistribute(){
        md.purchase();
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LspConfig.class);
        mc = (MusicConsumptionLsp) ctx.getBean("LspConsume");
        md = (MusicDistributionLsp) ctx.getBean("LspDistribute");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
