/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoganaderapp;

/**
 *
 * @author Leonardo
 */
public class Produccion {
   private int idGanado;
    private String tipo;//Leche,Carne
    private int anio;//se debera ingresar la cantidad de leche producida en ese anio
    private int cantidad;

    public Produccion(){
        
    }

    public Produccion(int idGanado, String tipo, int anio, int cantidad) {
        this.idGanado = idGanado;
        this.tipo = tipo;
        this.anio = anio;
        this.cantidad = cantidad;
    }
    
    
    
    
    public int getIdGanado() {
        return idGanado;
    }

    public void setIdGanado(int idGanado) {
        this.idGanado = idGanado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Produccion{" + "idGanado=" + idGanado + ", tipo=" + tipo + ", anio=" + anio + ", cantidad=" + cantidad + '}';
    }
     
}
