/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.beans;

import com.ps.dao.UsuarioDao;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Andres
 */
@ManagedBean(name = "LoginControl")
@SessionScoped
public class MBLogin implements Serializable {

    private String user;
    private String userid;
    private String pass;
    private Map rol;
    private List<Map<String,?>> links;
    
    /**
     * Creates a new instance of MBLogin
     */
    

    public MBLogin() {
    }

    public String ruta () {
        UsuarioDao us = new UsuarioDao();
        FacesContext context2= FacesContext.getCurrentInstance();
        FacesMessage msg;
        this.rol=us.loginControl(user, pass);
        if (rol!=null) {
            links=us.listaPrivilegios(this.rol.get("IDROL").toString());
            return "index?faces-redirect=true";
        }
        msg= new FacesMessage(FacesMessage.SEVERITY_ERROR,"Mensaje","Usuario o Clave Invalida!!");
        context2.addMessage("growl", msg);
        return "";
    }
 
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Map getRol() {
        return rol;
    }

    public void setRol(Map rol) {
        this.rol = rol;
    }

    public List<Map<String,?>> getLinks() {
        return links;
    }

    public void setLinks(List<Map<String,?>> links) {
        this.links = links;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    
  
}
