/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.servlet;

import com.google.gson.Gson;
import com.ps.beans.MBLogin;
import com.ps.dao.AulaDao;
import com.ps.dao.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres
 */
public class Validar extends HttpServlet {
    UsuarioDao ud = new UsuarioDao();
    AulaDao ad= new AulaDao();

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
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Map<String, Object> rpta = new HashMap<>();
        
        String opc = request.getParameter("opc");
        try {
            if (opc.equals("valida")) {
                String user = request.getParameter("usuario");
                String clave = request.getParameter("clave");
                if (validarDato(user) && validarDato(clave)) {
                    if (ud.loginControl(user, clave) != null) {
                            out.println("1");
                        }else{
                            out.println("0");
                        }
                }
            }
            if (opc.equals("getUserData")) {
                String user = request.getParameter("usuario");
                String clave = request.getParameter("clave");
                if (validarDato(user) && validarDato(clave)) {
                    Map<String, Object> lista=ud.loginControl(user, clave);
                    if (lista!=null) {
                       rpta.put("rol",lista);
                    writeJson(out, rpta); 
                    }else{
                     out.write("0");   
                    }
                }else{
                    out.write("0"); 
                }
            }
            if(opc.equals("getAulaData")){
                String iduser=request.getParameter("iduser");
                if (validarDato(iduser)) {
                    List<Map<String,?>> lista=ad.ListarAulaTutor(iduser);
                    if(lista!=null){
                        rpta.put("aula", lista);
                        writeJson(out, rpta);
                    }else{
                        out.write("0");
                    }
                }else{
                    out.write("0");
                }
            }
            

            /* TODO output your page here. You may use following sample code. */
        } catch (Exception e) {
            e.printStackTrace(out);
        }
        
    }
    public void writeJson(PrintWriter out, Map<String,Object> rpta){
        Gson gson = new Gson();
        out.println(gson.toJson(rpta));
        out.flush();
        out.close();
    }
    public boolean validarDato(String d){
        if (d!=null) {
            if (!d.equals("")) {
                return true;
            }
        }
        return false;
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
