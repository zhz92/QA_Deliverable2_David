/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Matchers.any;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author davidzhang
 */
public class VisitorTest {

    /**
     * Test of getVisitorType method, of class Visitor. Each visitor should
     * traverse the city one by one. Thus, the first should be Student, second
     * is Business Person, third is Professor, fourth is Student, fifth is
     * Blogger.
     */
    @Test
    public void testGetVisitorType() {
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorType(1)).thenCallRealMethod();
        Assert.assertEquals("Student", mockVisitor.getVisitorType(1));
        when(mockVisitor.getVisitorType(2)).thenCallRealMethod();
        Assert.assertEquals("Business Person", mockVisitor.getVisitorType(2));
        when(mockVisitor.getVisitorType(3)).thenCallRealMethod();
        Assert.assertEquals("Professor", mockVisitor.getVisitorType(3));
        when(mockVisitor.getVisitorType(4)).thenCallRealMethod();
        Assert.assertEquals("Student", mockVisitor.getVisitorType(4));
        when(mockVisitor.getVisitorType(5)).thenCallRealMethod();
        Assert.assertEquals("Blogger", mockVisitor.getVisitorType(5));

    }

    /**
     * Test of getVisitorNum method, of class Visitor. To test when the argument
     * is 1, the visitor number should return 1 as well.
     */
    @Test
    public void testGetVisitorNumReturnCorrectly() {
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorNum(1)).thenCallRealMethod();
        Assert.assertEquals(1, mockVisitor.getVisitorNum(1));

    }

    /**
     * Test of getVisitorNum method, of class Visitor. The visitors are numbered
     * from 1 to 5, thus can not return a number bigger than 5. If it is bigger,
     * should return 0;
     */
    @Test
    public void testGetVisitorNumBigger() {
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorNum(6)).thenCallRealMethod();
        Assert.assertEquals(0, mockVisitor.getVisitorNum(6));

    }

    /**
     * Test of getVisitorNum method, of class Visitor. The visitors are numbered
     * from 1 to 5, thus can not return a number smaller than 1. If it is
     * smaller, should return 0.
     */
    @Test
    public void testGetVisitorNumSmaller() {
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorNum(0)).thenCallRealMethod();
        Assert.assertEquals(0, mockVisitor.getVisitorNum(0));

    }

    /**
     * Test of getCurrentVisitorInfo method, of class Visitor. To give correct
     * visitor type, visitor number, and location, it should print correct
     * current visitor info.
     */
    @Test
    public void testGetCorrectCurrentVisitorInfoAndStudentDisLikeCathedral() {
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorType(any(int.class))).thenReturn("Student");
        when(mockVisitor.getVisitorNum(any(int.class))).thenReturn(1);
        when(mockVisitor.getRandomLocation()).thenReturn("The Cathedral of Learning", "Leave");
        when(mockVisitor.getCurrentVisitorInfo()).thenCallRealMethod();

        String expResult = "Visitor 1 is a Student.\n"
                + "Visitor 1 is going to The Cathedral of Learning.\n"
                + "Visitor 1 did not like The Cathedral of Learning.\n"
                + "Visitor 1 has left the city.";
        String actualResult = mockVisitor.getCurrentVisitorInfo();

        Assert.assertEquals(expResult, actualResult);

    }

    /**
     * Test of getCurrentVisitorInfo method, of class Visitor. Each visitor can
     * not leave the city without going to any location, thus if the first
     * random location is "Leave", it should continue get random location until
     * it is not "Leave".
     */
    @Test
    public void testIfFirstLocationIsLeave() {
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorType(any(int.class))).thenReturn("Student");
        when(mockVisitor.getVisitorNum(any(int.class))).thenReturn(1);
        when(mockVisitor.getRandomLocation()).thenReturn("Leave", "The Point", "Leave");
        when(mockVisitor.getCurrentVisitorInfo()).thenCallRealMethod();

        String expResult = "Visitor 1 is a Student.\n"
                + "Visitor 1 is going to The Point.\n"
                + "Visitor 1 did like The Point.\n"
                + "Visitor 1 has left the city.";
        String actualResult = mockVisitor.getCurrentVisitorInfo();

        Assert.assertEquals(expResult, actualResult);

    }

    /**
     * Test of getCurrentVisitorInfo method, of class Visitor. Business Person
     * shall like Squirrel Hill and Downtown, and dislike all other locations.
     */
    @Test
    public void testBusinessPersonLikeAndDislike() {
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorType(any(int.class))).thenReturn("Business Person");
        when(mockVisitor.getVisitorNum(any(int.class))).thenReturn(2);
        when(mockVisitor.getRandomLocation()).thenReturn("The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown", "Leave");
        when(mockVisitor.getCurrentVisitorInfo()).thenCallRealMethod();

        String expResult = "Visitor 2 is a Business Person.\n"
                + "Visitor 2 is going to The Cathedral of Learning.\n"
                + "Visitor 2 did not like The Cathedral of Learning.\n"
                + "Visitor 2 is going to Squirrel Hill.\n"
                + "Visitor 2 did like Squirrel Hill.\n"
                + "Visitor 2 is going to The Point.\n"
                + "Visitor 2 did not like The Point.\n"
                + "Visitor 2 is going to Downtown.\n"
                + "Visitor 2 did like Downtown.\n"
                + "Visitor 2 has left the city.";
        String actualResult = mockVisitor.getCurrentVisitorInfo();

        Assert.assertEquals(expResult, actualResult);

    }

    /**
     * Test of getCurrentVisitorInfo method, of class Visitor. Professor shall
     * like all locations.
     */
    @Test
    public void testProfessorLikeAndDislike() {
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorType(any(int.class))).thenReturn("Professor");
        when(mockVisitor.getVisitorNum(any(int.class))).thenReturn(3);
        when(mockVisitor.getRandomLocation()).thenReturn("The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown", "Leave");
        when(mockVisitor.getCurrentVisitorInfo()).thenCallRealMethod();

        String expResult = "Visitor 3 is a Professor.\n"
                + "Visitor 3 is going to The Cathedral of Learning.\n"
                + "Visitor 3 did like The Cathedral of Learning.\n"
                + "Visitor 3 is going to Squirrel Hill.\n"
                + "Visitor 3 did like Squirrel Hill.\n"
                + "Visitor 3 is going to The Point.\n"
                + "Visitor 3 did like The Point.\n"
                + "Visitor 3 is going to Downtown.\n"
                + "Visitor 3 did like Downtown.\n"
                + "Visitor 3 has left the city.";
        String actualResult = mockVisitor.getCurrentVisitorInfo();

        Assert.assertEquals(expResult, actualResult);

    }

    /**
     * Test of getCurrentVisitorInfo method, of class Visitor. A blogger shall
     * dislike all locations.
     */
    @Test
    public void testBloggerLikeAndDislike() {
        Visitor mockVisitor = Mockito.mock(Visitor.class);
        when(mockVisitor.getVisitorType(any(int.class))).thenReturn("Blogger");
        when(mockVisitor.getVisitorNum(any(int.class))).thenReturn(5);
        when(mockVisitor.getRandomLocation()).thenReturn("The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown", "Leave");
        when(mockVisitor.getCurrentVisitorInfo()).thenCallRealMethod();

        String expResult = "Visitor 5 is a Blogger.\n"
                + "Visitor 5 is going to The Cathedral of Learning.\n"
                + "Visitor 5 did not like The Cathedral of Learning.\n"
                + "Visitor 5 is going to Squirrel Hill.\n"
                + "Visitor 5 did not like Squirrel Hill.\n"
                + "Visitor 5 is going to The Point.\n"
                + "Visitor 5 did not like The Point.\n"
                + "Visitor 5 is going to Downtown.\n"
                + "Visitor 5 did not like Downtown.\n"
                + "Visitor 5 has left the city.";
        String actualResult = mockVisitor.getCurrentVisitorInfo();

        Assert.assertEquals(expResult, actualResult);

    }

}
