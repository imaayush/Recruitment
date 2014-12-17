<%-- 
    Document   : blog
    Created on : Nov 19, 2014, 11:52:04 PM
    Author     : Knight
--%>
<%if ((String) session.getAttribute("id") == null) {
        response.sendRedirect("index.jsp");

    }
%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ page import="bean.GetInfo.*" %>  
<%@ page import="bean.ConnectionProvider.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<link href="css/card.css" rel="stylesheet" type="text/css"/>
<%@ include file="header.jsp" %>
<%@include file="selecte_job.jsp" %>
<div style="width:75% ;float:left;margin-left:22%; margin-top: -2% ">
    <form role="form" action="job_reg.jsp" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" >

                    <div class="listing-content">
                        <br>
                        <% int count = 0;
                            String appl = (String) session.getAttribute("id");
                            String Jobi = rs.getString("id");
                            count = GetInfo.AddorNot(Jobi, appl);

                        %>


                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th colspan="2"><%=rs.getString("Name")%></th>


                                </tr>
                            </thead>
                            <tr>
                                <td colspan="2"><%=rs.getString("Details")%></td>


                            </tr>
                            <tr>
                                <td>Date Apply</td>
                                <td><%=rs.getString("Open")%>&nbsp; To &nbsp;<%=rs.getString("close")%></td>

                            </tr>
                            <tr>
                                <td>Position</td>
                                <td><%=rs.getString("OPEN_POSITIONS")%></td>

                            </tr>

                            <tr>
                                <td>No. of Rounds</td>
                                <td><%=rs.getString("Round")%></td>

                            </tr>
                        </table>
                        <div class="col-sm-12">
                            <%if (count == 1) {%>
                            <button type="Submit" class="btn btn-primary" value=<%=rs.getString("ID")%> name="Job" >Register for Job</button>
                            <%} else {%>
                            <button type="Submit" class="btn btn-primary" value=<%=rs.getString("ID")%> name="Job" >Remove</button>
                            <%}%>
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

    } else {

    }%>

</body>
</html>
