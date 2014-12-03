<%-- 
    Document   : selecte_admin
    Created on : Nov 27, 2014, 10:47:03 PM
    Author     : Knight
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ConnectionProvider"%>
<%-- 
    Document   : portfolio
    Created on : Nov 19, 2014, 11:51:01 PM
    Author     : Knight
--%>
<%@page import="bean.GetInfo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String Name = "";
    String Email = (String)session.getAttribute("id");
    String Mobile = "";
    String Password = "";
    String Status = "";
    if (session.getAttribute("id") != null) {
        Connection conn = ConnectionProvider.getCon();
        String query = "select * from ADMIN where email =?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, Email);

        ResultSet rs = ps.executeQuery();
        

        while (rs.next()) {
            Name = rs.getString("NAME");
            Password = rs.getString("Password");
            Mobile = rs.getString("Mobile");

            Status = rs.getString("Status");

        }

    } else {
    }
%>