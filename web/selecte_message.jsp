<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="bean.GetInfo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String ProjectName = "";
    String DESCRIPTION = "";
    String STARTDATE = "";
    String ENDDATE = "";
    int num = 0;
    int count = 0;
    if (session.getAttribute("id") != null) {
        String id2 = (String) session.getAttribute("id");
        Connection conn = ConnectionProvider.getCon();
        String query = "select count(ID) AS COUNT from MESSAGE where RECIVER_MAIL=" + "'" + id2 + "'";
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            count = rs.getInt("COUNT");
        }
        conn.close();
        conn = ConnectionProvider.getCon();
        query = "select*from MESSAGE where RECIVER_MAIL=" + "'" + id2 + "'" +"ORDER BY ID DESC";
        ps = conn.prepareStatement(query);

         rs = ps.executeQuery();

        String pass = null;
        String status = null;


%>