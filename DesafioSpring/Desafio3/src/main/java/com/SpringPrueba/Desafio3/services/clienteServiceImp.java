/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringPrueba.Desafio3.services;

import com.SpringPrueba.Desafio3.entites.cliente;
import com.SpringPrueba.Desafio3.entites.clienteDaoI;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fabio
 */

@Service
public class clienteServiceImp implements clienteServiceI {

    @Autowired
    private clienteDaoI clientDaoI;

    @Override
    @Transactional
    public void insert(cliente entity) {
        clientDaoI.insert(entity);
    }

    @Override
    @Transactional
    public void buscarTodo() {
        final List<cliente> clientList = clientDaoI.buscarTodo();
        System.out.println("\n----------------------- LISTA DE CLIENTES --------------------------\n");
        if (clientList.size() > 0) {
            for (cliente client : clientList) {
                System.out.println(client.toString());
            }
        } else {
            System.out.println("No existen clientes");
        }
        System.out.println("-------------------------------------------------");

    }

    @Override
    @Transactional
    public void buscarId(long id) {
       
		final cliente client = clientDaoI.buscarId(id);

		if (client != null) {
			System.out.println("El cliente con id: " + client.getId()+ " es: " + client.getNombre()+ " " + client.getPrimerApellido()+ " " + client.getSegundoApellido());
		}
    }

}
