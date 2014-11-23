<%-- 
    Document   : Ac.jsp
    Created on : Nov 17, 2014, 2:30:15 PM
    Author     : Knight
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ include file="header.jsp" %>
<%
    String uemail = request.getParameter("Name");
    String upass = request.getParameter("Password");
    String e1=uemail   ; 
   

    uemail = "'" + uemail + "'";
    out.print("Welcome");
    try {
        Connection conn = ConnectionProvider.getCon();
        String query = "select*from INFO where Email=" + uemail;
        PreparedStatement ps = conn.prepareStatement(query);
                // ps.setInt(1,1);
        // ps.setString(1,uemail);
        ResultSet rs = ps.executeQuery();
        String pass = null;
        String status = null;
        while (rs.next()) {
            pass = rs.getString("Password");
            status = rs.getString("Status");

        }
        if (pass.equals(upass) && "D".equals(status)) {
            session.setAttribute( "id", e1);
            response.sendRedirect("verify.jsp");
            session.setAttribute( "token", 0);
            
        } else if (pass.equals(upass) && "A".equals(status)) {
            session.setAttribute( "id", e1);
            response.sendRedirect("home.jsp");
            session.setAttribute( "token", 2);
        } else {
            session.setAttribute( "id", null);
            response.sendRedirect("index.jsp");
        }
    } catch (Exception e) {
        out.print(e);
    }


%>