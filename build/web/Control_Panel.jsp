 <%-- 
    Document   : Control_Panel
    Created on : Nov 27, 2014, 10:42:08 PM
    Author     : Knight
--%>

<%-- 
    Document   : From
    Created on : Nov 19, 2014, 5:42:21 PM
    Author     : Knight
--%>
<%if((String) session.getAttribute("id")==null){
    response.sendRedirect("Admin_Login.jsp");
    
}
%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ page import="bean.GetInfo.*" %>  
<%@ page import="bean.ConnectionProvider.*" %>
<script src="https://apis.google.com/js/platform.js" async defer></script>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%session.setAttribute("token", 2);%>
<link href="css/card.css" rel="stylesheet" type="text/css"/>
<%@ include file="Header_Admin.jsp" %>

<div style="width:75% ;float:left;margin-left:22%; margin-top: -2% ">
    <form role="form" action="Personal" method="post"  class="form-horizontal" >

        
       
    </form>
</div>

</body>
</html>
