/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoganaderapp;
import java.util.Queue;
import java.util.ArrayList;

/**
 *
 * @author naran
 */
public class ColaProduccion{
    private String datos;
    ArrayList<Integer>produccionleche;
    ArrayList<Integer>produccioncarne;

    public ColaProduccion(){
         produccionleche = new ArrayList<Integer>();
         produccioncarne = new ArrayList<Integer>();

    }
    
    public void encolarpleche(int dato){
        produccionleche.add(dato);
    }
    
    
    public void desencolarpleche (int dato){
        produccionleche.remove(dato);
        
    }
    
    
        public void ordenarproduccionlechera(){
            
        
    }
        
        public void ordenarproduccioncarne(){
        
    }

     
        
    

}

