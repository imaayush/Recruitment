<%-- 
    Document   : Admin_mail
    Created on : Dec 3, 2014, 8:42:08 PM
    Author     : Knight
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form class="form col-md-12 center-block" action="Personal" method="Post">
    <div class="modal fade" id="sendMail" tabindex="-1" role ="dialog" aria-labelledby="mymaillabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">Send Mail</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group" style=" visibility: hidden;">
                      
                        <input type="text" class="form-control" name="Name_sender" value=<%=Name%> >
                        <input type="text" class="form-control" name="Email_sender" value=<%=Email%> >
                    </div>
                    <div class="form-group">
                        <label for="Name">To</label>
                        <input type="email" class="form-control" name="Email_reciver" placeholder="Enter Email" required>
                    </div>
                    <div class="form-group">
                        <label for="Name">Subject</label>
                        <input type="Text" class="form-control" name="subject" placeholder="Enter Subject" required>
                    </div>
                    <div class="form-group">
                        <label for="Name">Body</label>
                        <textarea class="form-control" rows="4" name="body"></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="Submit" class="btn btn-primary" name="AdminMail" value="send">Send</button>
                </div>

            </div>
        </div>

    </div>
</form>