<%-- 
    Document   : Ac_admin
    Created on : Nov 27, 2014, 11:03:44 PM
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
<%@ include file="Header_Admin.jsp" %>
<%
    String uemail = request.getParameter("Name");
    String upass = request.getParameter("Password");
    String e1=uemail   ; 
   

    uemail = "'" + uemail + "'";
    out.print("Welcome");
    try {
        Connection conn = ConnectionProvider.getCon();
        String query = "select*from ADMIN where Email=" + uemail;
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
            
        } else if (pass.equals(upass) && "E".equals(status)) {
            session.setAttribute( "id", e1);
            response.sendRedirect("Control_Panel.jsp");
            session.setAttribute( "token", 2);
        } else {
            session.setAttribute( "id", null);
            response.sendRedirect("index.jsp");
        }
    } catch (Exception e) {
        out.print(e);
    }


%>