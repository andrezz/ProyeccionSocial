package com.ps.entidad;
// Generated 01/07/2015 06:18:42 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetUsuarioRolId generated by hbm2java
 */
@Embeddable
public class DetUsuarioRolId  implements java.io.Serializable {


     private String idrol;
     private String idusuario;

    public DetUsuarioRolId() {
    }

    public DetUsuarioRolId(String idrol, String idusuario) {
       this.idrol = idrol;
       this.idusuario = idusuario;
    }
   


    @Column(name="IDROL", nullable=false, length=12)
    public String getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(String idrol) {
        this.idrol = idrol;
    }


    @Column(name="IDUSUARIO", nullable=false, length=12)
    public String getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetUsuarioRolId) ) return false;
		 DetUsuarioRolId castOther = ( DetUsuarioRolId ) other; 
         
		 return ( (this.getIdrol()==castOther.getIdrol()) || ( this.getIdrol()!=null && castOther.getIdrol()!=null && this.getIdrol().equals(castOther.getIdrol()) ) )
 && ( (this.getIdusuario()==castOther.getIdusuario()) || ( this.getIdusuario()!=null && castOther.getIdusuario()!=null && this.getIdusuario().equals(castOther.getIdusuario()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdrol() == null ? 0 : this.getIdrol().hashCode() );
         result = 37 * result + ( getIdusuario() == null ? 0 : this.getIdusuario().hashCode() );
         return result;
   }   


}


