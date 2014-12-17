<%-- 
    Document   : Selecte_messageAll
    Created on : Dec 13, 2014, 5:20:18 PM
    Author     : Knight
--%>


<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="bean.GetInfo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    
    
    if (session.getAttribute("id") != null) {
        String id2 = (String) session.getAttribute("id");
        
       Connection conn = ConnectionProvider.getCon();
         String query = "select*from MESSAGE where RECIVER_MAIL=" + "'" + id2 + "'" + "ORDER BY ID DESC";
       PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        String pass = null;
        String status = null;


%>