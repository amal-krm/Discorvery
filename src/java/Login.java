/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Amal
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final long serialVersionUID = -4319076288258537575L;

    @Override
    public void init() throws ServletException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("login", "");
        request.setAttribute("password", "");
        request.setAttribute("errorMessage", "");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("txtLogin");
        String password = request.getParameter("txtPassword");
        request.setAttribute("login", login);
        request.setAttribute("password", password);
        if ((login.equals("user")) && password.equals("user")) {
            HttpSession session = request.getSession(true);
            session.setAttribute("connectedUser", "user");
            request.getRequestDispatcher("/User/").forward(request, response);

        } else {
            if ((login.equals("admin")) && password.equals("admin")) {
                HttpSession session = request.getSession(true);
                session.setAttribute("connectedUser", "user");
                request.getRequestDispatcher("/Admin/index.jsp").forward(request, response);
            } else {
                request.setAttribute("errorMessage", "Mot de passe ou email incorrect");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
