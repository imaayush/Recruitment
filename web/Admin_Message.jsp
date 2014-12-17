<%-- 
    Document   : Admin_Message
    Created on : Dec 3, 2014, 8:22:14 PM
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

    <div class="row" >
        <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
            <div class="listing listing-default">
                <div class="shape">
                    <div class="shape-text">In-box</div>
                </div>
                <div class="listing-content" style="height: 85%;">
                    <div class="form-group" style="overflow: auto ;max-height:85%;">
                        <%@include file="Selecte_messageAll.jsp" %>
                
                <%while (rs.next()) {%>
                <div class="form-group">
                   
                    <hr class ="hr">
                    <label class="col-sm-2 control-label"><%=rs.getString("SEND_NAME")%></label><span class="glyphicon glyphicon-globe" style="margin-left:60%;"><%=rs.getString("DATE_MAIL")%></span>
                    
                          
                </div>
                <div class="form-group">
                    
                     <label class="col-sm-2 control-label">Subject</label><%=rs.getString("SUBJECT")%><br>
                        
                </div>
                <div class="form-group">
                    &nbsp;&nbsp;&nbsp; <%=rs.getString("BODY")%>  
                </div>
                <%}

                            } else {

                            }%>
                       
                    </div>

                    <%@ include file="Admin_mail.jsp" %>


                </div>
              
                <div class="modal-footer">
                    <div class="col-sm-12">
                        
                        <button  data-toggle="modal"  data-target="#sendMail"  class="btn btn-primary"  >Send Mail</button>


                    </div>
                </div>

            </div>

        </div>
    </div>



</div>
 
</body>
</html>
