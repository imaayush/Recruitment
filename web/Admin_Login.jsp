<%-- 
    Document   : Admin_Login
    Created on : Nov 27, 2014, 10:31:58 PM
    Author     : Knight
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%if((String) session.getAttribute("id")!=null){
    response.sendRedirect("Control.jsp");
    
}
%>

<%@ include file="index_heder.jsp" %>
<div style="width:27%;float:left;height:100%">
    <h1>  </h1>
</div>

    
<%@ include file="login1.jsp" %>
    


<div style="width:27%;float:left;height:100%">

</div>
</body> 
</html>
