
package cliente.servidor1;

public class Serie extends Audiovisual implements Comparable<Serie> {
    protected int temporada;
    protected int capitulos;

    public Serie() {
    }
    
    public Serie(String Titulo,String comentarios,String sipnosis,int Calificacion,int Duracion, String Director,int temporada,int capitulos){
        super(Titulo,comentarios,sipnosis,Calificacion,Duracion,Director);
        this.temporada=temporada;
        this.capitulos=capitulos;
        
    }
    
    

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
    @Override
    public String Imprimir_info(){
        return super.Imprimir_info()+ "Temporada: "+ temporada+"\n"+ "Capitulo: "+ capitulos+ "\n";
    }
    @Override
    public int compareTo(Serie s){
        return this.Titulo.compareTo(s.Titulo);
    }
    
    
    
}
