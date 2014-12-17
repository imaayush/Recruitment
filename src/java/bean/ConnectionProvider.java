/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Knight
 */
import java.sql.*;
import static bean.Provider.*;

public class ConnectionProvider {

    public static Connection getCon() throws Exception {
        Connection con = null;
        try {
            
            Class.forName(DRIVER);
            con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            
        } catch (Exception e) {
            System.out.print(e);
            con.close();
            
        } 
        
        return con;
    }

}
