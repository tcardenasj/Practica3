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
    
    private int E;
    private Persona dueño;

    public Casa(int E, Persona dueño) {
        this.E = E;
        this.dueño = dueño;
    }

    public int getE() {
        return E;
    }

    public void setE(int E) {
        this.E = E;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }
    
    
    
    
    
}
