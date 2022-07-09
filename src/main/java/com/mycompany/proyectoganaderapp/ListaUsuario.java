package com.mycompany.proyectoganaderapp;

import java.util.ArrayList;

/**
 *
 * @author aaron
 */
public class ListaUsuario {

    private ArrayList<Usuario> usuarios;

    public ListaUsuario() {
        usuarios = new ArrayList<Usuario>();
    }

    public boolean esVacia() {
        return usuarios.isEmpty();
    }

    public void agregar(Usuario dato) {
        usuarios.add(dato);
    }

    public int tamanio() {
        return usuarios.size();
    }

    public ArrayList<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    public void inicializar() {
        agregar(new Usuario());
        agregar(new Usuario("Luis", "Carvajal", "luisleo@live.com", "ecua.", "Independiente"));
        agregar(new Usuario("Leo", "Ignacio", "leo@live.com", "ecua1.", "Empresa"));
        agregar(new Usuario("Migel", "Hernandez", "Hernandez@live.com", "escubi", "Independiente"));
    }

}
