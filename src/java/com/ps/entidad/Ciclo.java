package com.ps.entidad;
// Generated 17/03/2016 11:27:41 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ciclo generated by hbm2java
 */
@Entity
@Table(name="CICLO"
    ,schema="PROSOCIAL"
)
public class Ciclo  implements java.io.Serializable {


     private String idciclo;
     private String nombreCi;
     private Character estadoCi;
     private Date fechaInicio;
     private Date fechaFin;
     private String usuarioCre;
     private String usuarioMod;
     private Date fechaCre;
     private Date fechaMod;
     private Set aulas = new HashSet(0);

    public Ciclo() {
    }

	
    public Ciclo(String idciclo) {
        this.idciclo = idciclo;
    }
    public Ciclo(String idciclo, String nombreCi, Character estadoCi, Date fechaInicio, Date fechaFin, String usuarioCre, String usuarioMod, Date fechaCre, Date fechaMod, Set aulas) {
       this.idciclo = idciclo;
       this.nombreCi = nombreCi;
       this.estadoCi = estadoCi;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.usuarioCre = usuarioCre;
       this.usuarioMod = usuarioMod;
       this.fechaCre = fechaCre;
       this.fechaMod = fechaMod;
       this.aulas = aulas;
    }
   
     @Id 

    
    @Column(name="IDCICLO", unique=true, nullable=false, length=12)
    public String getIdciclo() {
        return this.idciclo;
    }
    
    public void setIdciclo(String idciclo) {
        this.idciclo = idciclo;
    }

    
    @Column(name="NOMBRE_CI", length=10)
    public String getNombreCi() {
        return this.nombreCi;
    }
    
    public void setNombreCi(String nombreCi) {
        this.nombreCi = nombreCi;
    }

    
    @Column(name="ESTADO_CI", length=1)
    public Character getEstadoCi() {
        return this.estadoCi;
    }
    
    public void setEstadoCi(Character estadoCi) {
        this.estadoCi = estadoCi;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_INICIO", length=7)
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_FIN", length=7)
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    @Column(name="USUARIO_CRE", length=12)
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
    @Column(name="FECHA_CRE", length=7)
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="ciclo")
    public Set getAulas() {
        return this.aulas;
    }
    
    public void setAulas(Set aulas) {
        this.aulas = aulas;
    }




}


