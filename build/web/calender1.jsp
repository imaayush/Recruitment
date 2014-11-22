<div  class="col-sm-2" style="margin-left:-2%; ">
    <select name="month1" class="form-control">
        <option value="" selected="selected">---------</option>
        <option value="1">Jan</option>
        <option value="2">Feb</option>
        <option value="3">Mar</option>
        <option value="4">Apr</option>
        <option value="5">May</option>
        <option value="6">Jun</option>
        <option value="7">Jul</option>
        <option value="8">Aug</option>
        <option value="9">Sep</option>
        <option value="10">Oct</option>
        <option value="11">Nov</option>
        <option value="12">Dec</option>
    </select> 
</div>
<div  class="col-sm-2" style="margin-left:-2%; ">
    <select name="year1" class="form-control">
        <option value="">---------</option>
        <% for (int i = 2014; i > 1950; i--) {%>
        <option   value="<%=i%>"><%=i%></option>
        <%}%>
        
    </select>

</div>