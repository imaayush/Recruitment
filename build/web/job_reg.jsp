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
            if(GetInfo.AddorNot(job, id1)==1){
            String query = "insert into LIST_APPLICATION (ID,APPLICATION,STATUS,JOB) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, 1);
            ps.setString(2, id1);
            ps.setString(3, "Quiz");
            ps.setString(4, job);
            ps.executeUpdate();
            }else{
            String query = "delete from LIST_APPLICATION where job=? and APPLICATION=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, job);
            ps.setString(2, id1);
            ps.executeUpdate();
            }

            Thread.sleep(5000);
            response.sendRedirect("home.jsp");
        } else {

        }
    }
%>