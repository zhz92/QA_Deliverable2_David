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
     * only get random number from 0 to 4, can not return bigger than 4;
     */
    @Test
    public void testGetIdxBigger() {
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(5);
        Assert.assertNotEquals(4, new Location(mockRandom).getIdx());

    }

    /**
     * Test of getIdx method, of class Location. There are only five choices,
     * four locations and leave the city. Thus the random number generator can
     * only get random number from 0 to 4, can not return smaller than 0;
     */
    @Test
    public void testGetIdxSmaller() {
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(-1);
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
     * Test of getRandomLocation method, of class Location. The random location
     * should be generated base on the random index. String[] Locations = {"The
     * Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown",
     * "Leave"};
     */
    @Test
    public void testGetRandomLocationReturnsCorrect() {
        Location mockLocation = mock(Location.class);
        when(mockLocation.getIdx()).thenReturn(2);
        when(mockLocation.getRandomLocation()).thenCallRealMethod();
        Assert.assertEquals("The Point", mockLocation.getRandomLocation());

    }

}
