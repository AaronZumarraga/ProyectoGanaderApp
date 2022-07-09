/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoganaderapp;

/**
 *
 * @author naran
 */
public class Vaca {
     private int idHacienda;
    private int idGanado;
    private String nombre;
    private String sexo;//Macho,Hembra
    private String raza;//Holstein,Angus,Hereford,Simmental
    private String fechaNac;
    private String animalVivo;//SI,NO
    private int peso;
    private String tipoPro;//Keche,Carne 

    public Vaca() {

    }

    public Vaca(int idHacienda, int idGanado, String nombre, String sexo, String raza, String fechaNac, String animalVivo, int peso, String tipoPro) {
        this.idHacienda = idHacienda;
        this.idGanado = idGanado;
        this.nombre = nombre;
        this.sexo = sexo;
        this.raza = raza;
        this.fechaNac = fechaNac;
        this.animalVivo = animalVivo;
        this.peso = peso;
        this.tipoPro = tipoPro;
    }

    public int getIdGanado() {
        return idGanado;
    }

    public void setIdGanado(int idGanado) {
        this.idGanado = idGanado;
    }

    public int getIdHacienda() {
        return idHacienda;
    }

    public void setIdHacienda(int idHacienda) {
        this.idHacienda = idHacienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getAnimalVivo() {
        return animalVivo;
    }

    public void setAnimalVivo(String animalVivo) {
        this.animalVivo = animalVivo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipoPro() {
        return tipoPro;
    }

    public void setTipoPro(String tipoPro) {
        this.tipoPro = tipoPro;
    }

    @Override
    public String toString() {
        return "Animales" + "idHacienda=" + idHacienda + "idGanado= " + idGanado + ", nombre=" + nombre + ", sexo=" + sexo + ", raza=" + raza + ", fechaNac=" + fechaNac + ", Animal Vivo =" + animalVivo + ", peso=" + peso + ", tipoPro=" + tipoPro + '}';
    }
}
