<%-- 
    Document   : Name
    Created on : Nov 19, 2014, 5:39:53 PM
    Author     : Knight
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="demo">
    <ul  class="nav navbar-nav navbar-right navbar-user">
        <li  class="dropdown messages-dropdown" >
            <%@include file="selecte_message.jsp" %>
            <a  href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: #ffffff"><i class="fa fa-envelope"></i> Messages <span class="badge"><%=count%></span> <b class="caret"></b></a>
            <ul class="dropdown-menu">
                
                <li class="dropdown-header"><%=count%> New Messages</li>
                <%while (rs.next()) {%>
                <li class="message-preview">
                    <a href="Mail_box.jsp">
                        <span class="avatar"><i class="fa fa-bell"></i></span>
                        <span class="message"><%=rs.getString("SUBJECT")%></span>
                    </a>
                </li>
                <li class="divider"></li>
                <%}

                            } else {

                            }%>
                
                <li><a href="Mail_box.jsp">Go to Inbox <span class="badge"><%=count%></span></a></li>
            </ul>
        </li>
        <li class="dropdown user-dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: #ffffff"><i class="fa fa-user"></i><%=Name%><b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href="Profile.jsp"><i class="fa fa-user"></i> Profile</a></li>
                <li><a href="Settings.jsp"><i class="fa fa-gear"></i> Settings</a></li>
                <li class="divider"></li>
                <li><a href="logout.jsp"><i class="fa fa-power-off"></i> Log Out</a></li>
            </ul>
        </li>
    </ul>
</div>