/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author sprem
 */
public class Hospitalmanagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Connection conn=null;
        try{
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "localhost";
            String serverPort =  "1521";
            String sid="XE";
            String url="jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":"+sid;
            String username="system";
            String password="1980";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected successfully");
            Statement st = conn.createStatement();
            st.execute("Insert into patient values"+"(1000,prem,chennai,feverrr,ADMITTED)");
            ResultSet rs = st.getResultSet();
            while(rs.next())
            {
            System.out.println("Pateint Entries "+rs.getInt(1)+rs.getString(1)+rs.getString(1)+rs.getString(1)+rs.getString(1));
            
            
            }
        }catch (ClassNotFoundException e){
            System.out.println("could not find the database driver" + e.getMessage());
        }catch (SQLException e){
            System.out.println("could not connect to the database" + e.getMessage());
           
            
           
        }
    }
    
}
