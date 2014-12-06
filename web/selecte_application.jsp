<%@page import="java.util.Date"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="bean.GetInfo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String JobID="";
    String Company="";
    String Details ="";
    String Next_Event ="";
    String Event_Date="";
    String POSITIONS ="";
    String Url="";
    String status="";
    Date date1,date2;
    if (session.getAttribute("id") != null) {
        String id1 = (String) session.getAttribute("id");
        Connection conn = ConnectionProvider.getCon();
        String query = "select*from LIST_APPLICATION where APPLICATION=" + "'" + id1 + "'";
        PreparedStatement ps = conn.prepareStatement(query);
                                // ps.setInt(1,1);
        // ps.setString(1,uemail);
        ResultSet rs = ps.executeQuery();
        String pass = null;
        

        while (rs.next()) {
            String id2 = rs.getString("JOB");
            JobID=rs.getString("ID");
            status=rs.getString("STATUS");
            query = "select*from JOB where ID=" + "'" + id2 + "'";
            PreparedStatement ps1 = conn.prepareStatement(query);

            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                 Company  = rs1.getString("NAME");
                 Details = rs1.getString("DETAILS");
                 Next_Event = rs1.getString("NEXT_EVENT");
                 Event_Date = rs1.getString("EVENT_DATE");
                  POSITIONS = rs1.getString("OPEN_POSITIONS");
                   Url = rs1.getString("EVENT_URL");
            }
        

    
%>