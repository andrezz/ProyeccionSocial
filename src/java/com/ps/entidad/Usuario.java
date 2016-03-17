package com.ps.entidad;
// Generated 17/03/2016 11:27:41 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="USUARIO"
    ,schema="PROSOCIAL"
)
public class Usuario  implements java.io.Serializable {


     private String idusuario;
     private String nombreUs;
     private String apellidopUs;
     private String apellidomUs;
     private String usuario;
     private String clave;
     private String email;
     private char estadoUs;
     private String codigo;
     private String idArchivoFoto;
     private Set asistencias = new HashSet(0);
     private Set inscripcions = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String idusuario, String nombreUs, String apellidopUs, String apellidomUs, String usuario, String clave, char estadoUs) {
        this.idusuario = idusuario;
        this.nombreUs = nombreUs;
        this.apellidopUs = apellidopUs;
        this.apellidomUs = apellidomUs;
        this.usuario = usuario;
        this.clave = clave;
        this.estadoUs = estadoUs;
    }
    public Usuario(String idusuario, String nombreUs, String apellidopUs, String apellidomUs, String usuario, String clave, String email, char estadoUs, String codigo, String idArchivoFoto, Set asistencias, Set inscripcions) {
       this.idusuario = idusuario;
       this.nombreUs = nombreUs;
       this.apellidopUs = apellidopUs;
       this.apellidomUs = apellidomUs;
       this.usuario = usuario;
       this.clave = clave;
       this.email = email;
       this.estadoUs = estadoUs;
       this.codigo = codigo;
       this.idArchivoFoto = idArchivoFoto;
       this.asistencias = asistencias;
       this.inscripcions = inscripcions;
    }
   
     @Id 

    
    @Column(name="IDUSUARIO", unique=true, nullable=false, length=12)
    public String getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    
    @Column(name="NOMBRE_US", nullable=false, length=30)
    public String getNombreUs() {
        return this.nombreUs;
    }
    
    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    
    @Column(name="APELLIDOP_US", nullable=false, length=15)
    public String getApellidopUs() {
        return this.apellidopUs;
    }
    
    public void setApellidopUs(String apellidopUs) {
        this.apellidopUs = apellidopUs;
    }

    
    @Column(name="APELLIDOM_US", nullable=false, length=15)
    public String getApellidomUs() {
        return this.apellidomUs;
    }
    
    public void setApellidomUs(String apellidomUs) {
        this.apellidomUs = apellidomUs;
    }

    
    @Column(name="USUARIO", nullable=false, length=15)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="CLAVE", nullable=false, length=15)
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }

    
    @Column(name="EMAIL", length=35)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="ESTADO_US", nullable=false, length=1)
    public char getEstadoUs() {
        return this.estadoUs;
    }
    
    public void setEstadoUs(char estadoUs) {
        this.estadoUs = estadoUs;
    }

    
    @Column(name="CODIGO", length=10)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="ID_ARCHIVO_FOTO", length=12)
    public String getIdArchivoFoto() {
        return this.idArchivoFoto;
    }
    
    public void setIdArchivoFoto(String idArchivoFoto) {
        this.idArchivoFoto = idArchivoFoto;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getAsistencias() {
        return this.asistencias;
    }
    
    public void setAsistencias(Set asistencias) {
        this.asistencias = asistencias;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getInscripcions() {
        return this.inscripcions;
    }
    
    public void setInscripcions(Set inscripcions) {
        this.inscripcions = inscripcions;
    }




}


