package com.iesvdc.acceso.inventario.dao;

import com.iesvdc.acceso.inventario.modelo.Estancia;
import com.iesvdc.acceso.inventario.modelo.Inventario;

import java.util.List;

public interface InventarioDao {

    boolean create(Inventario i);

    Inventario findById(int id);

    Inventario findByNombre(String nombre);

    Inventario findByEstancia(Estancia e);

    boolean update(Inventario o, Inventario n);

    boolean update(int id, Inventario n);

    boolean delete(Inventario i);

    boolean delete(int id);

    List<Inventario> findAll();

    int count();
}
