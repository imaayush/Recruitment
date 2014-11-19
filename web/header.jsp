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
        <title>Home</title> 
    </head> 
    <body> 
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

            }


        %>
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
                <div id="demo">
                    <ul  class="nav navbar-nav navbar-right navbar-user">
                        <li  class="dropdown messages-dropdown" >
                            <a  href="#" class="dropdown-toggle" data-toggle="dropdown"style="color: #ffffff"><i class="fa fa-envelope"></i> Messages <span class="badge">2</span> <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li class="dropdown-header">2 New Messages</li>
                                <li class="message-preview">
                                    <a href="#">
                                        <span class="avatar"><i class="fa fa-bell"></i></span>
                                        <span class="message">Security alert</span>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li class="message-preview">
                                    <a href="#">
                                        <span class="avatar"><i class="fa fa-bell"></i></span>
                                        <span class="message">Security alert</span>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li><a href="#">Go to Inbox <span class="badge">2</span></a></li>
                            </ul>
                        </li>
                        <li class="dropdown user-dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: #ffffff"><i class="fa fa-user"></i><%=Name%><b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
                                <li><a href="#"><i class="fa fa-gear"></i> Settings</a></li>
                                <li class="divider"></li>
                                <li><a href="#"><i class="fa fa-power-off"></i> Log Out</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
<%                    
            
                        if (token== 1) {
                      
               %>
               <%@include  file="side_bar1.jsp" %>
               <% }%>