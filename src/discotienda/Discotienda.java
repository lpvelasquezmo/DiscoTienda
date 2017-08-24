/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Discotienda {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        canciones nueva = new canciones ();
        catalogoDiscos nuevo = new catalogoDiscos ();
         Scanner flujoEnt = new Scanner (System.in);
        int No;
        System.out.println("BIENVENIDO A DISCOTIENDA.\n Presione '2' para buscar disco.\n Presione '3' para agregar disco. Presione '4' para buscar cancion. \n Presione '5' para agregar cancion");
        No = flujoEnt.nextInt();
          
        switch (No ) {
            
            case 2 :
                System.out.println ("Escriba el nombre del disco que desea buscar:");
               nuevo.titulo = flujoEnt.next();
               boolean ha ;
               ha = nuevo.buscarDis(nuevo.titulo);
            
            case 3 :
                
                System.out.println ("Escriba el nombre del disco");
               nuevo.titulo = flujoEnt.next();
               
               System.out.println ("Escriba el artista del disco");
               nuevo.artista = flujoEnt.next();
               
               System.out.println ("Escriba el genero del disco");
               nuevo.genero = flujoEnt.next();
                
                System.out.println("Escriba 'si' si tiene imagen y 'no' en caso contrario");
                nuevo.imagen = flujoEnt.next ();
            boolean resul ;
            resul = nuevo.agregarDis(nuevo.titulo);
        }
        
    }
}