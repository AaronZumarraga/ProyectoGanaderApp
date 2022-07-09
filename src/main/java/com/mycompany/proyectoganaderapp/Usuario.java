
package com.mycompany.proyectoganaderapp;

/**
 *
 * @author Leonardo
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String tipoganadero;//Independendiente,Empresa

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String correo, String contrasena, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoganadero= tipo;
    }

    public String getTipoganadero() {
        return tipoganadero;
    }

    public void setTipoganadero(String tipoganadero) {
        this.tipoganadero = tipoganadero;
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
        
        return "tipo: " + tipoganadero +  ", nombre:" + nombre + ", apellido:" + apellido + ", correo:" + correo + ", contrasena:" + contrasena;
    }

}
