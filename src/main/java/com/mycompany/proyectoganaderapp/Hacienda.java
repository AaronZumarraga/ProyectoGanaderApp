/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoganaderapp;

public class Hacienda {

    private String correo;
    private int identificador;
    private String ciudad;
    private String ubicacion;
    private int tamanio;

    public Hacienda() {

    }

    public Hacienda(String correo, int identificador, String ciudad, String ubicacion, int tamanio) {
        this.correo = correo;
        this.identificador = identificador;
        this.ciudad = ciudad;
        this.ubicacion = ubicacion;
        this.tamanio = tamanio;
    }
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Hacienda" + "correo=" + correo + ", identificador=" + identificador + ", ciudad=" + ciudad + ", ubicacion=" + ubicacion + ", tamanio=" + tamanio;
    }

    
    
}
