<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="bean.GetInfo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (request.getParameter("Job") != null) {
        if (session.getAttribute("id") != null) {
            String id1 = (String) session.getAttribute("id");
            String job = request.getParameter("Job");
            Connection conn = ConnectionProvider.getCon();
            String query = "insert into LIST_APPLICATION (ID,APPLICATION,STATUS,JOB) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, 1);
            ps.setString(2, id1);
            ps.setString(3, "Quiz");
            ps.setString(4, job);

            ps.executeUpdate();
            response.sendRedirect("job.jsp");
        } else {

        }
    }
%>