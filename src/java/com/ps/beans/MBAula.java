/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.beans;

import com.ps.dao.AulaDao;
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
public class MBAula {
    private List<Map<String,?>> lista;
    private AulaDao au=new AulaDao();
    /**
     * Creates a new instance of MBAula
     */
    public MBAula() {
    }

    public List<Map<String, ?>> getLista(String idUsuario) {
        lista=au.ListarAulaTutor(idUsuario);
        return lista;
    }

    public void setLista(List<Map<String, ?>> lista) {
        this.lista = lista;
    }
    
    
}
