

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

/** .,cdd
 *
 * @author Maicol Velasquez
 */
public class canciones {
    
    // atributos
   
    String nombre = null ;
    String precio ;
    String duracion ;
    String tamaño  ;
    String calidad  ;
    
    int i, j; 
    
    String catalogo2 [][] = new String [i] [j] ;
            
    // metodos
    
public boolean buscarCan (  String canBus ){
    int hy = 0;
      for (int k = 0; k < i; k++){
          for (int t = 1; t<j ; t++){
              if (catalogo2 [k][t] == canBus) {
                  hy=1;
                  
              }
              else {
                  hy = 0;
              }
          }
      }
      
      if (hy == 1){
          return true;
          
      }
      else {
          return false;
      }
}
        
    
      public void agregarCan ( ){
        catalogo2 [i+1 ][j+1 ] = this.nombre ;
        catalogo2 [i][j+2 ] = this.precio;
        catalogo2 [i ][j+3 ] = this.duracion;
        catalogo2 [i ][j+4 ] = this.tamaño;
        catalogo2 [i ][j+5 ] = this.calidad;
        
      }

}
      
