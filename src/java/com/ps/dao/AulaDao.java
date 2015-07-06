/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.dao;

import com.ps.interfaces.InterfaceAula;
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
public class AulaDao implements InterfaceAula {

    private Session session;
    private Transaction trans;
    private String sql;

    @Override
    public List<Map<String, ?>> ListarAula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Map<String, ?>> ListarAulaTutor(String idUsuario) {
        List<Map<String, ?>> lista = new ArrayList<>();
        sql = "SELECT * FROM PSV_AULA\n"
                + "WHERE IDAULA=(SELECT IDAULA \n"
                + "FROM DET_AULA_USUARIO\n"
                + "WHERE IDUSUARIO='"+idUsuario+"')"
                + "AND IDROL='RO-201500002'";
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            trans = session.beginTransaction();
            SQLQuery result = session.createSQLQuery(sql);
            result.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = result.list();
            for (Object obj : data) {
                Map<String, Object> a = (Map<String, Object>) obj;
                lista.add(a);
            }
            trans.commit();
        } catch (Exception e) {
            System.out.println("ERROR -----------" +e);
            trans.rollback();
        }

        return lista;
    }

    @Override
    public boolean crearAula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarAula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarAula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
