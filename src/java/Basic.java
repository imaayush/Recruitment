import bean.ConnectionProvider;
import bean.Email;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Knight
 */
public class Basic extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            try {
                String uname = request.getParameter("name");
                String upass = "AT" + (int) (Math.random() * 100000);
                String uemail = request.getParameter("email");
                String mobile = request.getParameter("mobile");

                if (request.getParameter("Reg") != null) {
                    Connection conn = ConnectionProvider.getCon();
                    String query = "insert into INFO (ID,Name,Email,Mobile,Status,Password,Age) values(?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setInt(1, 1);
                    ps.setString(2, uname);
                    ps.setString(3, uemail);
                    ps.setString(4, mobile);
                    ps.setString(5, "D");
                    ps.setString(6, upass);
                    ps.setString(7, "19-Jan-1994");
                    ps.executeUpdate();
                    String body = "Dear Customer,"+'\n'+ " Congratulation! You have successfully created a new account with ASP."+'\n'+"Your login email ID: "+uemail+'\n'+"Your login Password:"+upass;
                    Email.Sendmail(uemail, upass,body);
                    response.sendRedirect("verification.jsp");
                } else if (request.getParameter("Forgot") != null) {
                    String PG = request.getParameter("PG");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "update INFO set Password=? ,Status=? where EMAIL= ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, upass);
                    ps.setString(2, "D");
                    ps.setString(3, uemail);
                    ps.executeUpdate();
                    String body = "Dear Customer,"+'\n'+ " Congratulation! You have successfully created a new account with ASP."+'\n'+"Your login email ID: "+uemail+'\n'+"Your login Password:"+upass;
                    Email.Sendmail(uemail, upass, body);
                    response.sendRedirect("verify.jsp");
                }

            } catch (Exception e) {
                out.print(e);
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
