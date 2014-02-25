/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.dip;

import cputgroup3a.designprinciples.dip.service.Impl.MusicServiceImpl;
import cputgroup3a.designprinciples.dip.service.MusicService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cputgroup3a.designprinciples.dip.configuration.AppConfig;

/**
 *
 * @author kurvin
 */
public class dipTestCorrection {
    
    public dipTestCorrection() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public static MusicService musicService;
    
    
    @Test
    public void testDisplay(){
        musicService = new MusicServiceImpl("Breaking Out, Breaking down","Bullet For My Valentine" ,12.56);
        musicService = new MusicServiceImpl("Stir It Up","Bob Marley" ,12.56);
        musicService.display();
    }
    
    @Test
    public static void testPurchase(){
        musicService.buySong();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        musicService = (MusicService) ctx.getBean("MusicService");
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
