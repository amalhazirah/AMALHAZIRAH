/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.println("<h1>Update User</h1>");
       String sid= request.getParameter("id");
       int id=Integer.parseInt(sid);
      
      User e=UserDAO.getUserById(id);
      
      out.print("<form action='EditServlet2' method='post'>");
      out.print("<table>");
      out.print("<tr><td></td><td><input type='hidden' name='id' value='"
               +e.getId()+"'/></td></td>");
      out.print("<td><td>Name:</td><td><input type='text' name='username' value='"
               +e.getUsername()+"'/></td></tr>");
      out.print("<tr><td>Password:</td><td><input type='password' name='password' value'"
               +e.getPassword()+"'/></td></tr>");
     out.print("<tr><td>Role:</td><td>");
     out.print("<select name='role' style='width:150px'>");
     out.print("<option>admin</option>");
     out.print("<option>user</option>");
     out.print("</select>");
     out.print("</td></tr>");
     out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save'/></td></tr>");
     out.print("<table>");
     out.print("</form>");
   
     out.close();
    }
}
               
      
      
