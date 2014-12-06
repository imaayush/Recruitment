<%-- 
    Document   : Create_Event
    Created on : Dec 5, 2014, 6:17:41 PM
    Author     : Knight
--%>

<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ page import="bean.GetInfo.*" %>  
<%@ page import="bean.ConnectionProvider.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<link href="css/card.css" rel="stylesheet" type="text/css"/>
<%@ include file="Header_Admin.jsp" %>

<div style="width:75% ;float:left;height:95%;margin-left:22%; margin-top: -2% ">
    <form role="form" action="Personal" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Create Job</div>
                    </div>
                    <div class="listing-content" >
                        <br>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Job ID</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="JobID" value=<%=request.getParameter("Create_Event")%> readonly>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Next Event</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="jEvent">
                                    <option value="Quiz">Quiz</option>
                                    <option value="Interview">Interview</option>
                                    <option value="Challenge">Challenge</option>
                                    <option value="Physical">Physical</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label"> Event Url</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="jEventUrl" placeholder="Event Url" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Start Time</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="jTimeStart" placeholder="DD/MM/YYYY HH:MM" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">End Time</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="jTimeEnd" placeholder="DD/MM/YYYY HH:MM" >
                            </div>
                        </div>

                    </div>


                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Create_Event" name="Create_Event" >Create</button>


                        </div>
                    </div>

                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>