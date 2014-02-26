/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.designprinciples.lsp;

import java.util.ArrayList;
import java.util.List;
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
public class LspViolationTest {
    
    public LspViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    static List<MusicLsp> musicService = new ArrayList();
    
    @Test(expectedExceptions=UnsupportedOperationException.class)
    public static void testLspViolation(){
        for(MusicLsp m: musicService){
            m.increaseVoulme();
        }
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        musicService.add(new DistributionLsp());
        musicService.add(new MusicLsp());
        musicService.add(new ConsumptionLsp());
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
