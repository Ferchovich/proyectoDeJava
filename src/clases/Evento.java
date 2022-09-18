/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author octavio
 */
public class Evento {
    private String nombre, fecha, direccion, requisitos;
    private int capaciadad;

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

    public int getCapaciadad() {
        return capaciadad;
    }

    public void setCapaciadad(int capaciadad) {
        this.capaciadad = capaciadad;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Evento(String nombre, String fecha, String direccion, int capaciadad, String requisitos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.capaciadad = capaciadad;
        this.requisitos = requisitos;
    }
    
    

    public String invitacion(String usuario){
        return "Has sido invitado al evento de " + usuario + "\n" +
               nombre + "\n" +
               fecha + "\n" +
               direccion + "\n" +
               capaciadad + "\n" +
               requisitos;
    }
    
    
    
}
