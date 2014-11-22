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

<%@ include file="header.jsp" %>
<%
    Name = "";
    String Email = "";
    String Mobile = "";
    String Age = "";
    String Add = "";
    String Father = "";
    String InX = "";
    String X = "";
    String InXII = "";
    String XII = "";
    String InGrad = "";
    String Grad = "";
    String InPG = "";
    String PG = "";
    String Frameworks = "";
    String Tools = "";
    String Languages = "";
    id = (String) session.getAttribute("id");
    ResultSet rs = GetInfo.get(id);

    while (rs.next()) {
        Name = rs.getString("NAME");
        Email = rs.getString("EMAIL");
        Mobile = rs.getString("Mobile");
        Age = rs.getString("Age");
        Add = rs.getString("Address");
        Father = rs.getString("Father");

        InX = rs.getString("InX");
        X = rs.getString("X");
        InXII = rs.getString("InXII");
        XII = rs.getString("XII");
        InGrad = rs.getString("InGrad");
        Grad = rs.getString("Grad");
        InPG = rs.getString("InPG");
        PG = rs.getString("PG");
        Languages = rs.getString("Languages");
        Tools = rs.getString("Tools");
        Frameworks = rs.getString("Frameworks");
    }


%>

<div style="width:73% ;float:right;height:100% ; margin-left:2%;">
    
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
                                <div  class="col-sm-2" style="margin-left:-2%; ">
                                    <select name="date" class="form-control">
                                        
                                        <% for (int i = 31; i >0; i--) {%>
                                        <option value="<%=i%>"><%=i%></option>
                                        <%}%>
                                        <option value="" selected="selected">---------</option>
                                    </select>
                                </div>
                                <%@ include file="calender.jsp" %>

                                

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
                                <%@ include file="calender.jsp" %>
                                <div class="col-sm-1" style="margin-left:-2%; ">__</div>
                                <%@ include file="calender1.jsp" %>
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
                                <%@ include file="calender.jsp" %>
                                <div class="col-sm-1" style="margin-left:-2%; ">__</div>
                                <%@ include file="calender1.jsp" %>

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


                </div>

            </div>
        </div> 
    
  

        <div class="row">
            <div class="col-xs-10 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default">
                    <div class="shape">
                        <div class="shape-text">Photo and Signature </div>
                    </div>
                    <div class="listing-content">
                        <br>



                        <div class="form-group">
                            <span class="large darker">Photo</span>
                            <hr class="hr">
                            <div class="col-sm-8">
                                <input type="text" class=" form-control" id="inputEmail3" name="Name" value=<%=Name%> >

                            </div>
                            <div class="col-lg-2 col-md-4 col-xs-6 thumb">


                                <img class="img-thumbnail" src="http://placehold.it/400x300" alt="">

                            </div>
                        </div>
                        <div class="form-group">
                            <span class="large darker"> Signature  </span>
                            <hr class="hr">
                            <div class="col-sm-8">
                                <input type="email" class="form-control" id="inputPassword3" name="Email" value=<%=Email%> >


                            </div>
                            <div class="col-lg-2 col-md-4 col-xs-6 thumb">
                                <img src="http://placehold.it/400x300"  class="img-thumbnail">
                            </div>
                        </div>
                        <div class="modal-footer">
                            <div class="col-sm-12">
                                <button type="Submit" class="btn btn-primary" value="upload" name="photo"  >Save</button>


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
                        <div class="shape-text">Resume </div>
                    </div>
                    <div class="listing-content">

                        <br>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Resume </label>
                            <div class="col-sm-8">
                                <input type="file" >
                            </div>
                        </div>




                    </div>
                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value="upload" name="resume" >Save</button>
                            <button type="Submit" class="btn btn-primary" value="Submit" name="Submit">Submit</button>

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
