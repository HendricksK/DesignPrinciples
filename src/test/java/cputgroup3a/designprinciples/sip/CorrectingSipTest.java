/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.sip;

import cputgroup3a.designprinciples.sip.configuration.AppConfig;
import cputgroup3a.designprinciples.sip.service.Impl.MusicServiceImpl;
import cputgroup3a.designprinciples.sip.service.MusicServiceSip;
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
public class CorrectingSipTest {
    
    public CorrectingSipTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    static MusicServiceSip mss;
    
    @Test
    public static void testDisplay(){
        mss.displaySongList();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mss = (MusicServiceSip) ctx.getBean("MusicServiceSip");
        mss = new MusicServiceImpl("Dark Side Of Me" ,"Coheed And Cambria" ,15.36);
        mss = new MusicServiceImpl("Dance Gavin Dance", "Acceptance Speech" ,18.36);
        
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
