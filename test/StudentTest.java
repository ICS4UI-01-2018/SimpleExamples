/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TDDExample.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lamon
 */
public class StudentTest {
    
    Student underTest = new Student(12345,"Test Subject", 11);
    
    public StudentTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void getNameTest1(){
        String name = underTest.getName();
        String expecting = "Test Subject";
        assertEquals(expecting, name);
 
    }
    
    @Test
    public void getNameTest2(){
        Student s2 = new Student(2345,"Bob", 12);
        assertEquals("Bob2", s2.getName());
    }
    
}
