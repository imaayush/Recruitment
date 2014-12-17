<%-- 
    Document   : From
    Created on : Nov 19, 2014, 5:42:21 PM
    Author     : Knight
--%>
<%if ((String) session.getAttribute("id") == null) {
        
        response.sendRedirect("index.jsp");
    } else {
     
    }
%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ page import="bean.GetInfo.*" %>  
<%@ page import="bean.ConnectionProvider.*" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="css/bootstrap-tagsinput.css" rel="stylesheet" type="text/css"/>
<script src="js/bootstrap-tagsinput.js" type="text/javascript"></script>
<link href="css/card.css" rel="stylesheet" type="text/css"/>

<%@ include file="header.jsp" %>

<div style="width:75% ;float:left;height:100% ; margin-left:22%; margin-top: -2%;">

    <form role="form" action="From.jsp" method="post"  class="form-horizontal" >

        <div class="row"  >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" >

                    <div class="listing-content">
                        <br>

                        <div class="col-lg-3 col-md-4 col-xs-6 thumb"><br>

                            <img class="img-thumbnail" src=<%=Photo%> alt=<%=Name.toUpperCase()%> style="height:32%;"/>

                            <br>
                            <h5></h5>
                        </div>
                        <div class="col-lg-4 col-md-4 col-xs-4 thumb"><br>

                            <div class="shape" style="background-color:white;">
                                <div class="shape-text" style="padding-left:15%;color:black; " ><h3><%=Name.toUpperCase()%></h3></div>
                            </div>



                            <div class="shape" style="background-color:white;">
                                <div class="shape-text" style="padding-left:15%;color:black; " ><a href=<%=Resume%>>Resume</a></div>
                            </div>
                        </div>
                        <div class="col-sm-4">

                            <button type="Submit" class="btn btn-primary" style="float: right;">Edit Profile</button>


                        </div>

                    </div>




                </div>

            </div>
        </div>


        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Education</div>
                    </div>
                    <div class="listing-content">
                        <br>

                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Class</th>
                                    <th>Institution</th>
                                    <th>CGPA/Percentage</th>
                                </tr>
                            </thead>
                            <tr>
                                <td>X</td>
                                <td><%=InX%></td>
                                <td><%=X%></td>
                            </tr>
                            <tr>
                                <td>XII</td>
                                <td><%=InXII%></td>
                                <td><%=XII%></td>
                            </tr>
                            <tr>
                                <td>Graduation</td>
                                <td><%=InGrad%></td>
                                <td><%=Grad%></td>
                            </tr>

                            <tr>
                                <td>Post Grad.</td>
                                <td><%=InPG%></td>
                                <td><%=PG%></td>
                            </tr>
                        </table>



                    </div>



                </div>

            </div>
        </div>


        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Skills</div>
                    </div>
                    <div class="listing-content">
                        <br>



                        <div class="form-group">
                            <span class="large darker">Frameworks</span>
                            <hr class="hr">
                            <div class="col-sm-10">
                                <%=Frameworks%>

                                <br>

                                <br>
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="large darker">Tools & Libraries </span>
                            <hr class="hr">
                            <div class="col-sm-10">
                                <%=Tools%> 
                                <br>

                                <br>
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="large darker">Languages</span>
                            <hr class="hr">

                            <div class="col-sm-10" >


                                <%=Languages%> 



                            </div>
                        </div>



                    </div>




                </div>

            </div>
        </div>    


        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Projects</div>
                    </div>
                    <div class="listing-content">
                        <br>
                        <%@ include file="Select_Project.jsp" %>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Name</label>
                            <div class="col-sm-8">
                                <%=rs.getString("NAME")%>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label"> Duration</label>
                            <div class="col-sm-10">
                                <%=rs.getString("STARTDATE")%>&nbsp;to&nbsp;<%=rs.getString("ENDDATE")%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Description</label>
                            <div class="col-sm-8">
                                <%=rs.getString("DESCRIPTION")%>
                            </div>
                        </div>
                        <hr class="hr">
                        <%}

                            } else {

                            }%>
                    </div>




                </div>

            </div>
        </div>  


        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Experience</div>
                    </div>
                    <div class="listing-content">
                        <br>
                        <%@ include file="EXPERIENCE.jsp" %>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Company </label>
                            <div class="col-sm-8">
                                <%=rs.getString("COMPANY")%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Job Title</label>
                            <div class="col-sm-8">
                                <%=rs.getString("job")%>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label"> Duration</label>
                            <div class="col-sm-10">
                                <%=rs.getString("STARTDATE")%>&nbsp;to&nbsp;<%=rs.getString("ENDDATE")%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Description</label>
                            <div class="col-sm-8">
                                <%=rs.getString("DESCRIPTION")%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Related SKILL</label>
                            <div class="col-sm-8">
                                <%=rs.getString("RSKILL")%>
                            </div>
                        </div>
                        <hr class="hr">
                        <%}

                        }
                        else {

                            }%>
                    </div>




                </div>

            </div>
        </div> 






    </form>  

</div>
<!-- Table -->



</body> 
</html>
