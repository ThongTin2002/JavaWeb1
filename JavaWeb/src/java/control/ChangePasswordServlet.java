/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.UsersDao;
import dbcontext.DBUtil;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "ChangePasswordServlet", urlPatterns = {"/ChangePassword"})
public class ChangePasswordServlet extends HttpServlet {

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
        int iduser = Integer.parseInt(request.getParameter("iduser"));
        String password = request.getParameter("password");
        String newpassword = request.getParameter("newpassword");
        String repeatpassword = request.getParameter("repeatpassword");
//        Users user =  (Users)request.getAttribute("user_acc");
        if (!newpassword.equals(repeatpassword)) {
            response.sendRedirect("changepass.jsp");
        } else {
//            UsersDao dao = new UsersDao();
//            Users us = dao.checkId(iduser);
//            if (us != null) {
//                
//                //kiem tra neu mat khau cu khong dung voi csdl thi bat nhap lai
//                if(!password.equals(dao)){
//                    System.out.println("sai");
//                    response.sendRedirect("changepass.jsp");
//                }
//                
//                dao.changePassword(new Users(iduser, password, newpassword, repeatpassword));
//                response.sendRedirect("login");
//            } else {
//                response.sendRedirect("changepass.jsp");
//            }

            DBUtil db = DBUtil.getInstance();
            try {
                Connection con = db.getConnection();
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM Users WHERE iduser=" + iduser + "");

                while (rs.next()) {
                    String oldPassword = rs.getString("password");
                    if (!password.equals(oldPassword)) {
                        response.sendRedirect("changepass.jsp");
                    } else {
                        UsersDao dao = new UsersDao();
                        Users us = dao.checkId(iduser);
                        if (us != null) {
                            dao.changePassword(new Users(iduser, password, newpassword, repeatpassword));
                            response.sendRedirect("login");
                        } else {
                            response.sendRedirect("changepass.jsp");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

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
