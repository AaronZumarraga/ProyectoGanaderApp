/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoganaderapp;

import java.util.Date;

/**
 *
 * @author Leonardo
 */
public class SaludVaca {
    private int idHacienda;
    private int idVaca;
    private Date fechaCita;
    private Date fechaAtencion;
    
    public  SaludVaca(){
        
    }

    public SaludVaca(int idHacienda, int idVaca, Date fechaCita, Date fechaAtencion) {
        this.idHacienda = idHacienda;
        this.idVaca = idVaca;
        this.fechaCita = fechaCita;
        this.fechaAtencion = fechaAtencion;
    }

    public int getIdHacienda() {
        return idHacienda;
    }

    public void setIdHacienda(int idHacienda) {
        this.idHacienda = idHacienda;
    }

    public int getIdVaca() {
        return idVaca;
    }

    public void setIdVaca(int idVaca) {
        this.idVaca = idVaca;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    @Override
    public String toString() {
        return "SaludVaca{" + "idHacienda=" + idHacienda + ", idVaca=" + idVaca + ", fechaCita=" + fechaCita + ", fechaAtencion=" + fechaAtencion + '}';
    }
    
    
    
    
}
