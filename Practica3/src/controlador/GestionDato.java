/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Persona;

/**
 *
 * @author paulo
 */
public class GestionDato
{
    Persona[] arreglo;
    List<Persona> pList;
    public GestionDato(List<Persona> perList) {
        this.arreglo=new Persona[perList.size()];
        this.pList=perList;
        int i=0;
        for(Persona p:perList){
            arreglo[i]=p;
            i++;
        }
    }
     public List<Persona> OrdenamientoBurbuja(){
        for(int i=0; i<pList.size();i++){
            for(int j=0; j<pList.size();j++){
                if(arreglo[i].getId()<arreglo[j].getId()){
                    Persona aux=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
        pList.clear();
        for(Persona p:arreglo){
            pList.add(p);
        }
        return pList;
    }

    // QUICKSORT
    public List<Persona> OrdenamientoquickSort(Persona[] arreglo,int primero,int ultimo){
        int c=(primero+ultimo)/2;
        int p=arreglo[c].getId();
        int i=primero;
        int j=ultimo;
        do{
            while(arreglo[i].getId()<p)i++;
            while(arreglo[j].getId()>p)j--;
            if(i<=j){
                Persona aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(primero<j){
            this.OrdenamientoquickSort(arreglo,primero, j);
        }
        if(i<ultimo){
            this.OrdenamientoquickSort(arreglo,i, ultimo);
        }
        this.pList.clear();
        for(Persona p2:arreglo){
            this.pList.add(p2);
        }
        return this.pList;
    }

    
}
