package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.GetInfo;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/side_nav.html");
    _jspx_dependants.add("/side_bar1.jsp");
    _jspx_dependants.add("/login.jsp");
    _jspx_dependants.add("/Reg.html");
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

      out.write(' ');
      out.write('\n');
session.setAttribute( "id","");
      out.write('\n');
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
      out.write("        <title>Home</title> \n");
      out.write("    </head> \n");
      out.write("    <body> \n");
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

            }


        
      out.write("\n");
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
      out.write("                <div id=\"demo\">\n");
      out.write("                    <ul  class=\"nav navbar-nav navbar-right navbar-user\">\n");
      out.write("                        <li  class=\"dropdown messages-dropdown\" >\n");
      out.write("                            <a  href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"style=\"color: #ffffff\"><i class=\"fa fa-envelope\"></i> Messages <span class=\"badge\">2</span> <b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"dropdown-header\">2 New Messages</li>\n");
      out.write("                                <li class=\"message-preview\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\n");
      out.write("                                        <span class=\"message\">Security alert</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("                                <li class=\"message-preview\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\n");
      out.write("                                        <span class=\"message\">Security alert</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("                                <li><a href=\"#\">Go to Inbox <span class=\"badge\">2</span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown user-dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"color: #ffffff\"><i class=\"fa fa-user\"></i>");
      out.print(Name);
      out.write("<b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Settings</a></li>\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
                    
            
                        if (token== 1) {
                      
               
      out.write("\n");
      out.write("               ");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"width:25% ;float:left;height:100% ;background-color:#F5F5F5;\">\n");
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
      out.write("\n");
      out.write("<div style=\"width:27%;float:left;height:100%\">\n");
      out.write("    <h1>  </h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal-dialog\" style=\"opacity: 0.9; margin-top: 10%;\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("            <h1 class=\"text-center\">Login</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <form class=\"form col-md-12 center-block\" action=\"Ac.jsp\" method=\"Post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Email\" name=\"Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control input-lg\" placeholder=\"Password\" name=\"Password\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button class=\"btn btn-primary btn-lg btn-block\">Sign In</button>\n");
      out.write("                    <a data-toggle=\"modal\" data-target=\"#myModal\" style=\"color: #9CA6D2 !important;\">Register here </a><span style=\"margin-left:68%\"><a href=\"#\" style=\"color: #9CA6D2 !important;\">Need help?</a></span>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("            </div>\t\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" >\n");
      out.write("    <div class=\"modal-dialog\" style=\"z-index:2000;\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">Register</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<form role=\"form\" action=\"Basic\" method=\"Get\" >\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"Name\">Name</label>\n");
      out.write("        <input type=\"Name\" class=\"form-control\" id=\"Name\" placeholder=\"Enter name\" name=\"name\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("        <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Enter email\" name=\"email\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\"  name=\"password\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"exampleInputPassword2\">Password</label>\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword2\" placeholder=\"Conform Password\" name=\"CoPassword\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"mobile\">Mobile no.</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"mobile\" placeholder=\"Enter mobile no .\" name=\"mobile\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"modal-footer\">\n");
      out.write("    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("    <button type=\"Submit\" value =\"Submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"width:27%;float:left;height:100%\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body> \n");
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
