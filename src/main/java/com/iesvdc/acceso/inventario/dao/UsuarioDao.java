package com.iesvdc.acceso.inventario.dao;

import com.iesvdc.acceso.inventario.modelo.Usuario;

import java.util.List;

public interface UsuarioDao {

    boolean create(Usuario u);

    Usuario findById(int id);

    Usuario findByUsername(String username);

    Usuario findByUsernameAndPassword(String username, String password);

    boolean update(Usuario o, Usuario n);

    boolean update(int id, Usuario n);

    boolean delete(Usuario u);

    boolean delete(int id);

    /**
     * Devuelve la lista de todos los usuarios de la base de datos
     */
    List<Usuario> findAll();

    int count();
}
