<div  class="col-sm-2" style="margin-left:-2%; ">
    <select name="birth_date" class="form-control">

        <% for (int i = 31; i > 0; i--) {%>
        <option value="<%=i%>"><%=i%></option>
        <%}%>
        <option value=<%=date%> selected="selected"><%=date%></option>
    </select>
</div>

<div  class="col-sm-2" style="margin-left:-2%; ">
    <select name="birth_month" class="form-control">
        <option value=<%=month%> selected="selected"><%=month%></option>
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
    <select name="birth_year" class="form-control">
        <option value=<%=year%>><%=year%></option>
        <% for (int i = 2014; i > 1950; i--) {%>
        <option   value="<%=i%>"><%=i%></option>
        <%}%>

    </select>

</div>