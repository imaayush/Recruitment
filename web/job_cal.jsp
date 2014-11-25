<div  class="col-sm-2" style="margin-left:-2%; ">
    <select name="job_month_start" class="form-control">
        <option value="" selected="selected">---------</option>
        <option value="Jan">Jan</option>
        <option value="Feb">Feb</option>
        <option value="Mar">Mar</option>
        <option value="Apr">Apr</option>
        <option value="May">May</option>
        <option value="Jun">Jun</option>
        <option value="Jul">Jul</option>
        <option value="Aug">Aug</option>
        <option value="Sep">Sep</option>
        <option value="Oct">Oct</option>
        <option value="Nov">Nov</option>
        <option value="Dec">Dec</option>
    </select> 
</div>
<div  class="col-sm-2" style="margin-left:-2%; ">
    <select name="job_year_start" class="form-control">
        <option value="">---------</option>
        <% for (int i = 2014; i > 1950; i--) {%>
        <option   value="<%=i%>"><%=i%></option>
        <%}%>

    </select>

</div>
<div class="col-sm-1" style="margin-left:-2%; ">__</div>
<div  class="col-sm-2" style="margin-left:-2%; ">
    <select name="job_month_end" class="form-control">
        <option value="" selected="selected">---------</option>
       <option value="Jan">Jan</option>
        <option value="Feb">Feb</option>
        <option value="Mar">Mar</option>
        <option value="Apr">Apr</option>
        <option value="May">May</option>
        <option value="Jun">Jun</option>
        <option value="Jul">Jul</option>
        <option value="Aug">Aug</option>
        <option value="Sep">Sep</option>
        <option value="Oct">Oct</option>
        <option value="Nov">Nov</option>
        <option value="Dec">Dec</option>
    </select> 
</div>
<div  class="col-sm-2" style="margin-left:-2%; ">
    <select name="job_year_end" class="form-control">
        <option value="">---------</option>
        <% for (int i = 2014; i > 1950; i--) {%>
        <option   value="<%=i%>"><%=i%></option>
        <%}%>

    </select>

</div>