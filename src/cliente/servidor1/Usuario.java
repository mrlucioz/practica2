package cliente.servidor1;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario implements Comparable<Usuario> {

    protected String usuario;
    protected String contra;
    private final ArrayList<Usuario> Usuarios = new ArrayList<>();
    private ArrayList<Usuario> UN = new ArrayList<>();

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contra = contraseña;
    }

    public Usuario() {

    }

    public void crear_archivo_usuario() {
        File Utxt = new File("C:\\Users\\bille\\OneDrive\\Escritorio\\Usuarios.txt");

        try {
            boolean fileCreated = Utxt.createNewFile();
            if (fileCreated) {
                System.out.println("creado");
            } else {
                System.out.println("Ya existe");
            }
        } catch (IOException e) {
            System.out.println("Excepción al crear el archivo" + e);
        }
    }

    public void guardarUsuariosEnArchivo(ArrayList<Usuario> Usuarios) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Usuarios.txt"))) {
            // Escribimos cada usuario en el archivo
            for (Usuario usuario : Usuarios) {
                writer.write(usuario.usuario + "," + usuario.contra + "\n");
            }
            System.out.println("Usuarios agregados al archivo");
        } catch (IOException e) {
            System.out.println("Excepción al guardar los usuarios en el archivo: " + e);
        }
    }

    public ArrayList<Usuario> cargarUsuariosDesdeArchivo() {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("Usuarios.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 2) { // Verificar que haya dos partes (usuario y contraseña)
                usuarios.add(new Usuario(parts[0], parts[1]));
            } else {
                System.out.println("Formato incorrecto en la línea: " + line);
            }
        }
        System.out.println("Usuarios cargados.");
    } catch (IOException e) {
        System.out.println("Excepción al cargar los usuarios " + e);
    }
    return usuarios;
}

    public void InicioSesion(String contraP, String usuarioP) {
        Usuario U = new Usuario();
        ArrayList<Usuario> UN = U.cargarUsuariosDesdeArchivo();

        boolean pasa = false;

        for (Usuario log : UN) {
            if (log.getUsuario().equals(usuarioP) && log.getContra().equals(contraP)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                pasa = true;
                break; // Salir del bucle si se encontró una coincidencia
            }
        }

        if (!pasa) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Por favor ingrese la información correcta");
        }
    }

    public void Registro(String user, String contra) {
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setUsuario(user);
        nuevoUsuario.setContra(contra);

        ArrayList<Usuario> usuarios = cargarUsuariosDesdeArchivo();

        boolean usuarioExistente = false;
        for (Usuario confirmacion : usuarios) {
            if (confirmacion.getUsuario().equals(user)) {
                usuarioExistente = true;
                JOptionPane.showMessageDialog(null, "Ya existe un Usuario con el mismo nombre. Por favor intente con un usuario diferente.");
                break;
            }
        }

        if (!usuarioExistente) {
            Usuarios.add(nuevoUsuario);
            guardarUsuariosEnArchivo(Usuarios);
            JOptionPane.showMessageDialog(null, "El usuario se registró correctamente.");
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.usuario.compareTo(o.getUsuario());
    }
}