<%-- 
    Document   : side_admin
    Created on : Nov 27, 2014, 11:39:26 PM
    Author     : Knight
--%>
<script src="https://apis.google.com/js/platform.js" async defer></script>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<ul class="nav navbar-nav side-nav">

    <li> 
    </li>
    <li ><a href="Control_Panel.jsp"><i class="fa fa-bullseye"></i> Dashboard</a></li>

    <li><a href="Admin_Message.jsp"><i class="fa fa-envelope-o"></i> Message</a></li>                    


    <li><a href="Create_Job.jsp"><i class="fa fa-money "></i> Create Job </a></li>
    <li><a href="#"><i class="fa fa-code"></i>Create Challenge</a></li>
    <li><a href="Create_Quiz.jsp"><i class="fa fa-chain-broken"></i > Create Quiz</a></li> 
    <li ><a href="Create_Q.jsp"><i class="fa fa-question"></i> Create Question</a></li>
    <li ><a href="list_job.jsp"><i class="fa fa-won"></i> List of Job</a></li>
    <li ><a href="#">Interview &nbsp;&nbsp;&nbsp; <div id="placeholder-div2" style="background-color:black; "></div>
            <script>
                gapi.hangout.render('placeholder-div2', {
                    'render': 'createhangout',
                    'initial_apps': [{'app_id': '184219133185', 'start_data': 'dQw4w9WgXcQ', 'app_type': 'ROOM_APP'}],
                    'widget_size': 72
                });
            </script></a></li>
    <li ><a href="#"><i class="fa fa-list"></i> List of selected Candidate</a></li>
</ul>
