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
import bean.GetInfo;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.Connection;
import bean.ConnectionProvider;
import bean.GetInfo;
import java.sql.ResultSet;

public final class portfolio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/select.jsp");
    _jspx_dependants.add("/side_nav.jsp");
    _jspx_dependants.add("/Name.jsp");
    _jspx_dependants.add("/selecte_message.jsp");
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
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<link href=\"css/card.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("        ");
 String id = (String) session.getAttribute("id");
            
            int token = (int) session.getAttribute("token");
            if (token == 0) {
      

        
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
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Admin Panel</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\" >\n");
      out.write("                ");
                    
            
                        if (token== 2) {
                      
               
      out.write("\n");
      out.write("               ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul class=\"nav navbar-nav side-nav\">\n");
      out.write("    \n");
      out.write("    <li> \n");
      out.write("    </li>\n");
      out.write("     <li ><a href=\"home.jsp\"><i class=\"fa fa-bullseye\"></i> Dashboard</a></li>\n");
      out.write("     <li ><a href=\"Profile.jsp\"><i class=\"fa fa-user\"></i> Profile</a></li>\n");
      out.write("    <li><a href=\"portfolio.jsp\"><i class=\"fa fa-tasks\"></i> Portfolio</a></li>                    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <li><a href=\"job.jsp\"><i class=\"fa fa-font\"></i>pply For Jobs</a></li>\n");
      out.write("    <li><a href=\"practice.jsp\"><i class=\"fa fa-list-ul\"></i>Practice</a></li>\n");
      out.write("    <li><a href=\"time.jsp\"><i class=\"fa fa-table\"></i > Time Manage</a></li>                    \n");
      out.write("</ul>\n");
      out.write(" ");
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
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
 String ProjectName = "";
    String DESCRIPTION = "";
    String STARTDATE = "";
    String ENDDATE = "";
    int num = 0;
    int columnsNumber =0;
    if (session.getAttribute("id") != null) {
        String id2 = (String) session.getAttribute("id");
        Connection conn = ConnectionProvider.getCon();
        String query = "select*from MESSAGE where RECIVER_MAIL=" + "'" + id2 + "'";
        PreparedStatement ps = conn.prepareStatement(query);
        // ps.setInt(1,1);
        // ps.setString(1,uemail);
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();

         columnsNumber = rsmd.getColumnCount();
        String pass = null;
        String status = null;

        



      out.write("\n");
      out.write("            <a  href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"color: #ffffff\"><i class=\"fa fa-envelope\"></i> Messages <span class=\"badge\">");
      out.print(columnsNumber/6);
      out.write("</span> <b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown-header\">");
      out.print(columnsNumber/6);
      out.write(" New Messages</li>\n");
      out.write("                ");
while (rs.next()) {
      out.write("\n");
      out.write("                <li class=\"message-preview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\n");
      out.write("                        <span class=\"message\">");
      out.print(rs.getString("SUBJECT"));
      out.write("</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                ");
}

                            } else {

                            }
      out.write("\n");
      out.write("                \n");
      out.write("                <li><a href=\"#\">Go to Inbox <span class=\"badge\">");
      out.print(columnsNumber/6);
      out.write("</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown user-dropdown\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"color: #ffffff\"><i class=\"fa fa-user\"></i>");
      out.print(Name);
      out.write("<b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"Profile.jsp\"><i class=\"fa fa-user\"></i> Profile</a></li>\n");
      out.write("                <li><a href=\"Settings.jsp\"><i class=\"fa fa-gear\"></i> Settings</a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"logout.jsp\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\n");
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
      out.write("            <a href=\"Personal.jsp\">General</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Acadeamic.jsp\">Education</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Traning.jsp\">Skills</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Project.jsp\">Projects</a>    \n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Experience.jsp\">Experience</a>   \n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <a href=\"Photo.jsp\">Photo</a>\n");
      out.write("            <span class=\"glyphicon glyphicon-remove\"></span>\n");
      out.write("\n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-group-item\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            <a href=\"Skill.jsp\">Resume</a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("               ");
 }
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"width:75% ;float:left;height:95%;margin-left:22%; margin-top: -2% \">\n");
      out.write("    <form role=\"form\" action=\"Personal\" method=\"post\"  class=\"form-horizontal\" >\n");
      out.write("        <div class=\"row\" >\n");
      out.write("            <div class=\"col-xs-12 col-sm-12 col-md-10 col-lg-10\">\n");
      out.write("                <div class=\"listing listing-default\" style=\"height:92%\">\n");
      out.write("                    <div class=\"shape\">\n");
      out.write("                        <div class=\"shape-text\">Portfolio</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"listing-content\">\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
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
