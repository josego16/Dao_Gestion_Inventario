package com.iesvdc.acceso.inventario.dao;

import java.util.List;

import com.iesvdc.acceso.inventario.modelo.Estancia;

public interface EstanciaDao {

    boolean create(Estancia u);

    /**
     * Busca en la base de datos estancias por su identificador.
     * 
     * @param id número entero positivo
     * @return null si no está ese id, la Estancia en caso contrario.
     */
    Estancia findById(int id);

    List<Estancia> findAll();

    Estancia findByNombre(String nombre);

    boolean update(Estancia o, Estancia n);

    boolean update(int id, Estancia n);

    boolean delete(Estancia u);

    boolean delete(int id);

    int count();
}
