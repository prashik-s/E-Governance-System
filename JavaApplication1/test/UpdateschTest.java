/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
public class UpdateschTest {
    
    public UpdateschTest() {
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
     * Test of schemeList method, of class Updatesch.
     */
    @Test
    public void testSchemeList() throws SQLException {
        System.out.println("schemeList");
        Updatesch instance = new Updatesch();
        List<Schemes> expResult = new ArrayList<Schemes>();
        expResult.add(new Schemes("1","new notes","85%","New rupees 50 notes"));
        ArrayList<Schemes> result = instance.schemeList();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        ArrayList<Schemes> schemeList= new ArrayList<>();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_scheme", "root" ,"qw");
        String sql = "Select * from new_info";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery(sql);
        Schemes user;
        while(rs.next()){
            user=new Schemes(rs.getString("id"),rs.getString("name"),rs.getString("percentage"),rs.getString("description"));
            schemeList.add(user);
        }
        assertEquals(expResult.get(0).getid(), result.get(0).getid());
    }

    /**
     * Test of show_scheme method, of class Updatesch.
     */


    /**
     * Test of getConnection method, of class Updatesch.
     */
    @Test
    public void testGetConnection() throws SQLException {
        System.out.println("getConnection");
        Updatesch instance = new Updatesch();
        Connection expResult =DriverManager.getConnection("jdbc:mysql://localhost/new_scheme", "root","qw");
        //System.out.println(expResult);
        Connection result = instance.getConnection();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSchemeList1() throws SQLException {
        System.out.println("schemeList");
        Updatesch instance = new Updatesch();
        List<Schemes> expResult = new ArrayList<Schemes>();
        expResult.add(new Schemes("6","new notes","80%","New rupees 50 notes"));
        ArrayList<Schemes> result = instance.schemeList();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        ArrayList<Schemes> schemeList= new ArrayList<>();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_scheme", "root" ,"qw");
        String sql = "Select * from new_info";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery(sql);
        Schemes user;
        while(rs.next()){
            user=new Schemes(rs.getString("id"),rs.getString("name"),rs.getString("percentage"),rs.getString("description"));
            schemeList.add(user);
        }
        assertNotEquals(expResult.get(0).getid(), result.get(0).getid());
    }
    /**
     * Test of executeSQLQuery method, of class Updatesch.
     */

    
}
