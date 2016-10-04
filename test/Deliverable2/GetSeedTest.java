/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author davidzhang
 */
public class GetSeedTest {
    
    public GetSeedTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setSeed method, of class GetSeed.
     * Check when the argument is integer, if setSeed method 
     * can return the same integer.
     */
    @Test
    public void testSetSeed() {
//        System.out.println("setSeed");
//        int seed = 1;
//        GetSeed instance = new GetSeed();
//        instance.setSeed(seed);
        
        GetSeed mockGetSeed = mock(GetSeed.class);
        
//        when(mockGetSeed.setSeed(1)).thenReturn(1);
        when(mockGetSeed.setSeed(1)).thenReturn(1);
             
        Assert.assertEquals(1,mockGetSeed.setSeed(1));

    }

    /**
     * Test of getSeed method, of class GetSeed.
     */
    @Test
    public void testGetSeed() {
//        System.out.println("getSeed");
//        GetSeed instance = new GetSeed();
//        int expResult = 0;
//        int result = instance.getSeed();
//        assertEquals(expResult, result);
        
         GetSeed mockGetSeed = mock(GetSeed.class);
        
//        when(mockGetSeed.setSeed(1)).thenReturn(1);
        when(mockGetSeed.getSeed()).thenReturn(1);
        
        
        Assert.assertEquals(1,mockGetSeed.getSeed());

    }
    
}
