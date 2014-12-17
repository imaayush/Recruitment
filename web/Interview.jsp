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
<script src="https://apis.google.com/js/platform.js" async defer></script>
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
                            <label for="inputEmail3" class="col-sm-2 control-label"> Job Id</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="JobId" placeholder="Job Id">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label"> Candidate</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="EmailId" placeholder="Email ID">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Status</label>
                            <div class="col-sm-6">
                                <select class="form-control" name="Status">

                                    <option value="Interview(Qualified)">Interview(Qualified)</option>
                                    <option value="Interview(Disqualified)">Interview(Disqualified)</option>

                                </select>
                            </div>
                        </div> 
                        <hr class="hr">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Take Interview</label>

                            <div id="placeholder-div2" style="background-color:black; "></div>
                            <script>
                                gapi.hangout.render('placeholder-div2', {
                                    'render': 'createhangout',
                                    'initial_apps': [{'app_id': '184219133185', 'start_data': 'dQw4w9WgXcQ', 'app_type': 'ROOM_APP'}],
                                    'widget_size': 72
                                });
                            </script>

                        </div> 
                    </div>


                    <div class="modal-footer">
                        <div class="col-sm-12">

                            <button type="Submit" class="btn btn-primary" value="Job_Create" name="Update_Status" >Save</button>
                        </div>
                    </div>

                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>
