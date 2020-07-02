
import DAO.daoVoyage;
import Database.Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import obj.Type_Voyage;
import obj.Voyage;

/**
 *
 * @author Amal
 */
public class ViewVoyageServlet extends HttpServlet {

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
            daoVoyage daoV = new daoVoyage(this.db);
            ResultSet Voyages = daoV.all();
            List<Voyage> ListVoyage = new ArrayList<Voyage>();
            try {
                while (Voyages.next()) {
                    obj.Voyage V = new Voyage(
                            Voyages.getString(1),
                            Voyages.getString(2),
                            Voyages.getString(3),
                            Voyages.getString(4),
                            Voyages.getString(5),
                            Voyages.getString(6),
                            Voyages.getDouble(7),
                            Type_Voyage.Auto_tour,
                            //Type_Voyage.valueOf(Voyages.getString(8)), 
                            Voyages.getString(9));
                    System.out.println("===============================");
                    System.out.println(V);
                    ListVoyage.add(V);

                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewVoyageServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("ListVoyage", ListVoyage);
            RequestDispatcher rd = request.getRequestDispatcher("VoyagesCrud.jsp");
            rd.forward(request, response);
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
