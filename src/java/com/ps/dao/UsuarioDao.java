/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.dao;

import com.ps.entidad.Usuario;
import com.ps.interfaces.InterfaceUsuario;
import com.ps.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Andres
 */
public class UsuarioDao implements InterfaceUsuario {

    private Session session;
    private Transaction trans;
    private String sql;

    @Override
    public Map loginControl(String user, String pass) {
        sql = "SELECT * FROM PSV_ROLES WHERE usuario='" + user + "' AND clave='" + pass + "'";
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            trans = session.beginTransaction();
            SQLQuery result = session.createSQLQuery(sql);
            result.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            Object data = result.uniqueResult();
            Map row = (Map) data;
            trans.commit();
            return row;

        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
            return null;
        }
    }

    @Override
    public List<Usuario> listarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Map<String,?>> listaPrivilegios(String idRol) {
        List<Map<String,?>> Lista = new ArrayList<>();
        sql = "SELECT * FROM PSV_LINKS WHERE IDROL='"+idRol+"'";
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            trans = session.beginTransaction();
            SQLQuery result = session.createSQLQuery(sql);
            result.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List list = result.list();
            for(Object obj:list){
                Map<String,Object> a= (Map<String,Object>)obj;
                Lista.add(a);
            }
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return Lista;
    }

}
