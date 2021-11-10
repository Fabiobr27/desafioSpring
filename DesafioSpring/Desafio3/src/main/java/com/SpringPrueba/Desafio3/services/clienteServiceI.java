/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringPrueba.Desafio3.services;

import com.SpringPrueba.Desafio3.entites.cliente;

/**
 *
 * @author fabio
 */

public interface clienteServiceI {
    public void insert(cliente entity);
    public void buscarTodo();
    public void buscarId(long id);
}
