package org.apache.jsp.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.GetInfo;
import java.sql.ResultSet;

public final class Select_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
    String Password="";
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
            Password= rs.getString("Password");
        }
    }
    else{
      response.sendRedirect("index.jsp");
    }

      out.write('\n');
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
