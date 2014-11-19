<%-- 
    Document   : header
    Created on : Nov 18, 2014, 5:23:28 PM
    Author     : Knight
--%>

<%@page import="bean.GetInfo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" type="text/css" href="css/home_style.css">

        <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />
        <link rel="stylesheet" type="text/css" href="css/local.css" />
        <script src="js/jquery-2.1.1.min.js "></script>
        <script src="js/bootstrap.min.js"></script>
        <% String id = (String) session.getAttribute("id");
            String Status = "";
            String Name = "";
            int token = 0;
            if ("".equals(id) == false) {
                ResultSet rs = GetInfo.get(id);
                while (rs.next()) {
                    Name = rs.getString("NAME");
                    Status = rs.getString("Status");
                }
                if (Status.equals("D")) {
                    token = 1;
                }
                if (Status.equals("A")) {
                    token = 2;
                }

            }else{


        %>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <%}%>
        <title>Home</title> 
    </head> 
    <body> 
        
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">            
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Admin Panel</a>
            </div>
            <div class="collapse navbar-collapse navbar-ex1-collapse" >
                <%                    
            
                        if (token== 2) {
                      
               %>
               <%@include  file="side_nav.html" %>
               <% }%>
               
                 <%                    
            
                        if (token== 2 ||token==1) {
                      
               %>
               <%@include  file="Name.jsp" %>
               <% }%>
               
            </div>
        </nav>
<%                    
            
                        if (token== 1) {
                      
               %>
               <%@include  file="side_bar1.jsp" %>
               <% }%>