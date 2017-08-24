/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

/**
 *
 * @author Maicol Velasquez
 */
public class catalogoDiscos {
    
    //atributos
    
  String titulo = null ;
String artista = null;
String genero = null;
String imagen = null ; 
int g, n;

String catalogo [][] = new String [g][n];

//metodos

public boolean buscarDis (String dis){
    int jah = 1;
    for ( int u = 0; u < g; u++){
        for ( int f = 0; f < n; f++){
            if (catalogo [u][f] == dis ){
                jah = 0;
            }
            else {
                jah= 1;
            }
        }
    }
    if( jah == 0 ){
        return false;
    }
    else{
        return true;
    }
}

public boolean agregarDis (String newdis){
    boolean ju ;
    ju = buscarDis (newdis);
    if (ju == false){
        catalogo [g+1] [n]= this.titulo;
        catalogo [g] [n+1]= this.artista;
        catalogo [g] [n+2]= this.genero;
        catalogo [g] [n+3]= this.imagen;
        
        return true;
                
    }
    else {
       return false; 
    
    }
}


}