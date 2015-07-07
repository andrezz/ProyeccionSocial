/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.interfaces;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Andres
 */
public interface InterfaceEvento {
    public List<Map<String,?>> listarEventos(String idFacultad);
    public List<Map<String,?>> listarEventosPasados(String idFacultad);
    public List<Map<String,?>> listarEventosPendientes(String idFacultad);
}
