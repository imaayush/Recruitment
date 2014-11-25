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

                            if (session.getAttribute("id") != null) {
                                String id2 = (String) session.getAttribute("id");
                                Connection conn = ConnectionProvider.getCon();
                                String query = "select*from EXPERIENCE where email=" + "'" + id2 + "'";
                                PreparedStatement ps = conn.prepareStatement(query);
                                // ps.setInt(1,1);
                                // ps.setString(1,uemail);
                                ResultSet rs = ps.executeQuery();
                                String pass = null;
                                String status = null;

                                while (rs.next()) {%>