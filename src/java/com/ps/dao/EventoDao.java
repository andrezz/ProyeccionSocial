/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.dao;

import com.ps.interfaces.InterfaceEvento;
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
public class EventoDao implements InterfaceEvento {

    private Session session;
    private Transaction trans;
    private String sql;

    @Override
    public List<Map<String, ?>> listarEventos(String idFacultad) {
        List<Map<String, ?>> Lista = new ArrayList<>();
        sql = "SELECT *FROM EVENTO WHERE ROWNUM='1'";
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            trans = session.beginTransaction();
            SQLQuery result = session.createSQLQuery(sql);
            result.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List list = result.list();
            for (Object obj : list) {
                Map<String, Object> a = (Map<String, Object>) obj;
                Lista.add(a);
            }
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return Lista;
    }

    @Override
    public List<Map<String, ?>> listarEventosPasados(String idFacultad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Map<String, ?>> listarEventosPendientes(String idFacultad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
