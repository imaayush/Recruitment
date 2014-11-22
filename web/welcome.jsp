<%-- 
    Document   : welcome
    Created on : Nov 6, 2014, 2:39:06 PM
    Author     : Knight
--%>

<%@page import="java.sql.*"%>
<%@page import="bean.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="bean.ConnectionProvider.*" %>   

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><head>
            <meta charset="utf-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <script src="//code.jquery.com/jquery.min.js"></script>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" type="text/css" />
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<link href="css/bootstrap-tagsinput.css" rel="stylesheet" type="text/css"/>
<script src="js/bootstrap-tagsinput.js" type="text/javascript"></script>
        <title>Home</title> 
  
       
    </head>
    <body>
         <form role="form" action="Personal" method="post"  class="form-horizontal" >
 <input type="text"   value="Amsterdam,Washington,Sydney,Beijing,Cairo" data-role="tagsinput" name="a" />
  <button type="Submit" class="btn btn-primary" value="Save" >Save</button>
         </form>
        
    </body>
</html>
