/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author davidzhang
 */
public class VisitorTest {

    /**
     * Test of getVisitorType method, of class Visitor.
     * To test when the argument starts with 1, the visitor should be a student.
     */
    @Test
    public void testGetVisitorType() {
        System.out.println("getVisitorType");
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorType(1)).thenCallRealMethod();
        Assert.assertEquals("Student", mockVisitor.getVisitorType(1));

    }

    /**
     * Test of getVisitorNum method, of class Visitor.
     * To test when the argument is 1, the visitor number should be 1 as well.
     */
    @Test
    public void testGetVisitorNum() {
        System.out.println("getVisitorNum");
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorNum(1)).thenCallRealMethod();
        Assert.assertEquals(1, mockVisitor.getVisitorNum(1));

    }

    /**
     * Test of getCurrentVisitorInfo method, of class Visitor.
     */
    @Test
    public void testGetCurrentVisitorInfo() {

        Visitor mockVisitor = Mockito.mock(Visitor.class);

        when(mockVisitor.getVisitorType(1)).thenReturn("Student");
        when(mockVisitor.getVisitorNum(1)).thenReturn(1);

        when(mockVisitor.getRandomLocation()).thenReturn("The Cathedral of Learning", "Leave");

        when(mockVisitor.getCurrentVisitorInfo()).thenCallRealMethod();

        String expResult = "Visitor 1 is a Student.\n"
                + "Visitor 1 is going to The Cathedral of Learning.\n"
                + "Visitor 1 did not like The Cathedral of Learning.\n"
                + "Visitor 1 has left the city.";

        Assert.assertEquals(expResult, mockVisitor.getCurrentVisitorInfo());

    }

}
