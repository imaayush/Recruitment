<%-- 
    Document   : Selecte_Q
    Created on : Dec 4, 2014, 5:04:30 PM
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
    int num = 0;
    int count = 0;
    if (session.getAttribute("id") != null) {
        String id2 = (String) session.getAttribute("id");
        Connection conn = ConnectionProvider.getCon();
        String query = "select ID ,Question from QUESTION";
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
        
        


%>