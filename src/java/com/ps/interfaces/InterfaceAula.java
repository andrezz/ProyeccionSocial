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
public interface InterfaceAula {
    public List<Map<String,?>> ListarAula();
    public List<Map<String,?>> ListarAulaTutor(String idUsuario);
    public boolean crearAula();
    public boolean editarAula();
    public boolean eliminarAula();
}
