/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import Librerias.Diccionario;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner lectura = new Scanner(System.in);
        Map<Integer,String>mapa= new HashMap<>();
        Diccionario d = new Diccionario(mapa);
        
        System.out.println("Cuantos usuarios ingresara");
        int n= lectura.nextInt();
        lectura.nextLine();
        
        for( int i= 0; i<n;i++)
        {
            System.out.println("Ingrese Usuario: ");
            String n2= lectura.nextLine();
            d.agregarElemento(i,n2);
        }
        Object elemento=d.recuperarELemento(1);
        System.out.print(elemento);
        d.eliminarElemento(elemento);
    }
    
}
