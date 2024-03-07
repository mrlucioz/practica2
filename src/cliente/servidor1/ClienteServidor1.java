package cliente.servidor1;


import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ClienteServidor1 {

    public static void main(String[] args) {
        
        Usuario Us = new Usuario();
        Us.crear_archivo_usuario();
        InicioS I=new InicioS();
        I.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    }
        
        
        
        /*

        ArrayList<Usuario> U = new ArrayList<Usuario>();
        //creacion de los 10 usuarios
        Usuario Us = new Usuario("Billem", "1234");
        Usuario Us2 = new Usuario("Aron", "12342");
        Usuario Us3 = new Usuario("Danil", "12343");
        Usuario Us4 = new Usuario("Carmen", "12344");
        Usuario Us5 = new Usuario("Fabi", "12345");
        Usuario Us6 = new Usuario("Perrito", "12346");
        Usuario Us7 = new Usuario("Dante", "12347");
        Usuario Us8 = new Usuario("Juan", "12348");
        Usuario Us9 = new Usuario("Jason", "12349");
        Usuario Us10 = new Usuario("Andre", "123410");
        //agreagarilos a la collecion
        U.add(Us);
        U.add(Us2);
        U.add(Us3);
        U.add(Us4);
        U.add(Us5);
        U.add(Us6);
        U.add(Us7);
        U.add(Us8);
        U.add(Us9);
        U.add(Us10);
        //remover el usuario especifico
        U.remove(Us2);
        //exepcion en caso de que no exista un usuario
        JOptionPane.showMessageDialog(null,"Las instrucciones se implementaron en el orden de la practica! se puede entender con mas claridad viendo el main");
        String nombreB=JOptionPane.showInputDialog(null,"Ingrese el nombre a buscar: ");
        try{
        for(Usuario nombre:U){
            if(nombre.usuario.equals(nombreB)){
                JOptionPane.showMessageDialog(null, "Si esta en la lista");
                break;
            }else{
               throw new Miexcepcion("no se encuentra registrado");
            
        }}}catch(Miexcepcion e){
                      JOptionPane.showMessageDialog(null, e.getMessage());
                
                }
        //mirar lista antes del sort
         String lista1="";
        for(Usuario u: U){
            lista1=lista1+"Usuario: "+u.getUsuario()+" | "+"contraseña: "+u.getContraseña()+" | "+"\n";
            
        }
        JOptionPane.showMessageDialog(null,lista1);
        // usar el metodo sort para ordenar los usuarios
        Collections.sort(U);
        //mirar la lista
        String lista="";
        for(Usuario u: U){
            lista=lista+"Usuario: "+u.getUsuario()+" | "+"contraseña: "+u.getContraseña()+" | "+"\n";
            
        }
        //ver la lista ahora ordenada
        JOptionPane.showMessageDialog(null,lista);
        //la clase series fue la unica que considere necesitava atributos distintos a los que ya compartian las demas
        
        boolean stop = false;

        Iniciar_Sesion(Us);

        Pelicula P = new Pelicula("Pelicula", "Comentarios aquí", "Sinopsis de la historia", 5, 120, "Director Genial");
        Documental D = new Documental("Documental", "Comentarios aquí", "Sinopsis de la historia", 5, 120, "Director Genial");
        Serie S = new Serie("Serie", "Comentarios aquí", "Sinopsis de la historia", 5, 120, "Director Genial", 1, 12);
        do {
            Object[] identificadoresS = {"Peliculas", "Documentales", "Serie"};
            Object seleccionS = JOptionPane.showInputDialog(null, "\nBienvenido a Fideflix",
                    "Bienvenido: " + Us.getUsuario(), JOptionPane.QUESTION_MESSAGE, null,
                    identificadoresS, identificadoresS);//muestra las opciones a leegir

            if (seleccionS != null) {
                switch (seleccionS.toString()) {
                    case "Peliculas":
                        JOptionPane.showMessageDialog(null, P.Imprimir_info());

                        break;
                    case "Documentales":
                        JOptionPane.showMessageDialog(null, D.Imprimir_info());

                        break;
                    case "Serie":
                        JOptionPane.showMessageDialog(null, S.Imprimir_info());

                        break;

                }

            } else {
                stop = true;
            }

        } while (!stop);

    }

}

*/
        
