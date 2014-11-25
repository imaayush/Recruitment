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

<div style="width:75% ;float:left;margin-left:22%; margin-top: -2% ">
    <form role="form" action="Personal" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" >
                    
                    <div class="listing-content">
                        <br>



                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Title</label>
                            <div class="col-sm-8">
                                <input type="text" class=" form-control" id="inputEmail3" name="Name" value="" placeholder="Title" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label" >Descption</label>
                            <div class="col-sm-8">
                                <textarea class="form-control" rows="2" name="Add" placeholder="blog"></textarea>
                            </div>
                        </div>

                    </div>

                        <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Save" name="general" >Save</button>


                        </div>
                    </div>


                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>
