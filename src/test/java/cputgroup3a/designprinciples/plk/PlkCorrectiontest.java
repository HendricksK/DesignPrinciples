/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.plk;

import cputgroup3a.designprinciples.plk.configuration.PlkConfig;
import cputgroup3a.designprinciples.plk.service.Impl.MusicServicePlkImpl;
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
public class PlkCorrectiontest {
    
    public PlkCorrectiontest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    static MusicServicePlkImpl msp;
    
    @Test
    public static void testPlkCorrection(){
        msp.addSong("Special K");
        msp.addSong("20 Years");
        msp.play("Drag");
        msp.play("20 Years");
        msp.purchase("Special K");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PlkConfig.class);
        msp = (MusicServicePlkImpl) ctx.getBean("Plk");
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
