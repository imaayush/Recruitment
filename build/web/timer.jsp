<%-- 
    Document   : timer
    Created on : Dec 6, 2014, 1:48:37 AM
    Author     : Knight
--%>


<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%@page import="bean.ConnectionProvider"%>
<%@page import="bean.GetInfo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    String ID= request.getParameter("QuizId");
    int Number_Question=0;
    String List_Question="";
     String END_TIME="";
     String MARK="";
    if (session.getAttribute("id") != null) {
        String id2 = (String) session.getAttribute("id");
        Connection conn = ConnectionProvider.getCon();
        String query = "select * from QUIZ where Id="+"'"+ID+"'";
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
          Number_Question= Integer.parseInt(rs.getString("NO_QUESTION"));
          List_Question =rs.getString("LIST_QUESTION");
          MARK=rs.getString("MARK");
          END_TIME=rs.getString("END_TIME");
        }
        conn.close();
        String [] Question =new String[Number_Question];
        Question = List_Question.split(",");
        for(int i=0 ;i< Number_Question ;i++){
        conn = ConnectionProvider.getCon();
        query = "select * from QUESTION where Id="+"'"+Question[i]+"'";
        ps = conn.prepareStatement(query);

        rs = ps.executeQuery();
        while(rs.next()){

%>