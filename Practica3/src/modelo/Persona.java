/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Tat
 */
public class Persona {
    
    private int id;
    private String nombre;
    private String cedula;
    private int edad;

    public Persona(int id, String nombre, String cedula, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + '}';
    }
    
    
   
}
