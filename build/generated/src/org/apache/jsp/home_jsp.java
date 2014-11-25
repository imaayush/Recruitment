package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.sql.ResultSet;
import bean.GetInfo;
import bean.GetInfo.*;
import bean.ConnectionProvider.*;
import bean.GetInfo;
import java.sql.ResultSet;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/side_nav.html");
    _jspx_dependants.add("/Name.jsp");
    _jspx_dependants.add("/side_bar1.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home_style.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"font-awesome/css/font-awesome.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/local.css\" />\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js \"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        ");
 String id = (String) session.getAttribute("id");
            String Status = "";
            String Name = "";
            int token = 0;
            if ("".equals(id) == false) {
                ResultSet rs = GetInfo.get(id);
                while (rs.next()) {
                    Name = rs.getString("NAME");
                    Status = rs.getString("Status");
                }
                if (Status.equals("D")) {
                    token = 1;
                }
                if (Status.equals("A")) {
                    token = 2;
                }

            }else{


        
      out.write("\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <title>Home</title> \n");
      out.write("    </head> \n");
      out.write("    <body> \n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">            \n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Admin Panel</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\" >\n");
      out.write("                ");
                    
            
                        if (token== 2) {
                      
               
      out.write("\n");
      out.write("               ");
      out.write("\n");
      out.write("<ul class=\"nav navbar-nav side-nav\">\n");
      out.write("    <li class=\"active\"><a href=\"index.html\"><i class=\"fa fa-bullseye\"></i> Dashboard</a></li>\n");
      out.write("    <li><a href=\"portfolio.html\"><i class=\"fa fa-tasks\"></i> Portfolio</a></li>                    \n");
      out.write("    <li><a href=\"blog.html\"><i class=\"fa fa-globe\"></i> Blog</a></li>\n");
      out.write("    <li><a href=\"forms.html\"><i class=\"fa fa-list-ol\"></i> Forms</a></li>\n");
      out.write("    <li><a href=\"typography.html\"><i class=\"fa fa-font\"></i> Typography</a></li>\n");
      out.write("    <li><a href=\"bootstrap-elements.html\"><i class=\"fa fa-list-ul\"></i> Bootstrap Elements</a></li>\n");
      out.write("    <li><a href=\"bootstrap-grid.html\"><i class=\"fa fa-table\"></i > Bootstrap Grid</a></li>                    \n");
      out.write("</ul>");
      out.write("\n");
      out.write("               ");
 }
      out.write("\n");
      out.write("               \n");
      out.write("                 ");
                    
            
                        if (token== 2 ||token==1) {
                      
               
      out.write("\n");
      out.write("               ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"demo\">\n");
      out.write("    <ul  class=\"nav navbar-nav navbar-right navbar-user\">\n");
      out.write("        <li  class=\"dropdown messages-dropdown\" >\n");
      out.write("            <a  href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"style=\"color: #ffffff\"><i class=\"fa fa-envelope\"></i> Messages <span class=\"badge\">2</span> <b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li class=\"dropdown-header\">2 New Messages</li>\n");
      out.write("                <li class=\"message-preview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\n");
      out.write("                        <span class=\"message\">Security alert</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li class=\"message-preview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\n");
      out.write("                        <span class=\"message\">Security alert</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"#\">Go to Inbox <span class=\"badge\">2</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown user-dropdown\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"color: #ffffff\"><i class=\"fa fa-user\"></i>");
      out.print(Name);
      out.write("<b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Settings</a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("               ");
 }
      out.write("\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
                    
            
                        if (token== 1) {
                      
               
      out.write("\n");
      out.write("               ");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"width:25% ;float:left;height:100%; position: fixed;\">\n");
      out.write("    <ul class=\"list-group\">\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Personal.jsp\">Personal Details</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Acadeamic.jsp\">Academic Details</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Traning.jsp\">Training</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Project.jsp\">Projects</a>    \n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Skill.jsp\">Computer Skills</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Experience.jsp\">Experience</a>   \n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <a href=\"Photo.jsp\">Photo and Signature upload</a>\n");
      out.write("            <span class=\"glyphicon glyphicon-remove\"></span>\n");
      out.write("\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("               ");
 }
      out.write('\n');

    Name = "";
    String Email = "";
    String Mobile = "";
    String Age = "";
    String Add = "";
    String Father = "";
    String InX = "";
    String X = "";
    String InXII = "";
    String XII = "";
    String InGrad = "";
    String Grad = "";
    String InPG = "";
    String PG = "";
    id = (String) session.getAttribute("id");
    ResultSet rs = GetInfo.get(id);

    while (rs.next()) {
        Name = rs.getString("NAME");
        Email = rs.getString("EMAIL");
        Mobile = rs.getString("Mobile");
        Age = rs.getString("Age");
        Add = rs.getString("Address");
        Father = rs.getString("Father");
    }



      out.write("\n");
      out.write("<div style=\"width:73% ;float:right;height:100% ; margin-left:2%;\">\n");
      out.write("    <form role=\"form\" action=\"Personal\" method=\"post\"  class=\"form-horizontal\" >\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-10 col-sm-12 col-md-10 col-lg-10\">\n");
      out.write("                <div class=\"listing listing-default\">\n");
      out.write("                    <div class=\"shape\">\n");
      out.write("                        <div class=\"shape-text\">General</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"listing-content\">\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Name</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\" form-control\" id=\"inputEmail3\" name=\"Name\" value=");
      out.print(Name);
      out.write(" readonly>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"inputPassword3\" name=\"Email\" value=");
      out.print(Email);
      out.write(" readonly>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Mobile</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" name=\"Mobile\" value=");
      out.print(Mobile);
      out.write(" readonly>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Father Name</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" name=\"Father\" value=");
      out.print(Father);
      out.write(">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Date of Birth</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <div  class=\"col-sm-2\" style=\"margin-left:-2%; \">\n");
      out.write("                                    <select name=\"start_month\" class=\"form-control\">\n");
      out.write("                                        <option value=\"\" selected=\"selected\">---------</option>\n");
      out.write("                                        <option value=\"1\">Jan</option>\n");
      out.write("                                        <option value=\"2\">Feb</option>\n");
      out.write("                                        <option value=\"3\">Mar</option>\n");
      out.write("                                        <option value=\"4\">Apr</option>\n");
      out.write("                                        <option value=\"5\">May</option>\n");
      out.write("                                        <option value=\"6\">Jun</option>\n");
      out.write("                                        <option value=\"7\">Jul</option>\n");
      out.write("                                        <option value=\"8\">Aug</option>\n");
      out.write("                                        <option value=\"9\">Sep</option>\n");
      out.write("                                        <option value=\"10\">Oct</option>\n");
      out.write("                                        <option value=\"11\">Nov</option>\n");
      out.write("                                        <option value=\"12\">Dec</option>\n");
      out.write("                                    </select> \n");
      out.write("                                </div>\n");
      out.write("                                <div  class=\"col-sm-2\" style=\"margin-left:-2%; \">\n");
      out.write("                                    <select name=\"start_year\" class=\"form-control\">\n");
      out.write("                                        <option value=\"\" selected=\"selected\">---------</option>\n");
      out.write("                                        ");
 for (int i = 2014; i > 1950; i--) {
      out.write("\n");
      out.write("                                        <option value=\"\" selected=\"selected\">");
      out.print(i);
      out.write("</option>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Address</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <textarea class=\"form-control\" rows=\"3\" name=\"Add\">");
      out.print(Add);
      out.write("</textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <button type=\"Submit\" class=\"btn btn-primary\" value=\"Submit\" >Save</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
