<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@ include file="header.jsp" %>
<div class="panel panel-default" style="width:75% ;float:left;height:80%">
  <!-- Default panel contents -->
  <div class="panel-heading">Project details</div>
  <div class="panel-body">
  <form role="form" action="Comp.jsp" method="post" >
    <table style="width:100%; height :75%;">
  <tr>
    <td><label for="name1">Project 1:</label></td>
    <td><input type="text" class="form-control" id="name1" placeholder="Project Details"></td> 
  </tr>
  <tr>
      <td><label for="name1">Project 2:</label></td>
      <td><input type="text" class="form-control" id="name2" placeholder="Project Details"></td> 
  </tr>
  <tr>
      <td><label for="name1">Project 3(Optional):</label></td>
      <td><input type="text" class="form-control" id="name3" placeholder="Project Details"></td> 
  </tr>
   <tr>
       <td><label for="name1">Project 4(Optional):</label></td>
       <td><input type="text" class="form-control" id="name4" placeholder="Project Details"></td> 
  </tr>
  <tr>
      <td><label for="name1">Project 5(Optional):</label></td>
      <td><input type="text" class="form-control" id="name5" placeholder="Project Details"></td> 
  </tr>
   <tr>
   </table>
   <div class="modal-footer">
        <button type="Submit" class="btn btn-default" value="Sumbmit" >Save</button>
        <button type="button" value ="Submit" class="btn btn-primary"onclick="window.location.href = 'Skill.jsp';">Next</button>
         

      </div>
    

</form>
  </div>

  <!-- Table -->
  
</div>
</body> 
</html>
