<%-- 
    Document   : welcome
    Created on : Nov 6, 2014, 2:39:06 PM
    Author     : Knight
--%>

<%@page import="java.sql.*"%>
<%@page import="bean.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="bean.ConnectionProvider.*" %>   

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><head>
            <meta charset="utf-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
       
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" type="text/css" href="css/home_style.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="js/jquery-2.1.1.min.js "></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Home</title> 
   
       
    </head>
    <body>

      <div class="block">               
                                <div class="block-content">
                                    <h2><strong>Validation</strong> Engine</h2>
                                    <p>jQuery validation engine is a Javascript plugin aimed at the validation of form fields in the browser (IE 6-8, Chrome, Firefox, Safari, Opera 10). The plugin provides visually appealing prompts that grab user attention on the subject matter.</p>
                                    
                                    <div class="form-group">
                                        <label>Login:</label>                                        
                                        <input type="text" class="validate[required,maxSize[8]] form-control">
                                        <div class="help-block">Required, max size = 8</div>
                                    </div>
                                    <div class="form-group">
                                        <label>Password:</label>                                        
                                        <input type="password" class="validate[required,minSize[5],maxSize[10]] form-control" id="password">
                                        <div class="help-block">Required, min size = 5, max size = 10</div>
                                    </div>                    
                                    <div class="form-group">
                                        <label>Confirm Password:</label>                                       
                                        <input type="password" class="validate[required,equals[password]] form-control">
                                        <div class="help-block">Required, equals Password</div>
                                    </div>                            
                                    <div class="form-group">                                        
                                        <label>Age:</label>                                        
                                        <input type="text" class="validate[required,custom[integer],min[18],max[120]] form-control">
                                        <div class="help-block">Required, integer, min value = 18, max = 120</div>
                                    </div>
                                    <div class="form-group">
                                        <label>Gender:</label>                                        
                                        <div class="radio radio-inline">
                                            <label>
                                                <input type="radio" class="validate[required]" name="gender" value="1"> Male
                                            </label>
                                        </div>                                    
                                        <div class="radio radio-inline">
                                            <label>
                                                <input type="radio" class="validate[required]" name="gender" value="0"> Famale
                                            </label>
                                        </div>      
                                        <div class="help-block">One of those elements should be choosen</div>
                                    </div>
                                    <div class="form-group">                                        
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" value="" name="rules" class="validate[required]"> Please send me news
                                            </label>
                                        </div>                                
                                        <div class="help-block">Should be checked</div>
                                    </div>                                    
                                    <div class="form-group">
                                        <label>Date of birth:</label>                                        
                                        <input type="text" class="validate[required,custom[date]] form-control datepicker hasDatepicker" id="dp1416317014640">
                                        <div class="help-block">Required, date YYYY-MM-DD</div>                                        
                                    </div>
                                    <div class="form-group">
                                        <label>Credit card:</label>                                        
                                        <input type="text" class="validate[required,creditCard] form-control">
                                        <div class="help-block">Required, credit card number</div>
                                    </div>             
                                    <div class="form-group">
                                        <label>Site:</label>                                        
                                        <input type="text" value="http://" class="validate[required,custom[url]] form-control">
                                        <div class="help-block">Required, url</div>
                                    </div>                                                                  

                                </div>
                                <div class="block-footer">
                                    <div class="pull-left">
                                        <button class="btn btn-default" type="button" onclick="$('#validate').validationEngine('hide');">Hide prompts</button>
                                    </div>
                                    <div class="pull-right">                                                                                    
                                        <button class="btn btn-success" type="submit">Submit</button>                                        
                                    </div>
                                </div>                                    
                            </div>
</html>
