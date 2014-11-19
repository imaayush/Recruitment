package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/index_header.html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("            <meta charset=\"utf-8\">\r\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("       \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home_style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js \"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>Home</title> \r\n");
      out.write("    </head> \r\n");
      out.write("    <body> \r\n");
      out.write("         <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">            \r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                \r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Admin Panel</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </nav>\r\n");
      out.write("                \r\n");
      out.write("                           \r\n");
      out.write("        </div>");
      out.write("\n");
      out.write("<div style=\"width:27%;float:left;height:100%\">\n");
      out.write("    <h1>  </h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

   String name = request.getParameter( "Name" );
   session.setAttribute( "id", name );

      out.write("\n");
      out.write("<div class=\"modal-dialog\" style=\"opacity: 0.9; margin-top: 10%;\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("            <h1 class=\"text-center\">Login</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <form class=\"form col-md-12 center-block\" action=\"Login\" method=\"Post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Email\" name=\"Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control input-lg\" placeholder=\"Password\" name=\"Password\">\n");
      out.write("                </div>\n");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<form role=\"form\" action=\"Basic\" method=\"Get\" >\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"Name\">Name</label>\r\n");
      out.write("        <input type=\"Name\" class=\"form-control\" id=\"Name\" placeholder=\"Enter name\" name=\"name\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"exampleInputEmail1\">Email address</label>\r\n");
      out.write("        <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Enter email\" name=\"email\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"exampleInputPassword1\">Password</label>\r\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\"  name=\"password\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"exampleInputPassword2\">Password</label>\r\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword2\" placeholder=\"Conform Password\" name=\"CoPassword\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"mobile\">Mobile no.</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"mobile\" placeholder=\"Enter mobile no .\" name=\"mobile\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal-footer\">\r\n");
      out.write("    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("    <button type=\"Submit\" value =\"Submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
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
