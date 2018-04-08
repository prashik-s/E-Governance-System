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
import java.sql.*;
/**
 *
 * @author lenovo
 */
public class Register_ComplaintTest {
    
    public Register_ComplaintTest() {
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
     * Test of main method, of class Register_Complaint.
     */
    @Test
    public void testMain() throws ClassNotFoundException, SQLException {
        System.out.println("main");
        String[] args = null;
        Register_Complaint.main(args);
        Class.forName("com.mysql.jdbc.Driver");     
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Complaint_info", "root" ,"qw");
        System.out.println("Connected");       
        Statement stmt = (Statement) conn.createStatement();
                //stmt.executeUpdate("INSERT INTO student(fnamedb,lnamedb,uiddb,Contact,adddb,password,eiddb,dateobdb,sex)" + " VALUES ('"+fname+"','"+lname+"','"+uid+"','"+contact+"','"+add+"','"+password+"','"+eid+"','"+dateob+"','"+ss+"')");
         //String sql = "INSERT INTO student(fnamedb,lnamedb,uiddb,Contact,adddb,password,eiddb,dateobdb,sex) VALUES (?,?,?,?,?,?,?,?,?)";
         //PreparedStatement pstmt = conn.prepareStatement(sql);
//conn=DriverManager.getConnection("jdbc:mysql:///mydb","root","df");
        String user="te1";
        String desc="no water";
        String prio="high";
        String typ="Water";
        PreparedStatement pstmt=conn.prepareStatement("INSERT INTO  cinfo  VALUES (?,?,?,?,?)");
        pstmt.setString(1,user);
        pstmt.setString(2,desc);
        pstmt.setString(3,"0%");
        pstmt.setString(4,prio);
        pstmt.setString(5,typ);
        int i=pstmt.executeUpdate();
        PreparedStatement nstmt=conn.prepareStatement(" Select * from cinfo where name=? and Description=? and Status=? and Priority=? and Type=?");
        nstmt.setString(1,user);
        nstmt.setString(2,desc);
        nstmt.setString(3,"0%");
        nstmt.setString(4,prio);
        nstmt.setString(5,typ);
        ResultSet j=nstmt.executeQuery();
        int k=0;
        if(j.next())
        {
            k=1;
        }
        assertEquals(1,k);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMain1() throws ClassNotFoundException, SQLException {
        System.out.println("main");
        String[] args = null;
        Register_Complaint.main(args);
        Class.forName("com.mysql.jdbc.Driver");     
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Complaint_info", "root" ,"qw");
        System.out.println("Connected");       
        Statement stmt = (Statement) conn.createStatement();
                //stmt.executeUpdate("INSERT INTO student(fnamedb,lnamedb,uiddb,Contact,adddb,password,eiddb,dateobdb,sex)" + " VALUES ('"+fname+"','"+lname+"','"+uid+"','"+contact+"','"+add+"','"+password+"','"+eid+"','"+dateob+"','"+ss+"')");
         //String sql = "INSERT INTO student(fnamedb,lnamedb,uiddb,Contact,adddb,password,eiddb,dateobdb,sex) VALUES (?,?,?,?,?,?,?,?,?)";
         //PreparedStatement pstmt = conn.prepareStatement(sql);
//conn=DriverManager.getConnection("jdbc:mysql:///mydb","root","df");
        String user="te1";
        String desc="no water";
        String prio="high";
        String typ="Water";
        PreparedStatement pstmt=conn.prepareStatement("INSERT INTO  cinfo  VALUES (?,?,?,?,?)");
        pstmt.setString(1,user);
        pstmt.setString(2,desc);
        pstmt.setString(3,"0%");
        pstmt.setString(4,prio);
        pstmt.setString(5,typ);
        int i=pstmt.executeUpdate();
        PreparedStatement nstmt=conn.prepareStatement(" Select * from cinfo where name=? and Description=? and Status=? and Priority=? and Type=?");
        nstmt.setString(1,user);
        nstmt.setString(2,desc);
        nstmt.setString(3,"0%");
        nstmt.setString(4,prio);
        nstmt.setString(5,"Electricity");
        ResultSet j=nstmt.executeQuery();
        int k=0;
        if(j.next())
        {
            k=1;
        }
        assertEquals(0,k);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
