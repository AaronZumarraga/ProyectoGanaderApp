
package com.mycompany.proyectoganaderapp;

/**
 *
 * @author aaron
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String tipo;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String apellido, String tipo, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario:" + " nombre: " + nombre + ", apellido: " + apellido + ", tipo: " + tipo + ", correo: " + correo + ", contrasena: " + contrasena;
    }
    
    
    
}
