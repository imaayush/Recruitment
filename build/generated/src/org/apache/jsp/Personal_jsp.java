package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.sql.ResultSet;
import bean.GetInfo;
import bean.ConnectionProvider.*;
import bean.GetInfo.*;

public final class Personal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/from_heder.html");
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
      out.write(" \n");
      out.write("   \n");
      out.write("  \n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home_style.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"font-awesome/css/font-awesome.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/local.css\" />\r\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js \"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>Home</title> \r\n");
      out.write("    </head> \r\n");
      out.write("    <body> \r\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">            \r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\" style=\"color: #ffffff\">Admin Panel</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\" >\r\n");
      out.write("\r\n");
      out.write("                <div id=\"demo\">\r\n");
      out.write("                    <ul  class=\"nav navbar-nav navbar-right navbar-user\">\r\n");
      out.write("                        <li  class=\"dropdown messages-dropdown\" >\r\n");
      out.write("                            <a  href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"color: #ffffff\"><i class=\"fa fa-envelope\"></i> Messages <span class=\"badge\">2</span> <b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li class=\"dropdown-header\">2 New Messages</li>\r\n");
      out.write("                                <li class=\"message-preview\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\r\n");
      out.write("                                        <span class=\"message\">Security alert</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li class=\"message-preview\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\r\n");
      out.write("                                        <span class=\"message\">Security alert</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"#\">Go to Inbox <span class=\"badge\">2</span></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown user-dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"color:#ffffff;\"><i class=\"fa fa-user\"></i> Steve Miller<b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Settings</a></li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write('\n');
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
      out.write("\n");
      out.write("<div class=\"panel panel-default\" style=\"width:75% ;float:left;height:100%\">\n");
      out.write("    <!-- Default panel contents -->\n");
      out.write("\n");
      out.write("    <div class=\"panel-heading\">Personal details</div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("        <form role=\"form\" action=\"Personal\" method=\"post\"  class=\"form-horizontal\" >\n");
      out.write("            ");

                String Name = "";
                String Email = "";
                String Mobile = "";
                String Age = "";
                String Add = "";
                String Father = "";
                String id = (String) session.getAttribute("id");
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
      out.write("            \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Name</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"inputEmail3\" placeholder=\"Email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Mobile</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Father Name</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Age</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Address</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("       \n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"Submit\" class=\"btn btn-default\" value=\"Submit\" >Save</button>\n");
      out.write("                <button type=\"button\"  class=\"btn btn-primary\" onclick=\"window.location.href = 'Acadeamic.jsp';\">Next</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Table -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
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