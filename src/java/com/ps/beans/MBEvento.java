/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.beans;

import com.ps.dao.EventoDao;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Andres
 */
@ManagedBean
@RequestScoped
public class MBEvento implements Serializable{
    private List<Map<String,?>> lista;
    private EventoDao ea= new EventoDao();
    private boolean INscrito;
    /**
     * Creates a new instance of MBEvento
     */
    public MBEvento() {
        lista=ea.listarEventos(null);
        INscrito=false;
    }

    public List<Map<String, ?>> getLista() {
        return lista;
    }

    public void setLista(List<Map<String, ?>> lista) {
        this.lista = lista;
    }
    public String cortarFecha(String z){
        return z.substring(0,10);
    }
    public void inscribirse(){
        INscrito=true;
    }

    public boolean isINscrito() {
        return INscrito;
    }

    public void setINscrito(boolean INscrito) {
        this.INscrito = INscrito;
    }
    public String aString(Object z){
        return z.toString();
    }
    
}
