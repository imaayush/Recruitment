<%-- 
    Document   : Create_Q
    Created on : Dec 4, 2014, 3:21:19 AM
    Author     : Knight
--%>
<%if((String) session.getAttribute("id")==null){
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
                        <div class="shape-text">Create Question</div>
                    </div>
                    <div class="listing-content" >
                        <br>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Question</label>
                            <div class="col-sm-6">
                                <textarea class="form-control" rows="3" name="Question"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Option A</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="OptionA"  >
                            </div>
                        </div> 
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Option B</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="OptionB"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Option C</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="OptionC"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Option D</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="OptionD"  >
                            </div>
                        </div>


                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Ans</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="Ans"  >
                            </div>
                        </div>
                       

                    </div>


                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Create_Q" name="Create_Q" >Create</button>


                        </div>
                    </div>

                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>