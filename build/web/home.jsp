<%-- 
    Document   : From
    Created on : Nov 19, 2014, 5:42:21 PM
    Author     : Knight
--%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ page import="bean.GetInfo.*" %>  
<%@ page import="bean.ConnectionProvider.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<link href="css/card.css" rel="stylesheet" type="text/css"/>
<%@ include file="header.jsp" %>
<%
    Name = "";
    String Email = "";
    String Mobile = "";
    String Age = "";
    String Add = "";
    String Father = "";
    String InX = "";
    String X = "";
    String InXII = "";
    String XII = "";
    String InGrad = "";
    String Grad = "";
    String InPG = "";
    String PG = "";
    id = (String) session.getAttribute("id");
    ResultSet rs = GetInfo.get(id);

    while (rs.next()) {
        Name = rs.getString("NAME");
        Email = rs.getString("EMAIL");
        Mobile = rs.getString("Mobile");
        Age = rs.getString("Age");
        Add = rs.getString("Address");
        Father = rs.getString("Father");
    }


%>
<div style="width:75% ;float:left;height:95%;margin-left:18%; margin-top: -2% ">
    <form role="form" action="Personal" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" style="height:92%">
                    <div class="shape">
                        <div class="shape-text">Application Status</div>
                    </div>
                    <div class="listing-content">
                        <br>




                    </div>

                    


                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>
