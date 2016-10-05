/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davidzhang
 */
public class LocationTest {

    /**
     * Test of getRandomLocation method, of class Location. To check if the
     * random location is contained in the expected result;
     */
    @Test
    public void testIfResultComesFromGivenLocations() {

        Location instance = new Location();
        String expResult = "The Cathedral of Learning, Squirrel Hill, The Point, Downtown, Leave";
        String result = instance.getRandomLocation();
        assertTrue(expResult.contains(result));
    }

}
