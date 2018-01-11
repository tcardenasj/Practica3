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
public class Casa {
    
    private int id;
    private Persona dueño;
    private String direccion;
    private String numeroCasa;

    public Casa(int id, Persona dueño, String direccion, String numeroCasa) {
        this.id = id;
        this.dueño = dueño;
        this.direccion = direccion;
        this.numeroCasa = numeroCasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "Casa{" + "id=" + id + ", due\u00f1o=" + dueño + ", direccion=" + direccion + ", numeroCasa=" + numeroCasa + '}';
    }
    
    

    
    
    
    
}
