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
public interface InterfaceUsuario {
    public Map loginControl(String user, String pass);
    public List<Map<String,?>> listaPrivilegios(String idRol);
}
