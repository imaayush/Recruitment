<%-- 
    Document   : portfolio
    Created on : Nov 19, 2014, 11:51:01 PM
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

<div style="width:75% ;float:left;height:95%;margin-left:22%; margin-top: -2% ">
    <form role="form" action="Personal" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" >
                    
                   <div class="listing-content">
                        <br>
                      

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-4 control-label" style="margin-left:-24%;">SETTINGS</label>
                            
                            <input type="hidden" class=" form-control"  name="email" value=<%= session.getAttribute("id")%> >
                        </div>
                        <hr class="hr">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-4 control-label">Old Password</label>
                            <div class="col-sm-6">
                                <input type="Password" class=" form-control"  name="OldPassword"  placeholder="Old Password" required >
                            </div>
                            
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-4 control-label">New Password</label>
                            <div class="col-sm-6">
                                <input type="Password" class=" form-control"  name="NewPassword"  placeholder="New Password" required >
                            </div>
                            
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-4 control-label">Conform Password</label>
                            <div class="col-sm-6">
                                <input type="Password" class=" form-control"  name="CPassword" placeholder="Conform Password" required >
                            </div>
                            
                        </div>
                        
                    </div>
                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Save"  name ="change">Submit</button>


                        </div>
                    </div>

                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>
