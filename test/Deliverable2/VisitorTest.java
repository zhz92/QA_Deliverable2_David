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
public class VisitorTest {
    
    public VisitorTest() {
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
     * Test of getVisitorType method, of class Visitor.
     */
    @Test
    public void testGetVisitorType() {
        System.out.println("getVisitorType");
        Visitor instance = null;
        String expResult = "Student";
        
        String result = instance.getVisitorType();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getVisitorNum method, of class Visitor.
     */
    @Test
    public void testGetVisitorNum() {
        System.out.println("getVisitorNum");
        Visitor instance = null;
        int expResult = 0;
        int result = instance.getVisitorNum();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getCurrentVisitorInfo method, of class Visitor.
     */
    @Test
    public void testGetCurrentVisitorInfo() {
        System.out.println("getCurrentVisitorInfo");
        Visitor instance = null;
        String expResult = "";
        String result = instance.getCurrentVisitorInfo();
        assertEquals(expResult, result);
        
    }
    
}
