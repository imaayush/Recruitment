<%-- 
    Document   : Read
    Created on : Dec 6, 2014, 7:21:44 PM
    Author     : Knight
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% String MessID=request.getParameter("x1");
    Connection conn = ConnectionProvider.getCon();
    String query = "update MESSAGE set flag=?  where ID= ?";
    PreparedStatement ps = conn.prepareStatement(query);

    ps.setString(1, "Read");
    ps.setString(2, MessID);
    ps.executeUpdate();
    conn.close();
    response.sendRedirect("Mail_box.jsp");
    
%>