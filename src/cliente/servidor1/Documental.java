
package cliente.servidor1;


public class Documental extends Audiovisual implements Comparable<Documental> {
    public Documental(String Titulo,String comentarios,String sipnosis,int Calificacion,int Duracion, String Director){
        super(Titulo,comentarios,sipnosis,Calificacion,Duracion,Director);
        
    }

    @Override
    public int compareTo(Documental D){
     return this.Titulo.compareTo(D.Titulo);
    }
    
    
}
