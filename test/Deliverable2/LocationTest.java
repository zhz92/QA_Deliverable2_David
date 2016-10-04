/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davidzhang
 */
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getRandomLocation method, of class Location.
     */
    @Test
    public void testIfRandomLocationComesFromGivenLocations() {
        System.out.println("getRandomLocation");
        Location instance = new Location();
        String expResult = "The Cathedral of Learning, Squirrel Hill, The Point, Downtown, Leave";
        String result = instance.getRandomLocation();
        assertTrue(expResult.contains(result));
    }
    
}
