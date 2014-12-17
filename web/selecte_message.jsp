<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="bean.GetInfo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    
    int count = 0;
    if (session.getAttribute("id") != null) {
        String id2 = (String) session.getAttribute("id");
        Connection conn = ConnectionProvider.getCon();
        String query = "select count(ID) AS COUNT from MESSAGE where RECIVER_MAIL=? AND Flag=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, id2);
        ps.setString(2, "Unread");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            count = rs.getInt("COUNT");
        }
        conn.close();
        conn = ConnectionProvider.getCon();
        query = "select*from MESSAGE where RECIVER_MAIL=" + "'" + id2 + "'" + "ORDER BY ID DESC";
        ps = conn.prepareStatement(query);

        rs = ps.executeQuery();

        String pass = null;
        String status = null;


%>