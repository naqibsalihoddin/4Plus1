/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nabila
 */
@WebServlet(name = "TUITIONServlet", urlPatterns = {"/TUITIONServlet"})
public class Tuitionservlet extends HttpServlet {

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
            
            String aasTextBox = request.getParameter("aasTextBox");
            String eslTextBox = request.getParameter("eslTextBox");
            String drop = request.getParameter("discountRateSelectBox");
            
            
            double a = Double.parseDouble(aasTextBox);
            double e = Double.parseDouble(eslTextBox);
            
            double resultAAS = a*120;
            double resultESL = e*75;
            double r = resultAAS+resultESL;
            double total =0;
            
            
            if(drop.equals("Normal")){
                out.println("TOTAL IS " +r);
            }
            else if(drop.equals("10")){
                total = ((r)-r*10/100);
                out.println("TOTAL IS " +total);
            }
            else if(drop.equals("20")){
                total = ((r)-r*20/100);
                out.println("TOTAL IS " +total);
            }
            else if(drop.equals("30")){
                total = ((r)-r*30/100);
                out.println("TOTAL IS " +total);
            }
            else
                out.println("ERROR IN CHOICE");
            
            
            
            
            
            
            
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
