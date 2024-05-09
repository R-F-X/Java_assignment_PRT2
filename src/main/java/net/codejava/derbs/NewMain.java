
package net.codejava.derbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewMain {

    public static void main(String[] args) {
        
        
//        String url = "jdbc:derby://localhost:1527/test;create=true";
        String url = "jdbc:derby://localhost:1527/derby14";
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection conn = DriverManager.getConnection(url);
             System.out.println("connection successful");
             
//             PreparedStatement pStatement = conn.prepareStatement("INSERT INTO `time_entry`(pid,tid,rid,tspend,description) VALUES (?, ?, ?, ?, ?)");
             
//                pStatement.setString(1, pid);
//
//                pstmt.executeUpdate();
                
             String sql = "INSERT INTO users (name, id )" + " VALUES ('josh', 0103)";
             Statement statement = conn.createStatement(); // need to use ur connection variable!!!
             int rows = statement.executeUpdate(sql);
             
             if(rows > 0){
                 System.out.println("new user details successfully inserted");
             }
              // shutdown url look into this / close connection if needed
             
        }catch(SQLException ex){
               ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
