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
<%session.setAttribute( "token",2);%>
<link href="css/card.css" rel="stylesheet" type="text/css"/>
<%@ include file="header.jsp" %>

<div style="width:75% ;float:left;height:95%;margin-left:18%; margin-top: -2% ">
    <form role="form" action="Personal" method="post"  class="form-horizontal" >

        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" >

                    <div class="listing-content">
                        <br>

                        <div class="col-lg-3 col-md-4 col-xs-6 thumb"><br>

                            <img class="img-thumbnail" src=<%=Photo%> alt=<%=Name.toUpperCase()%> style="height:32%;"/>

                            <br>
                            <h5></h5>
                        </div>
                        <div class="col-lg-4 col-md-4 col-xs-4 thumb"><br>

                            <div class="shape" style="background-color:white;">
                                <div class="shape-text" style="padding-left:15%;color:black; " ><h3><%=Name.toUpperCase()%></h3></div>
                            </div>

                            <div class="shape" style="background-color:white;">
                                <div class="shape-text" style="padding-left:15%;color:black; " >Frameworks : <span class="large darker" style="color:#5e5e5e;"><%=Frameworks%></span></div>
                            </div>
                            
                            <div class="shape" style="background-color:white;">
                                <div class="shape-text" style="padding-left:15%;color:black; " ><a href=<%=Resume%>>Resume</a></div>
                            </div>
                        </div>

                    </div>




                </div>

            </div>
        </div>
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" style="height:50%">
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
