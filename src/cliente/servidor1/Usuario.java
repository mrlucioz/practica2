
package cliente.servidor1;

import javax.swing.JOptionPane;


public class Usuario implements Comparable<Usuario>{
    protected String usuario;
    protected String contraseña;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }
    
    
    
    
    public static void Iniciar_Sesion(Usuario Us){
        JOptionPane.showMessageDialog(null,"“¡Bienvenido "+Us.usuario+" !");
        
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.usuario.compareTo(o.getUsuario());
    }
    
}
