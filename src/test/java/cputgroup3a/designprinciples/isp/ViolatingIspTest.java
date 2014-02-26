/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.isp;

import cputgroup3a.designprinciples.sip.MusicIsp;
import junit.framework.Assert;
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
public class ViolatingIspTest {
    
    public ViolatingIspTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    static MusicIsp m;
    
    @Test
    public static void testDisplay(){
        m.displaySongList();
    }
    
    @Test
    public static void testPurchase(){
        m.purchase("Neon Cathedral", 7.02);
        Assert.assertEquals(7.02, 7.05, 0.06);
    }
    
    @Test
    public static void testPlay(){
        m.play("Is There Any Love?");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        m = new MusicIsp("Kid Cudi", "Is There Any Love?", 5.06);
        m = new MusicIsp("Macklmore", "Neon Cathedral", 7.02);
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
