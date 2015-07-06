package com.ps.entidad;
// Generated 01/07/2015 06:18:42 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Archivo generated by hbm2java
 */
@Entity
@Table(name="ARCHIVO"
    ,schema="PROSOCIAL"
)
public class Archivo  implements java.io.Serializable {


     private String idarchivo;
     private Evento evento;
     private String linkAr;
     private String nombreAr;
     private BigDecimal bytes;
     private String usuarioCre;
     private String usuarioMod;
     private Date fechaCre;
     private Date fechaMod;

    public Archivo() {
    }

	
    public Archivo(String idarchivo, Evento evento, String linkAr, String nombreAr, BigDecimal bytes, String usuarioCre, Date fechaCre) {
        this.idarchivo = idarchivo;
        this.evento = evento;
        this.linkAr = linkAr;
        this.nombreAr = nombreAr;
        this.bytes = bytes;
        this.usuarioCre = usuarioCre;
        this.fechaCre = fechaCre;
    }
    public Archivo(String idarchivo, Evento evento, String linkAr, String nombreAr, BigDecimal bytes, String usuarioCre, String usuarioMod, Date fechaCre, Date fechaMod) {
       this.idarchivo = idarchivo;
       this.evento = evento;
       this.linkAr = linkAr;
       this.nombreAr = nombreAr;
       this.bytes = bytes;
       this.usuarioCre = usuarioCre;
       this.usuarioMod = usuarioMod;
       this.fechaCre = fechaCre;
       this.fechaMod = fechaMod;
    }
   
     @Id 

    
    @Column(name="IDARCHIVO", unique=true, nullable=false, length=12)
    public String getIdarchivo() {
        return this.idarchivo;
    }
    
    public void setIdarchivo(String idarchivo) {
        this.idarchivo = idarchivo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDEVENTO", nullable=false)
    public Evento getEvento() {
        return this.evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    
    @Column(name="LINK_AR", nullable=false)
    public String getLinkAr() {
        return this.linkAr;
    }
    
    public void setLinkAr(String linkAr) {
        this.linkAr = linkAr;
    }

    
    @Column(name="NOMBRE_AR", nullable=false, length=30)
    public String getNombreAr() {
        return this.nombreAr;
    }
    
    public void setNombreAr(String nombreAr) {
        this.nombreAr = nombreAr;
    }

    
    @Column(name="BYTES", nullable=false, precision=22, scale=0)
    public BigDecimal getBytes() {
        return this.bytes;
    }
    
    public void setBytes(BigDecimal bytes) {
        this.bytes = bytes;
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

