<%-- 
    Document   : Header_Admin
    Created on : Nov 27, 2014, 10:44:22 PM
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
         <%--<script src="//code.jquery.com/jquery.min.js"></script>--%>
         <script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
          <script src="js/bootstrap.min.js" type="text/javascript"></script>
      
        <script src="js/bootstrap-tagsinput.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css" >
        <link rel="stylesheet" type="text/css" href="css/home_style.css" >
        <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />
        <link rel="stylesheet" type="text/css" href="css/local.css"  />
        <%--<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>--%>
       
        <% String id = (String) session.getAttribute("id");
            
            
      

        %>
       
        
        <title>Home</title> 
    </head> 
    <body> 
        
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation" >            
            <div class="navbar-header" style="opacity: 0.9;">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">Admin Panel</a>
            </div>
            <div class="collapse navbar-collapse navbar-ex1-collapse"  >
                                   
            
                        
                      
              
               <%@include  file="side_admin.jsp" %>
               
               
                 
               <%@include  file="Admin_Name.jsp" %>
              
               
            </div>
        </nav>
