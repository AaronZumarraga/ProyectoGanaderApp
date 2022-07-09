/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoganaderapp;

import java.util.ArrayList;

public class ListaProduccion {

    private ArrayList<Produccion> produccion;

    public ListaProduccion() {
        produccion = new ArrayList<Produccion>();
    }

    public void agregar(Produccion dato) {
        produccion.add(dato);
    }

    public void inicializar() {
        agregar(new Produccion());
        agregar(new Produccion(2, "Leche", 2019, 10400));
        agregar(new Produccion(2, "Leche", 2020, 7500));
        agregar(new Produccion(2, "Leche", 2021, 8920));
        agregar(new Produccion(4, "Leche", 2018, 8400));
        agregar(new Produccion(4, "Leche", 2019, 10100));
        agregar(new Produccion(4, "Leche", 2020, 7900));
        agregar(new Produccion(4, "Leche", 2021, 8500));
        agregar(new Produccion(5, "Carne", 2016, 850));
        agregar(new Produccion(6, "Leche", 2020, 9800));
        agregar(new Produccion(6, "Carne", 2021, 600));
       agregar(new Produccion(7, "Leche", 2019, 8000));
        agregar(new Produccion(7, "Leche", 2020, 10000));
        agregar(new Produccion(7, "Leche", 2021, 11000));
    }

}
