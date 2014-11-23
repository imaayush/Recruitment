/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.*;
import java.util.*;
import javax.mail.*;
import java.io.PrintWriter;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 *
 * @author Knight
 */
public class Email {

    public static void Sendmail(String mail, String upass) {

        try {

            String to = mail;//change accordingly  

            //Get the session object  
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("aayushtiwari41@gmail.com", "aayushworkplace1");//change accordingly  
                }
            });

            //compose message  
            try {
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress("aayushtiwari41@gmail.com"));//change accordingly  
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setSubject(" A2Z Account Created");
                String body = "Dear Customer,"+'\n'+ " Congratulation! You have successfully created a new account with Flipkart."+'\n'+"Your login email ID: aayushtiwari41@gmail.com "+'\n'+"Your login Password:"+upass;
                message.setText(body);

                //send message  
                Transport.send(message);

                System.out.print("message sent successfully");

            } catch (Exception e) {
                System.out.print(e.toString());
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        } finally {
            System.out.close();
        }
    }
}
