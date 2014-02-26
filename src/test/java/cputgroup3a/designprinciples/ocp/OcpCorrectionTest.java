/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.ocp;

import cputgroup3a.designprinciples.ocp.configuration.OcpConfig;
import cputgroup3a.designprinciples.ocp.service.Impl.MusicServiceOcpImpl;
import cputgroup3a.designprinciples.ocp.service.MusicOcpService;
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
public class OcpCorrectionTest {
    
    public OcpCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    static MusicOcpService mos;
    static MusicServiceOcpImpl mosImpl;
    
    @Test
    public static void testOcpCorrection(){
        mos.addSong("Elder Goose");
        mos.play();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(OcpConfig.class);
        mos = (MusicOcpService) ctx.getBean("MusicOcp");
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
