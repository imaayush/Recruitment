<%-- 
    Document   : list_job
    Created on : Dec 4, 2014, 4:18:38 AM
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
<%@include file="selecte_job.jsp" %>
<div style="width:75% ;float:left;margin-left:22%; margin-top: -2% ">
    <form role="form" action="job_reg.jsp" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" >

                    <div class="listing-content">
                        <br>

                        <table data-url="#" class="table table-hover" >
                            <thead>
                                <tr>
                                    <th data-field="id" data-halign="right" data-align="center"><%=rs.getString("Name")%></th>

                                </tr>
                                <tr>
                                    <th data-field="id" data-halign="right" data-align="center"><%=rs.getString("DETAILS")%></th>
                                </tr>
                                
                            </thead>
                        </table>
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value=<%=rs.getString("ID")%> name="Job_Remove" >Remove</button>
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
<%}

}
else{

 }%>

</body>
</html>
