<%-- 
    Document   : welcome
    Created on : Nov 6, 2014, 2:39:06 PM
    Author     : Knight
--%>

<%@page import="java.sql.*"%>
<%@page import="bean.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="bean.ConnectionProvider.*" %>   

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%  String Father = request.getParameter("Father");
            String Age = request.getParameter("Age");
            int Age1 = Integer.parseInt(Age);
            String Add1 = request.getParameter("Add1");
             Add1 = Add1 + request.getParameter("Add2");
            Connection conn = ConnectionProvider.getCon();
            String query = "update INFO_TEMP set FATHER_NAME=? ,AGE=? ,ADRESS=? where EMAIL= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, Father);
            ps.setInt(2, Age1);
            ps.setString(3,Add1);
            ps.setString(4,"ctiwari942@gmail.com");
            ps.executeUpdate();
        %>
    </body>
</html>
