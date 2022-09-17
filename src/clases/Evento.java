/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.logging.Logger;

/**
 *
 * @author octavio
 */
public class Evento {
    private String nombre, fecha, direccion, capaciadad, requisitos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCapaciadad() {
        return capaciadad;
    }

    public void setCapaciadad(String capaciadad) {
        this.capaciadad = capaciadad;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Evento(String nombre, String fecha, String direccion, String capaciadad, String requisitos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.capaciadad = capaciadad;
        this.requisitos = requisitos;
    }
    
    
    @Override
    public String toString(){
        return nombre + "\n" +
               fecha + "\n" +
               direccion + "\n" +
               capaciadad + "\n" +
               requisitos;
    }
    
    
    
}
