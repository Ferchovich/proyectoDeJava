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
    private String nombre, fecha, direccion, requisitos, horaInicio, horaCierre;
    private int capacidad;

    public Evento(String nombre, String fecha, String direccion, String requisitos, String horaInicio, String horaCierre, int capaciadad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.requisitos = requisitos;
        this.horaInicio = horaInicio;
        this.horaCierre = horaCierre;
        this.capacidad = capaciadad;
    }

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

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public int getCapaciadad() {
        return capacidad;
    }

    public void setCapaciadad(int capaciadad) {
        this.capacidad = capaciadad;
    }

   
  

    public String invitacion(String usuario){
        return "Has sido invitado al evento de " + usuario + "\n" +
               nombre + "\n" +
               fecha + "\n" +
               direccion + "\n" +
               capacidad + "\n" +
               "de " + horaInicio + " hasta las " + horaCierre + "\n" +
               requisitos;
    }
    
    
    
}
