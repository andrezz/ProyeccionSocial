package com.ps.entidad;
// Generated 01/07/2015 06:18:42 AM by Hibernate Tools 4.3.1


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
 * Inscripcion generated by hbm2java
 */
@Entity
@Table(name="INSCRIPCION"
    ,schema="PROSOCIAL"
)
public class Inscripcion  implements java.io.Serializable {


     private String idinscripcion;
     private Evento evento;
     private Usuario usuario;
     private char estadoIn;
     private String usuarioCre;
     private String usuarioMod;
     private Date fechaCre;
     private Date fechaMod;

    public Inscripcion() {
    }

	
    public Inscripcion(String idinscripcion, Evento evento, Usuario usuario, char estadoIn, String usuarioCre, Date fechaCre) {
        this.idinscripcion = idinscripcion;
        this.evento = evento;
        this.usuario = usuario;
        this.estadoIn = estadoIn;
        this.usuarioCre = usuarioCre;
        this.fechaCre = fechaCre;
    }
    public Inscripcion(String idinscripcion, Evento evento, Usuario usuario, char estadoIn, String usuarioCre, String usuarioMod, Date fechaCre, Date fechaMod) {
       this.idinscripcion = idinscripcion;
       this.evento = evento;
       this.usuario = usuario;
       this.estadoIn = estadoIn;
       this.usuarioCre = usuarioCre;
       this.usuarioMod = usuarioMod;
       this.fechaCre = fechaCre;
       this.fechaMod = fechaMod;
    }
   
     @Id 

    
    @Column(name="IDINSCRIPCION", unique=true, nullable=false, length=12)
    public String getIdinscripcion() {
        return this.idinscripcion;
    }
    
    public void setIdinscripcion(String idinscripcion) {
        this.idinscripcion = idinscripcion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDEVENTO", nullable=false)
    public Evento getEvento() {
        return this.evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDUSUARIO", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="ESTADO_IN", nullable=false, length=1)
    public char getEstadoIn() {
        return this.estadoIn;
    }
    
    public void setEstadoIn(char estadoIn) {
        this.estadoIn = estadoIn;
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


