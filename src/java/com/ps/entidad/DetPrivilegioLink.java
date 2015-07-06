package com.ps.entidad;
// Generated 01/07/2015 06:18:42 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DetPrivilegioLink generated by hbm2java
 */
@Entity
@Table(name="DET_PRIVILEGIO_LINK"
    ,schema="PROSOCIAL"
)
public class DetPrivilegioLink  implements java.io.Serializable {


     private DetPrivilegioLinkId id;
     private Link link;
     private Privilegio privilegio;

    public DetPrivilegioLink() {
    }

    public DetPrivilegioLink(DetPrivilegioLinkId id, Link link, Privilegio privilegio) {
       this.id = id;
       this.link = link;
       this.privilegio = privilegio;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idlink", column=@Column(name="IDLINK", nullable=false, length=12) ), 
        @AttributeOverride(name="idprivilegio", column=@Column(name="IDPRIVILEGIO", nullable=false, length=12) ) } )
    public DetPrivilegioLinkId getId() {
        return this.id;
    }
    
    public void setId(DetPrivilegioLinkId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDLINK", nullable=false, insertable=false, updatable=false)
    public Link getLink() {
        return this.link;
    }
    
    public void setLink(Link link) {
        this.link = link;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDPRIVILEGIO", nullable=false, insertable=false, updatable=false)
    public Privilegio getPrivilegio() {
        return this.privilegio;
    }
    
    public void setPrivilegio(Privilegio privilegio) {
        this.privilegio = privilegio;
    }




}

