<%-- 
    Document   : Take_quiz
    Created on : Dec 5, 2014, 5:04:35 PM
    Author     : Knight
--%>


<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ page import="bean.GetInfo.*" %>  
<%@ page import="bean.ConnectionProvider.*" %>
<script src="js/ns.js" type="text/javascript"></script>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%session.setAttribute("token", 2);%>
<link href="css/card.css" rel="stylesheet" type="text/css"/>
<%@ include file="header.jsp" %>

<div style="width:75% ;float:left;height:95%;margin-left:22%; margin-top: -2% ">
    <div class="right" style="width:18%; float:right; margin-top:5%; margin-right:-5%; height:5%;  ">
        <div id="done-editing-sticky-wrapper" class="sticky-wrapper" style="position:fixed;">
            <div class="yellow-bg less-margin-2" id="done-editing" style="background-color: #fffcdf;">
                <div class="regular dark" >
                    <div class="right" style="width:18%; float:right; margin-top:5%; margin-right:0%; height:5%;  ">
                        <div id="done-editing-sticky-wrapper" class="sticky-wrapper" style="position:fixed;">
                            <div class="yellow-bg less-margin-2" id="done-editing" style="background-color: #fffcdf;">
                                <div class="regular dark" style="color:black; z-index: 1000">
                                    Remaining Time
                                    <br>
                                    <div id="timer" ></div>
                                </div>
                                
                            </div>
                        </div> <!-- end yellow-bg -->
                    </div><br></br>
                </div>

            </div>
        </div> <!-- end yellow-bg -->
    </div>
    <form role="form"  action="Process_Quiz.jsp" method="post" id="Take_Quiz"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" >

                    <div class="listing-content">
                        <%@include file="Select_Quiz.jsp" %>
                        <div class="col-sm-12">
                            <div class="form-group">
                                <span class="col-lg-10" style="margin-top: 5%;"><%=i + 1%>&nbsp;&nbsp;<%=rs.getString("QUESTION")%></span>
                            </div>
                            <input type="radio" name=<%=i%> value=<%=rs.getString("OPTIONA")%> ><%=rs.getString("OPTIONA")%>
                            <br>
                            <input type="radio" name=<%=i%> value=<%=rs.getString("OPTIONB")%>><%=rs.getString("OPTIONB")%>
                            <br>
                            <input type="radio" name=<%=i%> value=<%=rs.getString("OPTIONC")%> ><%=rs.getString("OPTIONC")%>
                            <br>
                            <input type="radio" name=<%=i%> <%=rs.getString("OPTIOND")%>><%=rs.getString("OPTIOND")%>
                            <br>
                            <hr class="hr">
                            <%}
                                    }
                                    conn.close();
                                } else {
                                }
                            %>
                        </div>



                    </div>



                    <div class="modal-footer" style="float:bottom;">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value=<%=ID%> name="QuizId" >Submit</button>


                        </div>
                    </div>

                </div>

            </div>
        </div>


    </form>
</div> <% int duration1 = 60;%>
                            <script>
                                timer(<%=duration1%>);
                            </script>

</body>
</html>
