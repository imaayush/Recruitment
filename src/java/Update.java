/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.ConnectionProvider;
import bean.DataSet;
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
public class Update extends HttpServlet {

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
                DataSet In = new DataSet();
                In.setUfather(request.getParameter("Father"));
                String Age = request.getParameter("Age");
                int Age1 = Integer.parseInt(Age);
                In.setUage(Age1);
                String Add1 = request.getParameter("Add1");
                Add1 = Add1 + request.getParameter("Add2");
                In.setUadd(Add1);
                In.setUpro(request.getParameter("Pro"));
                Connection conn = ConnectionProvider.getCon();
               
                String query = "update INFO_TEMP set FATHER_NAME=?,AGE=?,ADRESS=?,X=?,XII=?,GRAD=?,INSTITUTION=?,PROJECT=?,SKILLES=?,EXPERIENCE=?,COMPANY=?,PHOTO_PATH=?,SNIG_PATH=? where EMAIL= ?";
                PreparedStatement ps = conn.prepareStatement(query);
        
                ps.setString(1, In.getUfather());
                ps.setInt(2, In.getUage());
                ps.setString(3,In.getUadd());
                ps.setInt(4,In.getUx());
                ps.setInt(5,In.getUxii());
                ps.setInt(6,In.getUgrad());
                ps.setString(7,In.getUins());
                ps.setString(8,In.getUpro());
                ps.setString(9,In.getUskill());
                ps.setInt(10,In.getUexp());
                ps.setString(11,In.getUcompany());
                ps.setString(12,In.getUphoto());
                ps.setString(13,In.getUsnigh());
                ps.setString(14, "ctiwari945@gmail.com");
                ps.executeUpdate();

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
