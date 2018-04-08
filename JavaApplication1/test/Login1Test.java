/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;

/**
 *
 * @author lenovo
 */
public class Login1Test {
    
    public Login1Test() {
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
     * Test of main method, of class Login1.
     */
    @Test
    public void test1() throws SQLException {
        System.out.println("main");
        String[] args = null;
        Login1.main(args);
        String username="c";
        String word="c";
        String type="Contractor";
        int t;
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root" ,"qw");
            String sql = "Select * from dabs where user = ? and password = ? and type = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,username);
            pst.setString(2,word);
            pst.setString(3,type);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
              t=1;
            } else {
               t=0;
            }
            conn.close();
            assertEquals(1,t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void test2() throws SQLException {
        System.out.println("main");
        String[] args = null;
        Login1.main(args);
        String username="citi";
        String word="citizen1";
        String type="Contractor";
        int t;
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root" ,"qw");
            String sql = "Select * from dabs where user = ? and password = ? and type = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,username);
            pst.setString(2,word);
            pst.setString(3,type);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
              t=1;
            } else {
               t=0;
            }
            conn.close();
            assertEquals(0,t);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
