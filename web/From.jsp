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
<% session.setAttribute("token", 1);%>
<%@ include file="header.jsp" %>

<div style="width:73% ;float:left;height:100% ; margin-left:27%; margin-top: -2%;">

    <div class="right" style="width:10%; float:right; margin-top:5%; margin-right:5%;  ">
        <div id="done-editing-sticky-wrapper" class="sticky-wrapper" style="position:fixed;">
            <div class="yellow-bg less-margin-2" id="done-editing">
                <div class="regular dark">
                    Don't forget to save your changes.
                </div>
                <a href="Profile.jsp" class="button btn-blue inline-block less-margin-2">Done Editing</a>
            </div>
        </div> <!-- end yellow-bg -->
    </div>
    <form role="form" action="Personal" method="post"  class="form-horizontal" >
        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">General</div>
                    </div>
                    <div class="listing-content">
                        <br>



                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Name</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="Name" value=<%=Name%> readonly>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Email</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="inputPassword3" name="Email" value=<%=Email%> readonly>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Mobile</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="inputPassword3" name="Mobile" value=<%=Mobile%> readonly>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Father Name</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"  name="Father" value=<%out.print(Father);%>>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Date of Birth</label>
                            <div class="col-sm-10">

                                <%@ include file="Date_Birth.jsp" %>



                            </div>
                        </div>       
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Address</label>
                            <div class="col-sm-6">
                                <textarea class="form-control" rows="3" name="Add"><%=Add%></textarea>
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


        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Education</div>
                    </div>
                    <div class="listing-content">
                        <br>


                        <div class="form-group">
                            <span  class="large darker" style="padding-left:27%; ">Name of Institution</span>  <span class="large darker" style="padding-left:26%;">Percentage</span>
                            <hr class="hr">
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">X</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="InX" value=<%=InX%> >
                            </div>
                            <div class="col-sm-2">
                                <input type="text" class=" form-control" id="inputEmail3" name="X" value=<%=X%> >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">XII</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="InXII" value=<%=InXII%> >
                            </div>
                            <div class="col-sm-2">
                                <input type="text" class=" form-control" id="inputEmail3" name="XII" value=<%=XII%> >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Graduation</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="InGrad" value=<%=InGrad%> >
                            </div>
                            <div class="col-sm-2">
                                <input type="text" class=" form-control" id="inputEmail3" name="Grad" value=<%=Grad%> >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Post Graduation</label>
                            <div class="col-sm-6">
                                <input type="text" class=" form-control" id="inputEmail3" name="InPG" value=<%=InPG%> >
                            </div>
                            <div class="col-sm-2">
                                <input type="text" class=" form-control" id="inputEmail3" name="PG" value=<%=PG%> >
                            </div>
                        </div>

                    </div>

                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Save"  name ="education">Save</button>


                        </div>
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
                                <input type="text"   value=<%=Frameworks%> data-role="tagsinput" name="frameworks" />

                                <br>

                                <br>
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="large darker">Tools & Libraries </span>
                            <hr class="hr">
                            <div class="col-sm-10">
                                <input type="text"   value=<%=Tools%> data-role="tagsinput" name="tools1" />
                                <br>

                                <br>
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="large darker">Languages</span>
                            <hr class="hr">

                            <div class="col-sm-10" >


                                <input type="text"   value=<%=Languages%> data-role="tagsinput" name="languages" />



                            </div>
                        </div>

                        <div class="modal-footer">
                            <div class="col-sm-12">
                                <button type="Submit" class="btn btn-primary" value="Save"  name="skill">Save</button>


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

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Name</label>
                            <div class="col-sm-8">
                                <input type="text" class=" form-control"  name="ProjectName"  >
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label"> Duration</label>
                            <div class="col-sm-10">
                                <%@ include file="Project_cal.jsp" %>

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Description</label>
                            <div class="col-sm-8">
                                <textarea class="form-control" rows="3" name="ProDescription"></textarea>
                            </div>
                        </div>

                    </div>

                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="save1" name="project" >Save</button>


                        </div>
                    </div>
                    <div class="listing-content" style="background-color:#ffcccc; ">
                        <br>
                        <%@ include file="Select_Project.jsp" %>
                        <div >
                            <button type="Submit" class="close" name="Delete_Pro" value=<%=rs.getString("ID")%>><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>

                        </div>

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




                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Company * </label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="Cname" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Job Title * </label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control"  name="job"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Duration </label>
                            <div class="col-sm-10">
                                <%@ include file="job_cal.jsp" %>


                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Description </label>
                            <div class="col-sm-8">
                                <textarea class="form-control" rows="3" name="JDes"></textarea>

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Related Skills </label>
                            <div class="col-sm-8">
                                <input type="text"   data-role="tagsinput" name="Rskill" />
                            </div>
                        </div>

                    </div>

                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="save2"  name="experience">Save</button>


                        </div>
                    </div>

                    <div class="listing-content" style="background-color: yellow;">
                        <br>




                        <%@ include file="EXPERIENCE.jsp" %>
                        <div >
                            <button type="Submit" class="close" name="Delete_Exp" value=<%=rs.getString("ID")%> ><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>

                        </div>
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
                            <label for="inputPassword3" class="col-sm-2 control-label">Related Skills</label>
                            <div class="col-sm-8">
                                <span class="col-sm-4"> <%=rs.getString("RSKILL")%></span>
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

    </form>

    <form action="photo.jsp" method="post"     enctype="multipart/form-data">
        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Photo </div>
                    </div>
                    <div class="listing-content">

                        <br>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">photo</label>
                            <div class="col-sm-8">
                                <input type="file" name="file" ><br><br><br>

                            </div>
                            <div class="col-lg-2 col-md-4 col-xs-6 thumb">
                                <img class="img-thumbnail" src=<%=Photo%> alt="http://placehold.it/400x300">
                            </div>


                        </div>


                    </div>



                    <div class="modal-footer" style="margin-top:10%;">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Save"  name="skill">Save</button>


                        </div>
                    </div>

                </div>
            </div>       


        </div>

    </form>   
    <form action="resume.jsp" method="post"     enctype="multipart/form-data">
        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Resume </div>
                    </div>
                    <div class="listing-content">

                        <br>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Resume </label>
                            <div class="col-sm-8">
                                <input type="file" name="file" >
                            </div>
                        </div>




                    </div>
                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="Upload File" name="resume" >Save</button>


                        </div>
                    </div>


                </div>
            </div>       


        </div>

        </from>

</div>
<!-- Table -->



</body> 
</html>
