/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.ClienteDAO;
/**
 *
 * @author ayoro
 */
public class ServletListarC extends HttpServlet {
    private ClienteDAO cliente;
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
            this.cliente = ClienteDAO.getClienteDAO();
            long cont = 2808;
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletListarC</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table>");

            out.println("<tr>");
            out.println("<td>Cedula</td>");
            out.println("<td>Nombre</td>");
            out.println("<td>correo</td>");
            out.println("<td>Telefono</td>");
            out.println("</tr>");
            System.out.println("Tamaño: "+this.cliente.getTamanoLista());
            if (this.cliente.getTamanoLista() > 0) {
                for (int i = 2808; i < this.cliente.getTamanoLista(); i+=88) {
                    out.println("<tr>");
                    out.println("<td>"+this.cliente.leerEntero(cont)+"</td>");
                    cont += 4;
                    char name [] = this.cliente.leerChars(cont);
                    out.println("<td>");
                    for (int j = 0; j < 20; j++) {
                        out.print(name[j]);
                    }
                    out.println("</td>");
                    cont += 40;
                    char correo [] = this.cliente.leerChars(cont);
                    out.println("<td>");
                    for (int j = 0; j < 20; j++) {
                        out.print(correo[j]);
                    }
                    out.println("</td>");
                    cont+=40;
                    out.println("<td>"+this.cliente.leerEntero(cont)+"</td>");
                    cont+=4;
                    out.println("</tr>");
                }
            }
            
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
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