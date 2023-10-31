package com.iesvdc.acceso.inventario.dao;

import com.iesvdc.acceso.inventario.modelo.Estancia;
import com.iesvdc.acceso.inventario.modelo.Incidencia;
import com.iesvdc.acceso.inventario.modelo.Usuario;

import java.util.List;

public interface IncidenciaDao {

    boolean create(Incidencia i);

    Incidencia findById(int id);

    Incidencia findByNombre(String nombre);

    Incidencia findByEstancia(Estancia e);

    Incidencia findByOperario(Usuario o);

    Incidencia findByUsuario(Usuario u);

    boolean update(Incidencia o, Incidencia n);

    boolean update(int id, Incidencia n);

    boolean delete(Incidencia i);

    boolean delete(int id);

    List<Incidencia> findAll();

    int count();
}
