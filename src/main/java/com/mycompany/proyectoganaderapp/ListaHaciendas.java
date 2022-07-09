/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoganaderapp;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class ListaHaciendas {

    private ArrayList<Hacienda> haciendas;

    public ListaHaciendas() {
        haciendas = new ArrayList<Hacienda>();
    }

    public void agregar(Hacienda dato) {
        haciendas.add(dato);
    }

    public void inicializar() {
        agregar(new Hacienda());
        agregar(new Hacienda("luisleo@live.com", 1, "Santo Domingo", "Norte", 100));
        agregar(new Hacienda("luisleo@live.com", 2, "San Vicente", "Sur", 80));

    }

    public ArrayList<Hacienda> obtenerHaciendas() {
        return haciendas;
    }

}
