/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.vistas;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class Roles implements Serializable{

    String NOMBRE_RO;
    String IDROL;
    String ID_ARCHIVO_FOTO;
    String CODIGO;
    String EMAIL;
    String APELLIDOM_US;
    String APELLIDOP_US;
    String NOMBRE_US;
    String CLAVE;
    String USUARIO;
    String IDUSUARIO;

    public Roles() {
    }

    public Roles(String NOMBRE_RO, String IDROL, String ID_ARCHIVO_FOTO, String CODIGO, String EMAIL, String APELLIDOM_US, String APELLIDOP_US, String NOMBRE_US, String CLAVE, String USUARIO, String IDUSUARIO) {
        this.NOMBRE_RO = NOMBRE_RO;
        this.IDROL = IDROL;
        this.ID_ARCHIVO_FOTO = ID_ARCHIVO_FOTO;
        this.CODIGO = CODIGO;
        this.EMAIL = EMAIL;
        this.APELLIDOM_US = APELLIDOM_US;
        this.APELLIDOP_US = APELLIDOP_US;
        this.NOMBRE_US = NOMBRE_US;
        this.CLAVE = CLAVE;
        this.USUARIO = USUARIO;
        this.IDUSUARIO = IDUSUARIO;
    }

    public String getNOMBRE_RO() {
        return NOMBRE_RO;
    }

    public void setNOMBRE_RO(String NOMBRE_RO) {
        this.NOMBRE_RO = NOMBRE_RO;
    }

    public String getIDROL() {
        return IDROL;
    }

    public void setIDROL(String IDROL) {
        this.IDROL = IDROL;
    }

    public String getID_ARCHIVO_FOTO() {
        return ID_ARCHIVO_FOTO;
    }

    public void setID_ARCHIVO_FOTO(String ID_ARCHIVO_FOTO) {
        this.ID_ARCHIVO_FOTO = ID_ARCHIVO_FOTO;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getAPELLIDOM_US() {
        return APELLIDOM_US;
    }

    public void setAPELLIDOM_US(String APELLIDOM_US) {
        this.APELLIDOM_US = APELLIDOM_US;
    }

    public String getAPELLIDOP_US() {
        return APELLIDOP_US;
    }

    public void setAPELLIDOP_US(String APELLIDOP_US) {
        this.APELLIDOP_US = APELLIDOP_US;
    }

    public String getNOMBRE_US() {
        return NOMBRE_US;
    }

    public void setNOMBRE_US(String NOMBRE_US) {
        this.NOMBRE_US = NOMBRE_US;
    }

    public String getCLAVE() {
        return CLAVE;
    }

    public void setCLAVE(String CLAVE) {
        this.CLAVE = CLAVE;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getIDUSUARIO() {
        return IDUSUARIO;
    }

    public void setIDUSUARIO(String IDUSUARIO) {
        this.IDUSUARIO = IDUSUARIO;
    }
    

}
