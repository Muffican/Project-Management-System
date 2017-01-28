/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package project.management.system;
import java.sql.*;

/**
 *
 * @author Red1498
 */
public class Connector {
    Connection connect;
    
    public Connector(){
        try{
        Class.forName("com.mysql.jdbc.Driver");//getting driver from the libraries
        }catch(ClassNotFoundException e){//check for network connection
            System.err.println(e);//prints the error 
        }
        
        try{
        connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/pms","root","");//connection to the Project Manager System database on local host
        }catch(SQLException e){//check for network connection
            System.err.println(e);//prints the error 
        }
        
        Connection getconnexion(){return connect;}
        
    }
}
