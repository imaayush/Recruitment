package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.GetInfo;
import java.sql.ResultSet;
import bean.GetInfo;
import java.sql.ResultSet;

public final class Home_005fheder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/select.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    String Name = "";
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
    String Frameworks = "";
    String Tools = "";
    String Languages = "";
    String Photo = "";
    String Password = "";
    String Status = "";
    String Resume = "";
    String date = "";
    String month = "";
    String year = "";
    String[] birth = new String[3];
    birth[0] = "";
    birth[1] = "";
    birth[2] = "";
    
    if (session.getAttribute("id") != null) {
        String id = (String) session.getAttribute("id");
        ResultSet rs = GetInfo.get(id);

        while (rs.next()) {
            Name = rs.getString("NAME");
            Email = rs.getString("EMAIL");
            Mobile = rs.getString("Mobile");
            Age = rs.getString("Age");
            Add = rs.getString("Address");
            Father = rs.getString("Father");

            InX = rs.getString("InX");
            X = rs.getString("X");
            InXII = rs.getString("InXII");
            XII = rs.getString("XII");
            InGrad = rs.getString("InGrad");
            Grad = rs.getString("Grad");
            InPG = rs.getString("InPG");
            PG = rs.getString("PG");
            Languages = rs.getString("Languages");
            Tools = rs.getString("Tools");
            Frameworks = rs.getString("Frameworks");
            Photo = rs.getString("Photo_Path");
            Password = rs.getString("Password");
            Status = rs.getString("Status");
            Resume = rs.getString("Resume_Path");
            Age = rs.getString("Age");
        }

         birth = Age.split("-");
        date = birth[0];
        month = birth[1];
        year = birth[2];
        
    } else {
    }

      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         ");
      out.write("\n");
      out.write("         <script src=\"js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("          <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("      \n");
      out.write("        <script src=\"js/bootstrap-tagsinput.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home_style.css\" >\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"font-awesome/css/font-awesome.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/local.css\"  />\n");
      out.write("        ");
      out.write("\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
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
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Admin Panel</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\" >\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
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
