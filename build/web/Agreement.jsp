<%-- 
    Document   : Agreement
    Created on : Dec 5, 2014, 5:06:42 PM
    Author     : Knight
--%>
<%if ((String) session.getAttribute("id") == null) {
        response.sendRedirect("index.jsp");
        if (request.getParameter("Quiz") == null) {
            response.sendRedirect("index.jsp");
        }
    }
%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bean.GetInfo"%>
<%@ page import="bean.GetInfo.*" %>  
<%@ page import="bean.ConnectionProvider.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<% String[] Ids = new String[2];
    Ids = (request.getParameter("Quiz")).split(",");
    int temp = Integer.parseInt(Ids[2]);
    session.setAttribute("ApplicationId", temp);
%>

<link href="css/card.css" rel="stylesheet" type="text/css"/>
<%@ include file="header.jsp" %>

<div style="width:75% ;float:left;height:95%;margin-left:22%; margin-top: -2% ">
    <form role="form"  action="Take_quiz.jsp" method="post"  class="form-horizontal" >
        <div class="row" >
            <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                <div class="listing listing-default" style="height:92%">

                    <div class="listing-content">
                        <br>
                        <div class="col-sm-12">

                            Cg (short for C for Graphics) is a high-level shading language developed by Nvidia in close collaboration with Microsoft for programming vertex and pixel shaders. Cg is based on the C programming language and although they share the same syntax, some features of C were modified and new data types were added to make Cg more suitable for programming graphics processing units. This language is only suitable for GPU programming and is not a general programming language. The Cg compiler outputs DirectX or OpenGL shader programs. Since 2012, Cg is deprecated, with no additional development or support available.

                        </div>



                    </div>



                    <div class="modal-footer">
                        <div class="col-sm-12">
                            <button type="Submit" class="btn btn-primary" value=<%=request.getParameter("Quiz")%> name="QuizId" >Agree</button>


                        </div>
                    </div>

                </div>

            </div>
        </div>


    </form>
</div>

</body>
</html>
