/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author My Pc
 */
@WebServlet(name = "formServlet", urlPatterns = {"/formServlet"})
public class formServlet extends HttpServlet {

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
            
            String nameTextBox = request.getParameter("nameTextBox");
            String emailTextBox = request.getParameter("emailTextBox");
            String contactTextBox = request.getParameter("contactTextBox"); 
        
            String[] music=request.getParameterValues("music");
            String favMusic = request.getParameter("favMusic"); 
            String dayListen = request.getParameter("dayListen"); 
            String listenWarna = request.getParameter("listenWarna");
            String[] preferListen = request.getParameterValues("preferListen");
            String addComment = request.getParameter("comment");
            String news = request.getParameter("News");
            
            out.println("</body>Name : "+nameTextBox);
            out.println("<p>Email : "+emailTextBox);
            out.println("<p>Contact number : "+contactTextBox);
            
            for(int i=0;i<music.length;i++)
            {
                out.println("<p>Music : "+music[i]);
            }
            
            out.println("<p>Favourite music decade : "+favMusic);
            out.println("<p>Favorite day to listen : "+dayListen);
            out.println("<p>Favourite music decade : "+listenWarna);
            
            for(int j=0;j<preferListen.length;j++)
            {
                out.println("<p>Prefer to listen : "+preferListen[j]);
            }
            
            out.println("<p>Additional comments : "+addComment);
            out.println("<p>Subscribe : "+news);
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet formServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet formServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
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
