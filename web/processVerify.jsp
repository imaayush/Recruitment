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
<%@ include file="select.jsp" %>
<%       
        String id = (String) session.getAttribute("id");
        try 
        {
           
        } 
        catch (Exception e)
        {
            out.print(e);
        } 
        finally 
        {

        }

    
%>