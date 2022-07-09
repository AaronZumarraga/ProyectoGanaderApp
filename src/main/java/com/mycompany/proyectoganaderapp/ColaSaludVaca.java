/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoganaderapp;

import java.util.Queue;

/**
 *
 * @author Leonardo
 */
public class ColaSaludVaca {

    private Queue<SaludVaca> vacas;

    public boolean esVacia() {
        return vacas.isEmpty();
    }

    public void agregar(SaludVaca dato) {
        vacas.add(dato);
    }

    public SaludVaca desencolar() {
        return vacas.poll();
    }

    public int tamanio() {
        return vacas.size();
    }

    public SaludVaca frente() {
        return vacas.peek();
    }

    public String listarSaludVacas() {
        String resultado = "";
        for (SaludVaca v1 : vacas) {
            resultado += v1.toString();
        }
        return resultado;
    }
}
