/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringPrueba.Desafio3.entites;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fabio
 */
@Repository
public class clienteDaoImp implements clienteDaoI {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void insert(cliente entity) {
        Session currentSession = entityManager.unwrap(Session.class);

        // insert
        currentSession.save(entity);
    }

    @Override
    @Transactional
    public List<cliente> buscarTodo() {
        // Abrir sesión
        Session session = entityManager.unwrap(Session.class);

        // Búsqueda
        List<cliente> list = session.createQuery("FROM cliente").list();

        return list;
    }

    @Override
    @Transactional
    public cliente buscarId(long id) {
        // Abrir sesión
        Session currentSession = entityManager.unwrap(Session.class);

        // Búsqueda por id
        cliente result = currentSession.get(cliente.class, id);

        return result;
    }

}
