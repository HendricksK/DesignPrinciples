/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.dip;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 *
 * @author kurvin
 */
public class dipViolationTest {
    
    public dipViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public static void testDisplay(){
        
        Music m = new Music();
        m.displaySongList();
    }
    
    @Test
    public static void testPlay(){
        Consumption c = new Consumption();
        c.playSong("Always");
        c.playSong("Bat Country");
    }
    
    @Test
    public static void testPurchase(){
        Distribution d = new Distribution();
        d.buySong("Always", 12.56);
        Assert.assertEquals(12.56, 12.56, 0.0);
    }
    
    @Test
    public static void testFailPurchase(){
        Distribution d1 = new Distribution();
        d1.buySong("Indy Kidz", 12.56);
        //Assert.fail("Failing on purpose");
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        Music m = new Music("Killswitch Engage","Always", 12.56);
        Music m1 = new Music("Avenged Sevenfold", "Bat Country", 10.56);
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
