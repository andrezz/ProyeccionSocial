/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.beans;

import com.ps.dao.AulaDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Andres
 */
@ManagedBean
@RequestScoped
public class MBAula implements Serializable{
    private List<Map<String,?>> lista;
    private List<Map<String,?>> listaAlumno;
    private List<Map<String,?>> listaDocente;
    private List<Map<String,?>> listaTutor;
    private String ciclo;
    private String escuela;
    private AulaDao au=new AulaDao();
    /**
     * Creates a new instance of MBAula
     */
    public MBAula() {
        FacesContext context= FacesContext.getCurrentInstance();
        HttpSession session=(HttpSession) context.getExternalContext().getSession(false);
        MBLogin lg= (MBLogin) session.getAttribute("LoginControl");
        String idUser=lg.getRol().get("IDUSUARIO").toString();
        lista=au.ListarAulaTutor(idUser);
        filtarAlumno();
        escuela=lista.get(0).get("NOMBRE_ES").toString();
    }

    public List<Map<String, ?>> getLista() {
        return lista;
    }

    public void setLista(List<Map<String, ?>> lista) {
        this.lista = lista;
    }
    
    private void filtarAlumno(){
        listaAlumno= new ArrayList<>();
        for(Map<String,?> obj: lista){
            if (obj.get("IDROL").toString().equals("RO-201500002")) {
                listaAlumno.add(obj);
            }            
        }
    }

    public List<Map<String, ?>> getListaAlumno() {
        return listaAlumno;
    }
    

    public void setListaAlumno(List<Map<String, ?>> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

    public List<Map<String, ?>> getListaDocente() {
        return listaDocente;
    }

    public void setListaDocente(List<Map<String, ?>> listaDocente) {
        this.listaDocente = listaDocente;
    }

    public List<Map<String, ?>> getListaTutor() {
        return listaTutor;
    }

    public void setListaTutor(List<Map<String, ?>> listaTutor) {
        this.listaTutor = listaTutor;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    
}
