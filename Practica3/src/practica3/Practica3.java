/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
import java.util.ArrayList;
import Librerias.Diccionario;
import Librerias.Lista;
import controlador.GestionDato;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Casa;
import modelo.Persona;

/**
 *
 * @author Paulo
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Map mapa= new HashMap<>();
        ArrayList<Casa> ls = new ArrayList<>();
        Lista listaL = new Lista(ls);
        Diccionario d = new Diccionario(mapa);

        
        System.out.println("_____________________ ");
        System.out.println("| DATOS DEL USUARIO |");
        System.out.println("|___________________|");
        System.out.println("Cuantos usuarios creará?");
        int n= leer.nextInt();
        leer.nextLine();
        for (int i=0; i<n; i++)
        {
        System.out.print("Ingrese Nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese numero de Cedula: ");
        String cedula = leer.nextLine();
        System.out.print("Ingrese ID: ");
        int id=leer.nextInt();
        Persona p = new Persona(id,nombre,cedula,edad);
        d.agregarElemento(p.getId(), p);
        }
        
        System.out.println("_____________________ ");
        System.out.println(" |DATOS DE LAS CASAS|");
        System.out.println("|  DE LOS USUARIOS  |");
        System.out.println("|___________________|");
        for (int i=0; i<n; i++)
        {
            System.out.print("Ingrese Direccion: ");
            String direccion = leer.nextLine();
            leer.nextLine();
            System.out.print("Ingrese ID de la casa: ");
            int idc=leer.nextInt();
            leer.nextLine();
            System.out.print("Ingrese el numero de la casa:");
            String numero=leer.nextLine();
            System.out.print("Ingrese ID del propietario:");
            int cod=leer.nextInt();
            Object Cp = d.recuperarELemento(cod);
            Casa cs= new Casa(idc,(Persona)Cp,direccion,numero);
            listaL.agregarElemento(cs);
        }
        
        
        System.out.println("____________________________");
        System.out.println("|    LISTADO DE  USUARIOS   |");
        System.out.println("|___________________________|");
        List  lista = d.recuperarElementos();
        for(int i=0; i<lista.size();i++)
        {
            System.out.println(lista.get(i));
        }
        
        
        System.out.println("____________________________");
        System.out.println("|RECUPERAR DATOS DEL USUARIO|");
        System.out.println("|___________________________|");
        System.out.print("Ingrese ID del usuario");
        int IDr=leer.nextInt();
        Object elemento = d.recuperarELemento(IDr);
        if(d.recuperarELemento(IDr)==null)
        {
           JOptionPane.showMessageDialog(null,"ERROR 404! ID NOT FOUND");
        }else
            System.out.println(elemento);
          
        System.out.println("____________________________");
        System.out.println("|ORDENAMIENTO DE LOS USUARIO|");
        System.out.println("|           BURBUJA         |");
        System.out.println("|___________________________|");
        List  lista2 = d.recuperarElementos();
        GestionDato gD =new GestionDato(lista2);
        for(Persona PersonaBurbuja:gD.OrdenamientoBurbuja())
        {
            System.out.println(PersonaBurbuja.toString());
        }
        
        System.out.println("____________________________");
        System.out.println("|ORDENAMIENTO DE LOS USUARIO|");
        System.out.println("|         QUICK SORT        |");
        System.out.println("|___________________________|");
        List<Persona> pQuick =d.recuperarElementos();
        int i=0;
        Persona[] arreglo=new Persona[d.recuperarElementos().size()];
        for(Persona persona:pQuick)
        {
            arreglo[i]=persona;
            i++;
        }
        GestionDato Gd=new GestionDato(pQuick);
        for(Persona p:Gd.OrdenamientoquickSort(arreglo,0,pQuick.size()-1))
        {
            System.out.println(p.toString());
        }
        
        System.out.println("____________________________");
        System.out.println("| ELIMINAR DATOS DEL USUARIO|");
        System.out.println("|___________________________|");
        System.out.print("Ingrese ID del usuario a ser eliminado:");
        int IDe=leer.nextInt();
        Object elemento2 = d.recuperarELemento(IDe);
        if(d.recuperarELemento(IDr)==null)
        {
           JOptionPane.showMessageDialog(null,"ERROR 404! ID NOT FOUND");
        }else
            d.eliminarElemento(elemento2);
            System.err.println("USUARIO ELIMINADO!!");
        
       
            
        /*System.out.println("____________________________");
        System.out.println("|RECUPERAR DATOS DE UNA CASA|");
        System.out.println("|___________________________|");                  
        System.out.print("Ingrese ID la casa: ");
        int IDc=leer.nextInt();

        Object elemento1 = listaL.recuperarElemento(IDc);
        if(listaL.recuperarElemento(IDc)==null)
        {
           JOptionPane.showMessageDialog(null,"ERROR 404! ID NOT FOUND");
        }
        else
                System.out.println(elemento1);
        */
        
        System.out.println("_________________");
        System.out.println("|LISTADO DE CASAS|");
        System.out.println("|________________|"); 
        for (int j = 0; j < ls.size(); j++) {
            System.out.println(ls.get(j));
        }
    }
    
}
