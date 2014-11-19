<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%session.setAttribute( "id","");%>
<%@ include file="header.jsp" %>
<div style="width:27%;float:left;height:100%">
    <h1>  </h1>
</div>

    
<%@ include file="login.jsp" %>
    

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
    <div class="modal-dialog" style="z-index:2000;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="myModalLabel">Register</h4>
            </div>
            <div class="modal-body">
                <%@ include file="Reg.html" %>
            </div>
        </div>
    </div>




</div>

<div style="width:27%;float:left;height:100%">

</div>
</body> 
</html>
