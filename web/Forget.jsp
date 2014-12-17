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
<link href="css/bootstrap-tagsinput.css" rel="stylesheet" type="text/css"/>
<script src="js/bootstrap-tagsinput.js" type="text/javascript"></script>
<link href="css/card.css" rel="stylesheet" type="text/css"/>

<%@ include file="index_heder.jsp" %>
<div style="width:75% ;height:100% ; margin-left:20%">

    <form role="form" action="Basic" method="post"  class="form-horizontal" >
        


        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    
                    <div class="listing-content">
                        <br>


                        
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-4 control-label">Email</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control"  name="email"  placeholder="Email" required >
                            </div>
                        
                        
                    </div>

                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Save"  name ="Forgot">Submit</button>


                        </div>
                    </div>

                </div>

            </div>
        </div>


        

    </form>

    

</div>
<!-- Table -->



</body> 
</html>
