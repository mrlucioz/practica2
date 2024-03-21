/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import cliente.servidor1.Usuario;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bille
 */
public class Servidorhilo extends Thread {

    ServerSocket servidor = null;
    Usuario U = new Usuario();
    Socket sc = null;
    final int puerto = 5000;
    DataInputStream in;
    DataOutputStream out;
    private boolean pasa = false;
    private boolean pasa2 = false;

    @Override
    public void run() {

        try {
            servidor = new ServerSocket(puerto);
            System.out.println("servidor inciadol");
            while (true) {

                sc = servidor.accept();
                System.out.println("cliente conectado");

                in = new DataInputStream(sc.getInputStream());//leer mensajes cliente
                out = new DataOutputStream(sc.getOutputStream());//

                String m = in.readUTF();
                String[] partes = m.split(":");
                String tipoSolicitud = partes[0];
                String nombreUsuario = partes[1];
                String contraseña = partes[2];

                System.out.println(m);
                if (tipoSolicitud.equals("registro")) {
                    pasa = U.Registro(nombreUsuario, contraseña);

                } else if (tipoSolicitud.equals("inicioSesion")) {
                    pasa2 = U.InicioSesion(contraseña, nombreUsuario);

                } else {
                    System.out.println("tipo de solcitud desconocida");
                }
                
                
                String m2 = "";
                if (pasa && !pasa2) {
                    m2 = "Registro del cliente exitoso";
                } else if (!pasa && pasa2) {
                    m2 = "Datos confimados \n Inicio de sesion exitoso!";
                } else {
                    m2 = "ERROR";
                }
                System.out.println(m2);
                out.writeUTF(m2);

                sc.close();
                System.out.println("cliente desconectado");

            }//while

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
