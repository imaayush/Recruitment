<%-- 
    Document   : Profile
    Created on : Nov 19, 2014, 11:49:21 PM
    Author     : Knight
--%>

<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ page import="bean.GetInfo.*" %>  
<%@ page import="bean.ConnectionProvider.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%session.setAttribute( "token",2);%>
<link href="css/card.css" rel="stylesheet" type="text/css"/>
<%@ include file="header.jsp" %>

<div style="width:75% ;float:left;height:95%;margin-left:18%; margin-top: -2% ">
    <form role="form"  action="From.jsp" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" style="height:92%">

                    <div class="listing-content">
                        <br>
                        <div class="col-sm-12">
                           
                            <button type="Submit" class="btn btn-primary" style="float: right;">Edit Profile</button>

                            
                        </div>



                    </div>




                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>
