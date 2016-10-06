/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author davidzhang
 */
public class LocationTest {

    public LocationTest() {
    }

    /**
     * Test of getIdx method, of class Location. There are only five choices,
     * four locations and leave the city. Thus the random number generator can
     * only get random number from 0 to 4, can not return 5 for example;
     */
    @Test
    public void testGetIdxBeyondtheScope() {
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(5);
        Assert.assertNotEquals(4, new Location(mockRandom).getIdx());

    }

    /**
     * Test of getIdx method, of class Location. There are only five choices,
     * four locations and leave the city. Thus the random number generator can
     * return any integer from 0 to 4;
     */
    @Test
    public void testGetIdx() {
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(4);
        Assert.assertEquals(4, new Location(mockRandom).getIdx());

    }

    /**
     * Test of getRandomLocation method, of class Location. The four locations
     * and leave the city should have equal weight. Thus the random location
     * should be any one of the five choices.
     */
    @Test
    public void testGetRandomLocationReturnsCorrect() {
        Location mockLocation = mock(Location.class);
        when(mockLocation.getIdx()).thenReturn(2);
        when(mockLocation.getRandomLocation()).thenCallRealMethod();
        Assert.assertEquals("The Point", mockLocation.getRandomLocation());

    }

}
