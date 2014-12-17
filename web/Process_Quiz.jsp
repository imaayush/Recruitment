<%-- 
    Document   : Process_Quiz
    Created on : Dec 5, 2014, 10:04:15 PM
    Author     : Knight
--%>

<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="bean.GetInfo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String ID = request.getParameter("QuizId");
    int Number_Question = 0;
    String List_Question = "";
    String END_TIME = "";
    int MARK = 0;
    int Result=0;
    int cutoff=0;
    int each=0;
    if (session.getAttribute("id") != null) {
        String id2 = (String) session.getAttribute("id");
        Connection conn = ConnectionProvider.getCon();
        String query = "select * from QUIZ where Id=" + "'" + ID + "'";
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Number_Question = Integer.parseInt(rs.getString("NO_QUESTION"));
            List_Question = rs.getString("LIST_QUESTION");
            MARK = Integer.parseInt(rs.getString("MARK"));
            END_TIME = rs.getString("END_TIME");
            cutoff = Integer.parseInt(rs.getString("cutoff"));
        }
        conn.close();
        each=MARK/Number_Question;
        String[] Question = new String[Number_Question];
        String[] Ans= new String[Number_Question];
        Question = List_Question.split(",");
        for (int i = 0; i < Number_Question; i++) {
            conn = ConnectionProvider.getCon();
            query = "select * from QUESTION where Id=" + "'" + Question[i] + "'";
            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();
            while (rs.next()) {
             Ans[i]=rs.getString("ANS");
            }
            String temp =String.valueOf(i);
            
            String temp1=request.getParameter(temp).toString();
            String temp2 =Ans[i];
            
            if(temp1.equals(Ans[i])==true){
                Result++;
            }
            conn.close();
           if(Result*each>cutoff){
                conn = ConnectionProvider.getCon();
               String tempId = session.getAttribute("ApplicationId").toString();
                   query = "update LIST_APPLICATION set STATUS=?  where ID= ?";
                     ps = conn.prepareStatement(query);
                    
                    ps.setString(1, "Interview");
                    ps.setString(2, tempId);
                    ps.executeUpdate();
                    conn.close();
                     response.sendRedirect("home.jsp");
           }else
           {
                conn = ConnectionProvider.getCon();
               String tempId = session.getAttribute("ApplicationId").toString();
                   query = "update LIST_APPLICATION set STATUS=?  where ID= ?";
                     ps = conn.prepareStatement(query);
                    
                    ps.setString(1, "Disqualified");
                    ps.setString(2, tempId);
                    ps.executeUpdate();
                    conn.close();
                     response.sendRedirect("home.jsp");
           }
                
        }
    } else {
    }

%>