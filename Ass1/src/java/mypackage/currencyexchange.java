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
 * @author My Pc
 */
@WebServlet(name = "currencyexchange", urlPatterns = {"/currencyexchange"})
public class currencyexchange extends HttpServlet {
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
            
            String vnd = request.getParameter("vnd");
          
            double vndValue = Double.parseDouble(request.getParameter("vnd"));
            
            double vndResult = 0;
            String countryCurrency = request.getParameter("RadioButton");
            
             if(countryCurrency.equalsIgnoreCase("USD")){
                 vndResult = (vndValue*16452);
                 
             }else if(countryCurrency.equalsIgnoreCase("EUR")){
                 vndResult = (vndValue*25170.38);
                 
             }else if (countryCurrency.equalsIgnoreCase("JPY")){
                 vndResult = (vndValue*151.23);
  
             }
            
            out.println("<title>Currency Exchange Calculator</title>");
            out.println("<h1>Currency Exchange Calculator</h1>");
            out.println("<p>Country Exchange Currency :"+countryCurrency);
            out.println("<p>Country Exchange Result   :"+vndResult);
            
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet currencyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet currencyServlet at " + request.getContextPath() + "</h1>");
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