/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class GradesTest {
    
    public GradesTest() {
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
     * Test of print method, of class Grades.
     */
     @Test
    public void testPrint() {
        System.out.println("testing Grades.print() method");
        int grade = 0;
        Grades grades = new Grades();
        
        System.out.println("Testing the A range");
        assertEquals("A test failed.", "You got an A!", grades.print(100));
        assertEquals("A test failed.", "You got an A!", grades.print(99));
        assertEquals("A test failed.", "You got an A!", grades.print(94));

        System.out.println("Testing the B range");
        assertEquals("B test failed.", "You received a B", grades.print(93));
        assertEquals("B test failed.", "You received a B", grades.print(87));
        assertEquals("B test failed.", "You received a B", grades.print(84));

        System.out.println("Testing the C range");
        assertEquals("C test failed.", "You received a C", grades.print(83));
        assertEquals("C test failed.", "You received a C", grades.print(82));
        assertEquals("C test failed.", "You received a C", grades.print(74));

        System.out.println("Testing the D range");
        assertEquals("D test failed.", "You need to study more", grades.print(73));
        assertEquals("D test failed.", "You need to study more", grades.print(72));
        assertEquals("D test failed.", "You need to study more", grades.print(50));
        assertEquals("D test failed.", "You need to study more", grades.print(40));
        assertEquals("D test failed.", "You need to study more", grades.print(0));
        
     }
    
}
