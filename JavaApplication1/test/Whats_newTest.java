/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;
import java.util.List;
/**
 *
 * @author lenovo
 */
public class Whats_newTest {
    
    public Whats_newTest() {
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
     * Test of schemeList method, of class Whats_new.
     */
    @Test
    public void testSchemeList() throws SQLException {
        System.out.println("schemeList");
        Whats_new instance = new Whats_new();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_scheme", "root" ,"qw");
        String sql = "Select * from new_info";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery(sql);
        Schemes user;
        List<Schemes> schemeList = new ArrayList<Schemes>();
        while(rs.next()){
            user=new Schemes(rs.getString("id"),rs.getString("name"),rs.getString("percentage"),rs.getString("description"));
            schemeList.add(user);
        }
        ArrayList<Schemes> expResult = null;
        ArrayList<Schemes> result = instance.schemeList();
        assertEquals(schemeList.get(0).getname(), result.get(0).getname());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testSchemeList1() throws SQLException {
        System.out.println("schemeList");
        Whats_new instance = new Whats_new();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_scheme", "root" ,"qw");
        String sql = "Select * from new_info";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery(sql);
        Schemes user;
        List<Schemes> schemeList = new ArrayList<Schemes>();
        while(rs.next()){
            user=new Schemes(rs.getString("id"),rs.getString("name"),rs.getString("percentage"),rs.getString("description"));
            schemeList.add(user);
        }
        ArrayList<Schemes> expResult = null;
        ArrayList<Schemes> result = instance.schemeList();
        assertEquals(schemeList.get(0).getpercentage(), result.get(0).getpercentage());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testSchemeList2() throws SQLException {
        System.out.println("schemeList");
        Whats_new instance = new Whats_new();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_scheme", "root" ,"qw");
        String sql = "Select * from new_info";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery(sql);
        Schemes user;
        List<Schemes> schemeList = new ArrayList<Schemes>();
        while(rs.next()){
            user=new Schemes(rs.getString("id"),rs.getString("name"),rs.getString("percentage"),rs.getString("description"));
            schemeList.add(user);
        }
        ArrayList<Schemes> expResult = null;
        ArrayList<Schemes> result = instance.schemeList();
        assertEquals(schemeList.get(0).getpercentage(), result.get(0).getpercentage());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
