package com.ps.entidad;
// Generated 17/03/2016 11:27:41 AM by Hibernate Tools 4.3.1


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
 * Asistencia generated by hbm2java
 */
@Entity
@Table(name="ASISTENCIA"
    ,schema="PROSOCIAL"
)
public class Asistencia  implements java.io.Serializable {


     private String idasistencia;
     private Usuario usuario;
     private Evento evento;
     private Date fechaAs;
     private BigDecimal horasPs;
     private BigDecimal notaAl;
     private String usuarioCre;
     private String usuarioMod;
     private Date fechaCre;
     private Date fechaMod;

    public Asistencia() {
    }

	
    public Asistencia(String idasistencia, Usuario usuario, Evento evento, Date fechaAs, BigDecimal horasPs, BigDecimal notaAl, String usuarioCre, Date fechaCre) {
        this.idasistencia = idasistencia;
        this.usuario = usuario;
        this.evento = evento;
        this.fechaAs = fechaAs;
        this.horasPs = horasPs;
        this.notaAl = notaAl;
        this.usuarioCre = usuarioCre;
        this.fechaCre = fechaCre;
    }
    public Asistencia(String idasistencia, Usuario usuario, Evento evento, Date fechaAs, BigDecimal horasPs, BigDecimal notaAl, String usuarioCre, String usuarioMod, Date fechaCre, Date fechaMod) {
       this.idasistencia = idasistencia;
       this.usuario = usuario;
       this.evento = evento;
       this.fechaAs = fechaAs;
       this.horasPs = horasPs;
       this.notaAl = notaAl;
       this.usuarioCre = usuarioCre;
       this.usuarioMod = usuarioMod;
       this.fechaCre = fechaCre;
       this.fechaMod = fechaMod;
    }
   
     @Id 

    
    @Column(name="IDASISTENCIA", unique=true, nullable=false, length=12)
    public String getIdasistencia() {
        return this.idasistencia;
    }
    
    public void setIdasistencia(String idasistencia) {
        this.idasistencia = idasistencia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDUSUARIO", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDEVENTO", nullable=false)
    public Evento getEvento() {
        return this.evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_AS", nullable=false, length=7)
    public Date getFechaAs() {
        return this.fechaAs;
    }
    
    public void setFechaAs(Date fechaAs) {
        this.fechaAs = fechaAs;
    }

    
    @Column(name="HORAS_PS", nullable=false, precision=22, scale=0)
    public BigDecimal getHorasPs() {
        return this.horasPs;
    }
    
    public void setHorasPs(BigDecimal horasPs) {
        this.horasPs = horasPs;
    }

    
    @Column(name="NOTA_AL", nullable=false, precision=22, scale=0)
    public BigDecimal getNotaAl() {
        return this.notaAl;
    }
    
    public void setNotaAl(BigDecimal notaAl) {
        this.notaAl = notaAl;
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


