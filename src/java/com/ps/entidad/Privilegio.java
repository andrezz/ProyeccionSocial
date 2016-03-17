package com.ps.entidad;
// Generated 17/03/2016 11:27:41 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Privilegio generated by hbm2java
 */
@Entity
@Table(name="PRIVILEGIO"
    ,schema="PROSOCIAL"
)
public class Privilegio  implements java.io.Serializable {


     private String idprivilegio;
     private String nombrePr;
     private char estadoPr;
     private String usuarioCre;
     private String usuarioMod;
     private Date fechaCre;
     private Date fechaMod;

    public Privilegio() {
    }

	
    public Privilegio(String idprivilegio, String nombrePr, char estadoPr, String usuarioCre, Date fechaCre) {
        this.idprivilegio = idprivilegio;
        this.nombrePr = nombrePr;
        this.estadoPr = estadoPr;
        this.usuarioCre = usuarioCre;
        this.fechaCre = fechaCre;
    }
    public Privilegio(String idprivilegio, String nombrePr, char estadoPr, String usuarioCre, String usuarioMod, Date fechaCre, Date fechaMod) {
       this.idprivilegio = idprivilegio;
       this.nombrePr = nombrePr;
       this.estadoPr = estadoPr;
       this.usuarioCre = usuarioCre;
       this.usuarioMod = usuarioMod;
       this.fechaCre = fechaCre;
       this.fechaMod = fechaMod;
    }
   
     @Id 

    
    @Column(name="IDPRIVILEGIO", unique=true, nullable=false, length=12)
    public String getIdprivilegio() {
        return this.idprivilegio;
    }
    
    public void setIdprivilegio(String idprivilegio) {
        this.idprivilegio = idprivilegio;
    }

    
    @Column(name="NOMBRE_PR", nullable=false, length=35)
    public String getNombrePr() {
        return this.nombrePr;
    }
    
    public void setNombrePr(String nombrePr) {
        this.nombrePr = nombrePr;
    }

    
    @Column(name="ESTADO_PR", nullable=false, length=1)
    public char getEstadoPr() {
        return this.estadoPr;
    }
    
    public void setEstadoPr(char estadoPr) {
        this.estadoPr = estadoPr;
    }

    
    @Column(name="USUARIO_CRE", nullable=false, length=12)
    public String getUsuarioCre() {
        return this.usuarioCre;
    }
    
    public void setUsuarioCre(String usuarioCre) {
        this.usuarioCre = usuarioCre;
    }

    
    @Column(name="USUARIO_MOD", length=12)
    public String getUsuarioMod() {
        return this.usuarioMod;
    }
    
    public void setUsuarioMod(String usuarioMod) {
        this.usuarioMod = usuarioMod;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_CRE", nullable=false, length=7)
    public Date getFechaCre() {
        return this.fechaCre;
    }
    
    public void setFechaCre(Date fechaCre) {
        this.fechaCre = fechaCre;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_MOD", length=7)
    public Date getFechaMod() {
        return this.fechaMod;
    }
    
    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }




}


