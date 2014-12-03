<%-- 
    Document   : logout_Admin
    Created on : Dec 3, 2014, 8:36:27 PM
    Author     : Knight
--%>

<%
    session.setAttribute( "id", null);
    response.sendRedirect("Admin_Login.jsp");
%>