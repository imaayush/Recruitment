package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import bean.ConnectionProvider;
import bean.ConnectionProvider.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><head>\n");
      out.write("            <meta charset=\"utf-8\">\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("       \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home_style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js \"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Home</title> \n");
      out.write("   \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("      <div class=\"block\">               \n");
      out.write("                                <div class=\"block-content\">\n");
      out.write("                                    <h2><strong>Validation</strong> Engine</h2>\n");
      out.write("                                    <p>jQuery validation engine is a Javascript plugin aimed at the validation of form fields in the browser (IE 6-8, Chrome, Firefox, Safari, Opera 10). The plugin provides visually appealing prompts that grab user attention on the subject matter.</p>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Login:</label>                                        \n");
      out.write("                                        <input type=\"text\" class=\"validate[required,maxSize[8]] form-control\">\n");
      out.write("                                        <div class=\"help-block\">Required, max size = 8</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Password:</label>                                        \n");
      out.write("                                        <input type=\"password\" class=\"validate[required,minSize[5],maxSize[10]] form-control\" id=\"password\">\n");
      out.write("                                        <div class=\"help-block\">Required, min size = 5, max size = 10</div>\n");
      out.write("                                    </div>                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Confirm Password:</label>                                       \n");
      out.write("                                        <input type=\"password\" class=\"validate[required,equals[password]] form-control\">\n");
      out.write("                                        <div class=\"help-block\">Required, equals Password</div>\n");
      out.write("                                    </div>                            \n");
      out.write("                                    <div class=\"form-group\">                                        \n");
      out.write("                                        <label>Age:</label>                                        \n");
      out.write("                                        <input type=\"text\" class=\"validate[required,custom[integer],min[18],max[120]] form-control\">\n");
      out.write("                                        <div class=\"help-block\">Required, integer, min value = 18, max = 120</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Gender:</label>                                        \n");
      out.write("                                        <div class=\"radio radio-inline\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"radio\" class=\"validate[required]\" name=\"gender\" value=\"1\"> Male\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>                                    \n");
      out.write("                                        <div class=\"radio radio-inline\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"radio\" class=\"validate[required]\" name=\"gender\" value=\"0\"> Famale\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>      \n");
      out.write("                                        <div class=\"help-block\">One of those elements should be choosen</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">                                        \n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" value=\"\" name=\"rules\" class=\"validate[required]\"> Please send me news\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>                                \n");
      out.write("                                        <div class=\"help-block\">Should be checked</div>\n");
      out.write("                                    </div>                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Date of birth:</label>                                        \n");
      out.write("                                        <input type=\"text\" class=\"validate[required,custom[date]] form-control datepicker hasDatepicker\" id=\"dp1416317014640\">\n");
      out.write("                                        <div class=\"help-block\">Required, date YYYY-MM-DD</div>                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Credit card:</label>                                        \n");
      out.write("                                        <input type=\"text\" class=\"validate[required,creditCard] form-control\">\n");
      out.write("                                        <div class=\"help-block\">Required, credit card number</div>\n");
      out.write("                                    </div>             \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Site:</label>                                        \n");
      out.write("                                        <input type=\"text\" value=\"http://\" class=\"validate[required,custom[url]] form-control\">\n");
      out.write("                                        <div class=\"help-block\">Required, url</div>\n");
      out.write("                                    </div>                                                                  \n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"block-footer\">\n");
      out.write("                                    <div class=\"pull-left\">\n");
      out.write("                                        <button class=\"btn btn-default\" type=\"button\" onclick=\"$('#validate').validationEngine('hide');\">Hide prompts</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pull-right\">                                                                                    \n");
      out.write("                                        <button class=\"btn btn-success\" type=\"submit\">Submit</button>                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>                                    \n");
      out.write("                            </div>\n");
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
