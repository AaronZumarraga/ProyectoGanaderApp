
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
}
