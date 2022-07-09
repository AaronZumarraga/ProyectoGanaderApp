/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoganaderapp;

import java.util.ArrayList;

/**
 *
 * @author naran
 */
public class ColaVacas {
    
    private ArrayList<Vaca> vacas;

    public ColaVacas() {
        vacas = new ArrayList<Vaca>();
    }

    public void agregar(Vaca dato) {
        vacas.add(dato);
    }
//Holstein,Angus,Hereford,Simmental

    public void inicializar() {
        agregar(new Vaca());
        agregar(new Vaca(1, 1, "Pancho", "Macho", "Holstein", "12-04-2015", "SI", 720, "Carne"));
        agregar(new Vaca(1, 2, "Maria", "Hembra", "Angus", "12-04-2016", "SI", 520, "leche"));
        agregar(new Vaca(1, 3, "Eduardo", "Masculino", "Hereford", "12-04-2017", "SI", 850, "Carne"));
        agregar(new Vaca(1, 4, "Heily", "Hembra", "Simmental", "14-02-2015", "SI",950 , "Leche"));
        agregar(new Vaca(1, 5, "Jose", "Masculino", "Angus", "03-08-2010", "NO", 1100, "Carne"));
        //
        agregar(new Vaca(2, 6, "Jesus", "Hembra", "Angus", "13-05-2017", "SI", 720, "Leche"));
        agregar(new Vaca(2, 7, "Maria", "Hembra", "Simmental", "12-04-2016", "NO", 520, "leche"));
        agregar(new Vaca(2, 8, "Eduardo", "Masculino", "Hereford", "12-04-2017", "NO", 850, "Carne"));
        agregar(new Vaca(2, 9, "Heily", "Masculino", "Simmental", "14-02-2015", "NO",200 , "Carne"));
        agregar(new Vaca(2, 10, "Jose", "Masculino", "Angus", "03-08-2019", "NO", 1100, "Carne"));        

    }
}
