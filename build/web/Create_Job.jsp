<%-- 
    Document   : Create_Job
    Created on : Nov 28, 2014, 1:26:02 AM
    Author     : Knight
--%>
<%if ((String) session.getAttribute("id") == null) {
        response.sendRedirect("Admin_Login.jsp");

    }
%>
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
                            <label for="inputEmail3" class="col-sm-2 control-label">Name of Job</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="NameJob" placeholder="Name">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Details</label>
                            <div class="col-sm-6">
                                <textarea class="form-control" rows="4" name="JobDetails"></textarea>
                            </div>
                        </div> 
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Opening Date</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="OpeningDate" placeholder="MM/DD/YYYY" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Closing Date</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="closingDate" placeholder="MM/DD/YYYY" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">No of Round</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="NRound" value="3">
                            </div>
                        </div>


                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Position</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="jPosition" placeholder="Position" >
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Next Event</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="jEvent">
                                    <option value="Quiz">Quiz</option>

                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label"> Quiz Name</label>
                            <div class="col-sm-6">
                                
                                <select class="form-control" name="jEventUrl">
                                  <%@include file="SelecteAll_Quiz.jsp" %>
                                    <option value="<%=rs.getString("Id")%>"><%=rs.getString("Id")%>&nbsp;)&nbsp;<%=rs.getString("Name")%></option>
                                     <%}}
                                else{}
                                %>

                                </select>
                               
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Start Time</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="jTimeStart" placeholder="MM/DD/YYYY HH:MM" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">End Time</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="jTimeEnd" placeholder="MM/DD/YYYY HH:MM" >
                            </div>
                        </div>


                    </div>


                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Job_Create" name="Job_Create" >Create</button>


                        </div>
                    </div>

                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>
