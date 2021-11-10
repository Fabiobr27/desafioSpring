/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringPrueba.Desafio3.entites;

import java.util.List;

/**
 *
 * @author fabio
 */

public interface clienteDaoI {
    
    public void insert(final cliente entity);
    public List<cliente> buscarTodo();
    public cliente buscarId(final long id);

}
