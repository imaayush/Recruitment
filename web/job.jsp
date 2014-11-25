<%-- 
    Document   : blog
    Created on : Nov 19, 2014, 11:52:04 PM
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
<% for (int i = 0; i < 10; i++) { %>
<div style="width:75% ;float:left;margin-left:22%; margin-top: -2% ">
    <form role="form" action="Personal" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" >

                    <div class="listing-content">
                        <br>

                        <table data-url="#" class="table table-hover" >
                            <thead>
                                <tr>
                                    <th data-field="id" data-halign="right" data-align="center">Job Name</th>

                                </tr>
                                <tr>
                                    <th data-field="id" data-halign="right" data-align="center">bodyjdgshluhtrgkssjfsdiguerghjhxbhvjags,fygsarhghfdjaghjhuhgjthgjdvhjjbxzljgjfd ghljvfdnvlbljfdhgldtgjhbljfdvbjhdfjhgtuhgudsjvbdfhsgjlhguthlug</th>
                                </tr>
                                <tr>
                                    <th data-field="id" data-halign="right" data-align="center">
                                        opening :21/22/2014<br>
                                        closeing:21/22/2014<br>
                                        Number of round:4<br>
                                    </th>
                                </tr>

                            </thead>
                        </table>
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Save" name="general" >Register for Job</button>
                            <br>
                            <h1></h1>
                            <span></span>
                        </div>

                    </div>




                </div>

            </div>
        </div>


    </form>
</div>
<%}%>
</body>
</html>
