/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.ConnectionProvider;
import bean.Email;
import bean.GetInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
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
                String change = request.getParameter("change");
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

                } else if (change != null) {
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
                        ps.setString(3, (String) request.getParameter("email"));

                        ps.executeUpdate();
                        conn.close();
                        response.sendRedirect("home.jsp");
                    } else {
                        response.sendRedirect("index.jsp");

                    }
                } else if (request.getParameter("Delete_Exp") != null) {

                    String delete = request.getParameter("Delete_Exp");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "DELETE FROM EXPERIENCE  WHERE ID =?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, delete);
                    ;

                    ps.executeUpdate();
                    conn.close();
                    response.sendRedirect("From.jsp");
                } else if (request.getParameter("Delete_Pro") != null) {

                    String delete = request.getParameter("Delete_Pro");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "DELETE FROM PROJECT_INFO  WHERE ID =?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, delete);
                    ;

                    ps.executeUpdate();
                    conn.close();
                    response.sendRedirect("From.jsp");
                } else if (request.getParameter("sendMail") != null) {
                    String Name_sender = request.getParameter("Name_sender");
                    String Email_sender = request.getParameter("Email_sender");
                    String Email_reciver = request.getParameter("Email_reciver");
                    String subject = request.getParameter("subject");
                    String body = request.getParameter("body");
                    Date date = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat(" dd/MM hh:mm a ");
                    String time1 = (ft.format(date)).toString();
                    Connection conn = ConnectionProvider.getCon();
                    String query = "insert into Message (SENDER_MAIL,RECIVER_MAIL,SUBJECT,BODY,DATE_MAIL,SEND_NAME,flag) values(?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, Email_sender);
                    ps.setString(2, Email_reciver);
                    ps.setString(3, subject);
                    ps.setString(4, body);
                    ps.setString(5, time1);
                    ps.setString(6, Name_sender);
                    ps.setString(7, "Unread");
                    ps.executeUpdate();
                    conn.close();

                    response.sendRedirect("Mail_box.jsp");

                } else if (request.getParameter("AdminMail") != null) {
                    String Name_sender = request.getParameter("Name_sender");
                    String Email_sender = request.getParameter("Email_sender");
                    String Email_reciver = request.getParameter("Email_reciver");
                    String subject = request.getParameter("subject");
                    String body = request.getParameter("body");
                    Date date = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat(" dd/MM hh:mm a ");
                    String time1 = (ft.format(date)).toString();
                    Connection conn = ConnectionProvider.getCon();
                    String query = "insert into Message (SENDER_MAIL,RECIVER_MAIL,SUBJECT,BODY,DATE_MAIL,SEND_NAME,flag) values(?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, Email_sender);
                    ps.setString(2, Email_reciver);
                    ps.setString(3, subject);
                    ps.setString(4, body);
                    ps.setString(5, time1);
                    ps.setString(6, Name_sender);
                    ps.setString(7, "Unread");
                    ps.executeUpdate();
                    conn.close();

                    response.sendRedirect("Admin_Message.jsp");

                } else if (request.getParameter("Job_Create") != null) {
                    String NameJob = request.getParameter("NameJob");
                    String JobDetails = request.getParameter("JobDetails");
                    String OpeningDate = request.getParameter("OpeningDate");
                    String closingDate = request.getParameter("closingDate");
                    String NRound = request.getParameter("NRound");
                    String jPosition = request.getParameter("jPosition");
                    String jEvent = request.getParameter("jEvent");
                    String jEventUrl = request.getParameter("jEventUrl");
                    String jTimeStart = request.getParameter("jTimeStart");
                    String jTimeEnd = request.getParameter("jTimeEnd");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "insert into Job(NAME,DETAILS,OPEN,CLOSE,ROUND,OPEN_POSITIONS,NEXT_EVENT,EVENT_DATE,EVENT_URL,EVENT_END) values(?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, NameJob);
                    ps.setString(2, JobDetails);
                    ps.setString(3, OpeningDate);
                    ps.setString(4, closingDate);
                    ps.setString(5, NRound);
                    ps.setString(6, jPosition);
                    ps.setString(7, jEvent);
                    ps.setString(8, jTimeStart);
                    ps.setString(9, jEventUrl);
                    ps.setString(10, jTimeEnd);

                    ps.executeUpdate();
                    conn.close();

                    response.sendRedirect("Create_Job.jsp");

                } else if (request.getParameter("Create_Q") != null) {
                    String Question = request.getParameter("Question");
                    String OptionA = request.getParameter("OptionA");
                    String OptionB = request.getParameter("OptionB");
                    String OptionC = request.getParameter("OptionC");
                    String OptionD = request.getParameter("OptionD");
                    String Ans = request.getParameter("Ans");

                    Connection conn = ConnectionProvider.getCon();
                    String query = "insert into Question(Question,OptionA,OptionB,OptionC,OptionD,Ans) values(?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, Question);
                    ps.setString(2, OptionA);
                    ps.setString(3, OptionB);
                    ps.setString(4, OptionC);
                    ps.setString(5, OptionD);
                    ps.setString(6, Ans);

                    ps.executeUpdate();
                    conn.close();

                    response.sendRedirect("Create_Q.jsp");

                } else if (request.getParameter("Create_Quiz") != null) {
                    String NameQuiz = request.getParameter("NameQuiz");
                    int NoQuestion = Integer.parseInt(request.getParameter("NoQuestion"));
                    String Start_Time = request.getParameter("Start_Time");
                    String End_Time = request.getParameter("End_Time");
                    int Marks = Integer.parseInt(request.getParameter("Marks"));
                    String AddQuestion = request.getParameter("AddQuestion");
                    int cutoff = Integer.parseInt(request.getParameter("cutoff"));
                    String Time_Duration = request.getParameter("Time_Duration");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "insert into QUIZ(NAME,NO_QUESTION,START_TIME,END_TIME,Mark,LIST_QUESTION,CUTOFF,TIME_DURATION) values(?,?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, NameQuiz);
                    ps.setInt(2, NoQuestion);
                    ps.setString(3, Start_Time);
                    ps.setString(4, End_Time);
                    ps.setInt(5, Marks);
                    ps.setString(6, AddQuestion);
                    ps.setInt(7, cutoff);
                    ps.setString(8, Time_Duration);
                    ps.executeUpdate();
                    conn.close();

                    response.sendRedirect("Create_Quiz.jsp");

                } else if (request.getParameter("Create_Event") != null) {

                    String jEvent = request.getParameter("jEvent");
                    String jEventUrl = request.getParameter("jEventUrl");
                    String jTimeStart = request.getParameter("jTimeStart");
                    String jTimeEnd = request.getParameter("jTimeEnd");
                    String JobID = request.getParameter("JobID");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "update JOB set NEXT_EVENT=? ,EVENT_URL=? ,EVENT_DATE=?,EVENT_END=? where ID= ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, jEvent);
                    ps.setString(2, jEventUrl);
                    ps.setString(3, jTimeStart);
                    ps.setString(4, jTimeEnd);
                    ps.setString(5, JobID);

                    ps.executeUpdate();
                    conn.close();

                    response.sendRedirect("list_job.jsp");

                } else if (request.getParameter("Update_Status") != null) {

                    String EmailId = request.getParameter("EmailId");
                    String Status = request.getParameter("Status");
                    String JobId = request.getParameter("JobId");
                    Connection conn = ConnectionProvider.getCon();
                    String query = "update LIST_APPLICATION set STATUS=?  where APPLICATION= ? and ID=?  ";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, Status);
                    ps.setString(2, EmailId);
                    ps.setString(3, JobId);
                    String upass=null; 
                    
                    
                    ps.executeUpdate();
                    conn.close();
                    String Email1 =EmailId.toString();
                    String body = "Your are " + Status;
                    bean.Email.Sendmail(Email1, upass, body);
                    response.sendRedirect("Interview.jsp");

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
