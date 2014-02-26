/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.srp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import cputgroup3a.designprinciples.srp.configuration.SrpConfig;
import cputgroup3a.designprinciples.srp.service.Impl.MusicConsumeSrpImpl;
import cputgroup3a.designprinciples.srp.service.Impl.MusicDistributionSrpImpl;
import cputgroup3a.designprinciples.srp.service.MusicServiceSrp;
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
public class SrpCorrectionTest {
    
    public SrpCorrectionTest() {
    }
    
    static MusicDistributionSrpImpl md;
    static MusicConsumeSrpImpl mc;
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public static void testSrpCorrection(){
        mc.playSong("Ashtray Heart");
        md.purchase("Jesus H. Macy");
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SrpConfig.class);
        mc = (MusicConsumeSrpImpl) ctx.getBean("ConsumeSrp");
        md = (MusicDistributionSrpImpl) ctx.getBean("DistributeSrp");     
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
