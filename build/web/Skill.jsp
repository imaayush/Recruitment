<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@ include file="header.jsp" %>
<div class="panel panel-default" style="width:75% ;float:left;height:80%">
  <!-- Default panel contents -->
  <div class="panel-heading">Computer Skills details</div>
  <div class="panel-body">
  <form role="form" action="exp.jsp" method="post" >
    <table style="width:100%; height :75%;">
  <tr>
    <td><label for="name1">Computer Skills :</label></td>
    <td><input type="text" class="form-control" id="name1" placeholder="Project Details"></td> 
  </tr>
  <tr>
      <td></td>
      <td>
		  <label for="name1">Your's Computer Skills</label>
		 <textarea class="form-control" rows="4"></textarea>
	 </td> 
  </tr>
 
   </table>
   <div class="modal-footer">
        <button  type="Submit" value ="Submit" class="btn btn-default" >Save</button>
        <button type="button" class="btn btn-primary"onclick="window.location.href = 'Experience.jsp';">Next</button>
         

      </div>
    

</form>
  </div>

  <!-- Table -->
  
</div>
</body> 
</html>
