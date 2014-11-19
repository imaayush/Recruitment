/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Knight
 */
public class Update {
    
    public static void Upadate( String query )
    {
            try {
               
                Connection conn = ConnectionProvider.getCon();
               
               // String query = "update INFO_TEMP set FATHER_NAME=?,AGE=?,ADRESS=?,X=?,XII=?,GRAD=?,INSTITUTION=?,PROJECT=?,SKILLES=?,EXPERIENCE=?,COMPANY=?,PHOTO_PATH=?,SNIG_PATH=? where EMAIL= ?";
                PreparedStatement ps = conn.prepareStatement(query);
        
        
                ps.executeUpdate();

            } catch (Exception e) {
                out.print(e);
            }
    }
    
}
