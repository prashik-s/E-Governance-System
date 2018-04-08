/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class SchemesTest {
    
    public SchemesTest() {
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
     * Test of getid method, of class Schemes.
     */
    @Test
    public void testGetid() {
        System.out.println("getid");
        Schemes instance;
        instance = new Schemes("3","kdlj","34%","dlkfjldk");
        String expResult = "3";
        String result = instance.getid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getname method, of class Schemes.
     */
    @Test
    public void testGetname() {
        System.out.println("getname");
        Schemes instance = new Schemes("3","Anmol","34%","dlkfjldk");
        String expResult = "Anmol";
        String result = instance.getname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getpercentage method, of class Schemes.
     */
    @Test
    public void testGetpercentage() {
        System.out.println("getpercentage");
        Schemes instance = new Schemes("3","Anmol","34%","dlkfjldk");
        String expResult = "34%";
        String result = instance.getpercentage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getdes method, of class Schemes.
     */
    @Test
    public void testGetdes() {
        System.out.println("getdes");
        Schemes instance = new Schemes("3","Anmol","34%","No water connection in localilty.");
        String expResult = "No water connection in localilty.";
        String result = instance.getdes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
