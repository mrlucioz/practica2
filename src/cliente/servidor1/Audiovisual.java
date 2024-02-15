package cliente.servidor1;

import java.util.ArrayList;

abstract class Audiovisual {

    protected String Titulo;
    protected String sipnosis;
    protected int Duracion;
    protected int Calificacion;
    protected static ArrayList<String> comentarios = new ArrayList<String>();
    public static String comentario1;

    protected String Director;

    public Audiovisual(String Titulo, String comentarios, String sipnosis, int Calificacion, int Duracion, String Director) {
        this.Titulo = Titulo;
        this.sipnosis = sipnosis;
        this.Calificacion = Calificacion;
        this.Duracion = Duracion;
        this.Director = Director;
    }

    public Audiovisual() {
    }
    
    public static void Agregar_c(String comentario1){
        comentarios.add(comentario1);
        
    }

    public String Imprimir_info() {
        return "----------------------------------------" + "\n"
                + "Titulo: " + Titulo + "\n"
                + "Sipnosis: " + sipnosis + "\n"
                + "Duracion: " + Duracion + "\n"
                + "Director: " + Director + "\n"
                + "Calificacion: " + Calificacion + "\n";
                

    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

   

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

}
