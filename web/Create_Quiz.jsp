<%-- 
    Document   : Create_Quiz
    Created on : Dec 4, 2014, 4:04:31 AM
    Author     : Knight
--%>

<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ page import="bean.GetInfo.*" %>  
<%@ page import="bean.ConnectionProvider.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<link href="css/bootstrap-tagsinput.css" rel="stylesheet" type="text/css"/>
<script src="js/bootstrap-tagsinput.js" type="text/javascript"></script>
<link href="css/card.css" rel="stylesheet" type="text/css"/>
<%@ include file="Header_Admin.jsp" %>

<div style="width:75% ;float:left;height:95%;margin-left:22%; margin-top: -2% ">
    <form role="form" action="Personal" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Create Quiz</div>
                    </div>
                    <div class="listing-content" >
                        <br>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Name of Quiz</label>
                            <div class="col-sm-6">
                               
                                <input type="text" class=" form-control" id="inputEmail3" name="NameQuiz" placeholder="Name of Quiz" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">No. of Question</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="NoQuestion" placeholder="No. of Que in Quiz"  >
                            </div>
                        </div> 
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Start Time</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="Start_Time" placeholder="DD/MM/YYYY HH:MM"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">End Time</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="End_Time" placeholder="DD/MM/YYYY HH:MM"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Cutoff</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="cutoff" placeholder="Enter Cutoff for Quiz"  >
                            </div>
                        </div>


                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label"> Question Marks</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="Marks"  placeholder="Marks for each Que" >
                            </div>
                        </div>
                        <div class="shape" style=" width: 106%; margin-left: -3%;">
                            <div class="shape-text">List Of Questions</div>
                        </div>
                        <div class="form-group" style="overflow: auto;height:50% !important;">
                            <%@include file="Selecte_Q.jsp" %>
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>  Question </th>

                                    </tr>
                                </thead>
                                <%while (rs.next()) {%>
                                <tr>
                                    <td><%=rs.getString("ID")%></td>
                                    <td><%=rs.getString("QUESTION")%></td>
                                   
                                </tr>
                                <%}

                                } else {

                                }%>



                            </table>
                            
                                <hr class="hr">

                            
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-3 control-label"> Add Question(By ID) </label>
                            <div class="col-sm-6">
                                <input type="text"   data-role="tagsinput" name="AddQuestion" />
                            </div>
                        </div>
                    </div>


                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Create_Quiz" name="Create_Quiz" >Create Quiz</button>


                        </div>
                    </div>

                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>