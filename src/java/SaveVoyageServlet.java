/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.daoVoyage;
import Database.Database;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import obj.Type_Voyage;
import obj.Voyage;

/**
 *
 * @author Amal
 */
@WebServlet("/VoyagesCrud")
public class SaveVoyageServlet extends HttpServlet {

    Database db = new Database();

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
            String Respo_name = request.getParameter("Respo_name");
            String Voyage_name = request.getParameter("Voyage_name");
            String Description = request.getParameter("Description");
            String Ville = request.getParameter("Ville");
            String Date = request.getParameter("Date");
            Double Prix = Double.parseDouble(request.getParameter("Prix"));
            String Type = request.getParameter("Type");
            String Photo = request.getParameter("Photo");
            Voyage V = new Voyage(Respo_name, Voyage_name, Description, Ville, Date, Prix, Type_Voyage.Camping, Photo);

            daoVoyage daoV = new daoVoyage(this.db);
            boolean status = daoV.create(V);
            if (status) {
                 HttpSession session = request.getSession();
                session.setAttribute("msg", "Voyage Enregistrer!");
                request.getRequestDispatcher("/VoyageServlet").include(request, response);
            } else {
                out.println("Sorry! unable to save record");
            }

            out.close();
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
        String Respo_name = request.getParameter("Respo_name");
        String Voyage_name = request.getParameter("Voyage_name");
        String Description = request.getParameter("Description");
        String Ville = request.getParameter("Ville");
        String Date = request.getParameter("Date");
        String Prix = request.getParameter("Prix");
        String Type = request.getParameter("Type");
        String Photo = request.getParameter("Photo");
        HttpSession session = request.getSession();
        session.setAttribute("Respo_name", Respo_name);
        session.setAttribute("Voyage_name", Voyage_name);
        session.setAttribute("Description", Description);
        session.setAttribute("Ville", Ville);
        session.setAttribute("Date", Date);
        session.setAttribute("Prix", Prix);
        session.setAttribute("Type", Type);
        session.setAttribute("Photo", Photo);
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
