/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.ConnectionProvider;
import bean.GetInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Knight
 */
public class Personal extends HttpServlet {

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
                String general = request.getParameter("general");
                String education = request.getParameter("education");
                String skill = request.getParameter("skill");
                String project = request.getParameter("project");
                String experience = request.getParameter("experience");
                String change=request.getParameter("change");
                String photo = request.getParameter("photo");
                String resume = request.getParameter("resume");
                String submit = request.getParameter("submit");
                String Email = request.getParameter("Email");

                if (general != null) {
                    String Father = request.getParameter("Father");
                    String date = request.getParameter("birth_date");
                    String month = request.getParameter("birth_month");
                    String year = request.getParameter("birth_year");
                    String Date_Birth = date + "-" + month + "-" + year;
                    String Age = Date_Birth;

                    String Add = request.getParameter("Add");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "update INFO set FATHER=? ,AGE=? ,ADDRESS=? where EMAIL= ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, Father);
                    ps.setString(2, Age);
                    ps.setString(3, Add);
                    ps.setString(4, Email);

                    ps.executeUpdate();
                    conn.close();
                    response.sendRedirect("From.jsp");

                } else if (education != null) {
                    String InX = request.getParameter("InX");
                    String X = request.getParameter("X");
                    String InXII = request.getParameter("InXII");
                    String XII = request.getParameter("XII");
                    String InGrad = request.getParameter("InGrad");
                    String Grad = request.getParameter("Grad");
                    String InPG = request.getParameter("InPG");
                    String PG = request.getParameter("PG");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "update INFO set Inx=? ,X=? ,InXII=? ,XII=?,InGrad=?,Grad=?,InPG=?,PG=?where EMAIL= ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, InX);
                    ps.setString(2, X);
                    ps.setString(3, InXII);
                    ps.setString(5, XII);
                    ps.setString(6, InGrad);
                    ps.setString(7, Grad);
                    ps.setString(8, InPG);
                    ps.setString(9, PG);
                    ps.setString(10, Email);

                    ps.executeUpdate();
                    conn.close();
                    response.sendRedirect("From.jsp");
                } else if (skill != null) {

                    String Tools = request.getParameter("tools1");
                    String Frameworks = request.getParameter("frameworks");
                    String Languages = request.getParameter("languages");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "update INFO set TOOLS=? ,FRAMEWORKS=? ,LANGUAGES=? where EMAIL= ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(3, Languages);
                    ps.setString(1, Tools);
                    ps.setString(2, Frameworks);
                    ps.setString(4, Email);
                    ps.executeUpdate();
                    conn.close();
                    response.sendRedirect("From.jsp");
                } else if (project != null) {
                    String ProjectName = request.getParameter("ProjectName");

                    String month = request.getParameter("project_month_start");
                    String year = request.getParameter("project_year_start");
                    String Start = month + "/" + year;
                    String month1 = request.getParameter("project_month_end");
                    String year1 = request.getParameter("project_year_end");
                    String End = month1 + "/" + year1;

                    String Decscription = request.getParameter("ProDescription");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "insert into PROJECT_INFO (Name,Email,StartDate,EndDate,DESCRIPTION) values(?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, ProjectName);
                    ps.setString(2, Email);
                    ps.setString(3, Start);
                    ps.setString(4, End);
                    ps.setString(5, Decscription);
                    ps.executeUpdate();
                    conn.close();
                    response.sendRedirect("From.jsp");

                } else if (experience != null) {
                    String Cname = request.getParameter("Cname");
                    String job = request.getParameter("job");
                    String month = request.getParameter("job_month_start");
                    String year = request.getParameter("job_year_start");
                    String Start = month + "/" + year;
                    String month1 = request.getParameter("job_month_end");
                    String year1 = request.getParameter("job_year_end");
                    String End = month1 + "/" + year1;

                    String JDes = request.getParameter("JDes");
                    String Rskill = request.getParameter("Rskill");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "insert into experience (company,Email,StartDate,EndDate,DESCRIPTION,job,rskill) values(?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, Cname);
                    ps.setString(2, Email);
                    ps.setString(3, Start);
                    ps.setString(4, End);
                    ps.setString(5, JDes);
                    ps.setString(6, job);
                    ps.setString(7, Rskill);

                    ps.executeUpdate();
                    conn.close();
                    response.sendRedirect("From.jsp");

                } else if ( change!= null) {
                    String OldPassword = request.getParameter("OldPassword");
                    String Pass1 = "";

                    ResultSet rs = GetInfo.get((String) request.getParameter("email"));

                    while (rs.next()) {
                        Pass1 = rs.getString("Password");
                    }
                    String NewPassword = request.getParameter("NewPassword");
                    String CPassword = request.getParameter("CPassword");
                    if (Pass1.equals(OldPassword)) {

                        String Decscription = request.getParameter("ProDescription");
                        Connection conn = ConnectionProvider.getCon();
                        String query = "update INFO set Password=? ,Status=?  where EMAIL= ?";
                        PreparedStatement ps = conn.prepareStatement(query);
                        ps.setString(1, NewPassword);
                        ps.setString(2, "A");
                        ps.setString(3,(String) request.getParameter("email") );

                        ps.executeUpdate();
                        conn.close();
                        response.sendRedirect("home.jsp");
                    } else {
                        response.sendRedirect("index.jsp");
                        
                    }
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
