/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Knight
 */
public class GetInfo {

    public static ResultSet get(String id) throws Exception {

        Connection conn = ConnectionProvider.getCon();
        String query = "select * from INFO where EMAIL=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, id);
       ResultSet rs=ps.executeQuery(); 
        return rs;
    }
     public static int AddorNot(String id ,String application) throws Exception {
        int count =0;
        Connection conn = ConnectionProvider.getCon();
        String query = "select*from LIST_APPLICATION where APPLICATION=? and job=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1,application );
        ps.setString(2,id );
        ResultSet rs=ps.executeQuery(); 
        if(!rs.next()){
            count=1;
        }else{
            count=2;
        }
        return count;
    }

}
