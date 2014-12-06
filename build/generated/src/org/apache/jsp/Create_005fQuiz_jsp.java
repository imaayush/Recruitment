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
import java.sql.PreparedStatement;
import java.sql.Connection;
import bean.ConnectionProvider;
import bean.GetInfo;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.Connection;
import bean.ConnectionProvider;
import bean.GetInfo;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.Connection;
import bean.ConnectionProvider;
import bean.GetInfo;
import java.sql.ResultSet;

public final class Create_005fQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/Header_Admin.jsp");
    _jspx_dependants.add("/side_admin.jsp");
    _jspx_dependants.add("/Admin_Name.jsp");
    _jspx_dependants.add("/selecte_admin.jsp");
    _jspx_dependants.add("/selecte_message.jsp");
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
      out.write("<link href=\"css/bootstrap-tagsinput.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"js/bootstrap-tagsinput.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"css/card.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("       \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <title>Home</title> \n");
      out.write("    </head> \n");
      out.write("    <body> \n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\" >            \n");
      out.write("            <div class=\"navbar-header\" style=\"opacity: 0.9;\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Admin Panel</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\"  >\n");
      out.write("                ");
                    
            
                        if (token== 2) {
                      
               
      out.write("\n");
      out.write("               ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<ul class=\"nav navbar-nav side-nav\">\n");
      out.write("\n");
      out.write("    <li> \n");
      out.write("    </li>\n");
      out.write("    <li ><a href=\"Control_Panel.jsp\"><i class=\"fa fa-bullseye\"></i> Dashboard</a></li>\n");
      out.write("\n");
      out.write("    <li><a href=\"Admin_Message.jsp\"><i class=\"fa fa-envelope-o\"></i> Message</a></li>                    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <li><a href=\"Create_Job.jsp\"><i class=\"fa fa-money \"></i> Create Job </a></li>\n");
      out.write("    <li><a href=\"#\"><i class=\"fa fa-code\"></i>Create Challenge</a></li>\n");
      out.write("    <li><a href=\"Create_Quiz.jsp\"><i class=\"fa fa-chain-broken\"></i > Create Quiz</a></li> \n");
      out.write("    <li ><a href=\"Create_Q.jsp\"><i class=\"fa fa-question\"></i> Create Question</a></li>\n");
      out.write("    <li ><a href=\"list_job.jsp\"><i class=\"fa fa-won\"></i> List of Job</a></li>\n");
      out.write("    <li ><a href=\"#\"><i class=\"fa fa-desktop\"></i> Interview</a></li>\n");
      out.write("     <li ><a href=\"#\"><i class=\"fa fa-list\"></i> List of selected Candidate</a></li>\n");
      out.write("</ul>\n");
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
      out.write("<!DOCTYPE html>\n");
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
    String Email = (String)session.getAttribute("id");
    String Mobile = "";
    String Password = "";
    String Status = "";
    if (session.getAttribute("id") != null) {
        Connection conn = ConnectionProvider.getCon();
        String query = "select * from ADMIN where email =?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, Email);

        ResultSet rs = ps.executeQuery();
        

        while (rs.next()) {
            Name = rs.getString("NAME");
            Password = rs.getString("Password");
            Mobile = rs.getString("Mobile");

            Status = rs.getString("Status");

        }

    } else {
    }

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
    int count = 0;
    if (session.getAttribute("id") != null) {
        String id2 = (String) session.getAttribute("id");
        Connection conn = ConnectionProvider.getCon();
        String query = "select count(ID) AS COUNT from MESSAGE where RECIVER_MAIL=" + "'" + id2 + "'";
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            count = rs.getInt("COUNT");
        }
        conn.close();
        conn = ConnectionProvider.getCon();
        query = "select*from MESSAGE where RECIVER_MAIL=" + "'" + id2 + "'" +"ORDER BY ID DESC";
        ps = conn.prepareStatement(query);

         rs = ps.executeQuery();

        String pass = null;
        String status = null;



      out.write("\n");
      out.write("            <a  href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"color: #ffffff\"><i class=\"fa fa-envelope\"></i> Messages <span class=\"badge\">");
      out.print(count);
      out.write("</span> <b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown-header\">");
      out.print(count);
      out.write(" New Messages</li>\n");
      out.write("                ");
while (rs.next()) { 
      out.write("\n");
      out.write("                <li class=\"message-preview\">\n");
      out.write("                    <a href=\"Admin_Message.jsp\">\n");
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
      out.write("                <li><a href=\"Admin_Message.jsp\">Go to Inbox <span class=\"badge\">");
      out.print(count);
      out.write("</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown user-dropdown\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"color: #ffffff\"><i class=\"fa fa-user\"></i>");
      out.print(Name);
      out.write("<b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\n");
      out.write("                <li><a href=\"Settings.jsp\"><i class=\"fa fa-gear\"></i> Settings</a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"logout_Admin.jsp\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"width:75% ;float:left;height:95%;margin-left:22%; margin-top: -2% \">\n");
      out.write("    <form role=\"form\" action=\"Personal\" method=\"post\"  class=\"form-horizontal\" >\n");
      out.write("        <div class=\"row\" >\n");
      out.write("            <div class=\"col-xs-12 col-sm-12 col-md-10 col-lg-10\">\n");
      out.write("                <div class=\"listing listing-default\">\n");
      out.write("                    <div class=\"shape\">\n");
      out.write("                        <div class=\"shape-text\">Create Quiz</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"listing-content\" >\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Name of Quiz</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <textarea class=\"form-control\" rows=\"3\" name=\"NameQuiz\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">No. of Question</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\" form-control\" id=\"inputEmail3\" name=\"NoQuestion\"  >\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Start Time</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\" form-control\" id=\"inputEmail3\" name=\"Start_Time\"  >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">End Time</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\" form-control\" id=\"inputEmail3\" name=\"End_Time\"  >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Cutoff</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\" form-control\" id=\"inputEmail3\" name=\"cutoff\"  >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputEmail3\" class=\"col-sm-2 control-label\"> Question Marks</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\" form-control\" id=\"inputEmail3\" name=\"Marks\"  >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"shape\" style=\" width: 106%; margin-left: -3%;\">\n");
      out.write("                            <div class=\"shape-text\">List Of Questions</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"overflow: auto;height:50% !important;\">\n");
      out.write("                            ");
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
    int count = 0;
    if (session.getAttribute("id") != null) {
        String id2 = (String) session.getAttribute("id");
        Connection conn = ConnectionProvider.getCon();
        String query = "select count(ID) AS COUNT from MESSAGE where RECIVER_MAIL=" + "'" + id2 + "'";
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            count = rs.getInt("COUNT");
        }
        conn.close();
        conn = ConnectionProvider.getCon();
        query = "select*from MESSAGE where RECIVER_MAIL=" + "'" + id2 + "'" +"ORDER BY ID DESC";
        ps = conn.prepareStatement(query);

         rs = ps.executeQuery();

        String pass = null;
        String status = null;



      out.write("\n");
      out.write("\n");
      out.write("                            ");
while (rs.next()) {
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                <hr class =\"hr\">\n");
      out.write("                                <label class=\"col-sm-1 control-label\">");
      out.print(rs.getString("SENDER_MAIL"));
      out.write("</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");
}

                                } else {

                                }
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputEmail3\" class=\"col-sm-3 control-label\"> Add Question(By ID) </label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" value=\"\"  data-role=\"tagsinput\" name=\"AddQuestion\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <button type=\"Submit\" class=\"btn btn-primary\" value=\"Create_Q\" name=\"Create_Q\" >Create</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
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
      out.write("</html>");
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
