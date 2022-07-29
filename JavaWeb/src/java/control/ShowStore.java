/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dbcontext.DBUtil;
import entity.News;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "ShowStore", urlPatterns = {"/ShowStore"})
public class ShowStore extends HttpServlet {

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
        ArrayList<Product> productArray = new ArrayList<Product>();
        ArrayList<Product> lastestProductArray = new ArrayList<Product>();

        DBUtil dbutil = new DBUtil().getInstance();
        try {
            Connection con = dbutil.getConnection();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Products");

            while (rs.next()) {
                int idProduct = rs.getInt("idproduct");
                int idAdmin = rs.getInt("idadmin");
                int idPrt = rs.getInt("idprt");
                String name = rs.getString("name");
                String des = rs .getString("description");
                int quantity = rs.getInt("quantity");
                int price = rs.getInt("price");
                String color = rs.getString("color");
                String size = rs.getString("size");

                productArray.add(new Product(idProduct, idAdmin, idPrt, name, des, quantity, price, color, size));

              }
            
            rs = statement.executeQuery("SELECT TOP 3 * FROM Products ORDER BY idproduct DESC;");
            while(rs.next()) {
                int idProduct = rs.getInt("idproduct");
                int idAdmin = rs.getInt("idadmin");
                int idPrt = rs.getInt("idprt");
                String name = rs.getString("name");
                String des = rs .getString("description");
                int quantity = rs.getInt("quantity");
                int price = rs.getInt("price");
                String color = rs.getString("color");
                String size = rs.getString("size");

                lastestProductArray.add(new Product(idProduct, idAdmin, idPrt, name, des, quantity, price, color, size));
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/store.jsp");
        request.setAttribute("productArray",productArray);
        request.setAttribute("lastestProductArray", lastestProductArray);
        dispatcher.forward(request, response);
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
