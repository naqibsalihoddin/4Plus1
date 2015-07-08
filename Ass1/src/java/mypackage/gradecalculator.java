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
@WebServlet(name = "gradeServlet", urlPatterns = {"/gradeServlet"})
public class gradecalculator extends HttpServlet {
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
            
        String midTextBox = request.getParameter("midTextBox");
        String finalTextBox = request.getParameter("finalTextBox");
        String projectTextBox = request.getParameter("projectTextBox");   
        
        
        double midInput = Double.parseDouble(request.getParameter("midTextBox"));
        double finalInput = Double.parseDouble(request.getParameter("finalTextBox"));
        double projectInput = Double.parseDouble(request.getParameter("projectTextBox"));
        
        double midAfterCalc = midInput*30/100;
        double finalAfterCalc = finalInput*30/100;
        double projectAfterCalc = projectInput*40/100;
         
        double resultFinal = midAfterCalc+finalAfterCalc+projectAfterCalc;
        
        String markGrade = "";
        String result = "";
        int point = 0;
            
        if(resultFinal>=0 && resultFinal<=59) {
                   markGrade = "F";
                   point = 0;
                   result = "Fail";
                  
            }else if(resultFinal>=60 && resultFinal<=69) {
                   markGrade = "D";
                   point = 1;
                   result = "Pass";
                     
            }else if(resultFinal>=70 && resultFinal<=79) {
                   markGrade = "C";
                   point = 2;
                   result = "Pass";
            
            }else if(resultFinal>=80 && resultFinal<=89) {
                   markGrade = "B";
                   point = 3;
                   result = "Pass";
                   
            }else if(resultFinal>=90 && resultFinal<=100) {
                   markGrade = "A";
                   point = 4;
                   result = "Pass";
            }
        
            out.println("</body>Average : "+resultFinal);
            out.println("<p>Grade : " + markGrade);
            out.println("<p>Point : " + point);
            out.println("<p>Result : " + result);
            
            
            
            
            
         
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