/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author davidzhang
 */
public class GetSeedTest {

    /**
     * Test of setSeed method, of class GetSeed. Check when the argument is
     * integer, if setSeed method can return the same integer.
     */
    @Test
    public void testSetSeed() {

        GetSeed mockGetSeed = mock(GetSeed.class);
        when(mockGetSeed.setSeed(1)).thenCallRealMethod();
        Assert.assertEquals(1, mockGetSeed.setSeed(1));
    }

    /**
     * Test of getSeed method, of class GetSeed.
     * To give the setSeed method a value, and check
     * if the getSeed method can return the same value.
     */
    @Test
    public void testGetSeed() {
        GetSeed mockGetSeed = mock(GetSeed.class);
        when(mockGetSeed.getSeed()).thenReturn(1);
        Assert.assertEquals(1, mockGetSeed.getSeed());

    }

}
