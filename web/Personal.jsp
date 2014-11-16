<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@ page import="bean.ConnectionProvider.*" %>   
<%@ include file="from_heder.html" %>
<div style="width:25% ;float:left;height:100% ;background-color:#F5F5F5;">
	<ul class="list-group">
	  <li class="list-group-item">
	    <span class="glyphicon glyphicon-ok"></span>
	    <a href="Ps.jsp">Personal Details</a>
	  </li>
	  <li class="list-group-item">
	  <span class="glyphicon glyphicon-ok"></span>
	    <a href="Ac.jsp">Academic Details</a>
	  </li>
	  <li class="list-group-item">
	    <span class="glyphicon glyphicon-ok"></span>
		 <a href="p&t.jsp">Training</a>
	  </li>
	  <li class="list-group-item">
	   <span class="glyphicon glyphicon-ok"></span>
	    <a href="Pro.jsp">Projects</a>    
	  </li>
	  <li class="list-group-item">
	    <span class="glyphicon glyphicon-ok"></span>
		 <a href="Comp.jsp">Computer Skills</a>
	  </li>
	  <li class="list-group-item">
	    <span class="glyphicon glyphicon-ok"></span>
		 <a href="exp.jsp">Experience</a>   
	  </li>
	  <li class="list-group-item">
		   <a href="ph.jsp">Photo and Signature upload</a>
	    <span class="glyphicon glyphicon-remove"></span>
    
	  </li>
	</ul>

</div>
<div class="panel panel-default" style="width:75% ;float:left;height:100%">
  <!-- Default panel contents -->
  <div class="panel-heading">Personal details</div>
  <div class="panel-body">
  <form role="form" action="Update" method="post" >
    <table style="width:100%; height:100%; ">
  <tr>
    <td><label for="name1">Name</label></td>
    <td>Smith</td> 
    </tr> 
  <tr> 
  <tr>
      <td><h1></h1></td>
    <td><h1></h1></td> 
  </tr> 
  <tr> 
  <td><label for="name2">Father's Name</label></td>
  <td><input type="text" class="form-control" id="name2" placeholder="Father's Name" name="Father"></td> 
  </tr>
  <tr>
      <td><h1></h1></td>
    <td><h1></h1></td> 
  </tr> 
  <tr>
  <td><label for="age">Age</label></td>
  <td><input type="text" class="form-control" id="age" placeholder="Age" name="Age"></td> 
  </tr>
  <tr>
      <td><h1></h1></td>
    <td><h1></h1></td> 
  </tr> 
   <tr>
  <td><label for="mobile">Mobile</label></td>
  <td>9697679677</td> 
  </tr>
  <tr>
      <td><h1></h1></td>
    <td><h1></h1></td> 
  </tr> 
  <tr>
  <td><label for="name2">Email</label></td>
  <td>ctiwari941@gmail.com</td> 
  </tr>
  <tr>
      <td><h1></h1></td>
    <td><h1></h1></td> 
  </tr> 
   <tr>
  <td><label for="name2">Address</label></td>
  <td><input type="text" class="form-control" id="Address" placeholder="Enter Address" name="Add1"></td> 
  </tr>
  <tr>
      <td><h1></h1></td>
    <td><h1></h1></td> 
  </tr> 
   <tr>
  <td></td>
  <td><input type="text" class="form-control" id="Address" name="Add2" ></td> 
  </tr>
   <tr>
   </table>
   <div class="modal-footer">
        <button type="Submit" class="btn btn-default" value ="Submit" >Save</button>
        
         

      </div>
    

</form>
  </div>

  <!-- Table -->
  
</div>

</body> 
</html>
