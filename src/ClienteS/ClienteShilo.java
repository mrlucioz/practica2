/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClienteS;

import cliente.servidor1.Usuario;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bille
 */
public class ClienteShilo{

    Usuario U = new Usuario();
    private String nombreUsuario;
    private String contraseña;

    final String Host = "127.0.0.1";
    final int puerto = 5000;
    DataInputStream in;
    DataOutputStream out;

    public ClienteShilo(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public void registro(){
    try {
        Socket sc = new Socket(Host, puerto);
        System.out.println("Cliente conectado");

        DataInputStream in = new DataInputStream(sc.getInputStream());
        DataOutputStream out = new DataOutputStream(sc.getOutputStream());

        // Envía datos de registro al servidor
        out.writeUTF("registro:" + this.nombreUsuario + ":" + this.contraseña);
        String respuestaRegistro = in.readUTF();
        System.out.println(respuestaRegistro);
        
        // Cierra la conexión
        sc.close();
    } catch (IOException ex) {
        Logger.getLogger(ClienteShilo.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    public void IniciodeSesion(){
    try {
        Socket sc = new Socket(Host, puerto);
        System.out.println("Cliente conectado");

        DataInputStream in = new DataInputStream(sc.getInputStream());
        DataOutputStream out = new DataOutputStream(sc.getOutputStream());


        // Envía datos de inicio de sesión al servidor
        out.writeUTF("inicioSesion:" + this.nombreUsuario + ":" + this.contraseña);
        String respuestaInicioSesion = in.readUTF();
        System.out.println(respuestaInicioSesion);

        // Cierra la conexión
        sc.close();
    } catch (IOException ex) {
        Logger.getLogger(ClienteShilo.class.getName()).log(Level.SEVERE, null, ex);
    }
}



}
