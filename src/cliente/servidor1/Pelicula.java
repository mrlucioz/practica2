
package cliente.servidor1;


public class Pelicula extends Audiovisual implements Comparable<Pelicula> {
    
    public Pelicula(String Titulo,String comentarios,String sipnosis,int Calificacion,int Duracion, String Director){
        super(Titulo,comentarios,sipnosis,Calificacion,Duracion,Director);
        
    }
    
  @Override
  public int compareTo(Pelicula P){
  return this.Titulo.compareTo(P.Titulo);
  
  }
    
    
    
    


//SIPNOSIS
    
    
}
