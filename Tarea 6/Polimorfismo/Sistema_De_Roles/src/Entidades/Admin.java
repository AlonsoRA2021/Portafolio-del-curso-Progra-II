package Entidades;

import javax.swing.JOptionPane;

import Interfaces.Visible;

public class Admin extends Persona implements Visible{
    private String usuario;
    private String contrasena;
    public Admin(int id, String nombre, String apellido, String rol, String usuario, String contrasena){
        super(rol);
        this.getId();
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    @Override
    public void verMenu(){
        String respUsuario;
        String respContrasena;
        byte opcion = 0;
        respUsuario = (JOptionPane.showInputDialog("Usuario: "));
        respContrasena = (JOptionPane.showInputDialog("Contraseña: "));
        if(respUsuario.equals(usuario)&&respContrasena.equals(contrasena)){
            do{
                opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    rol+nombre+apellido+      "\n"+
                    "MENU ADMIN                \n"+
                    "1. Registrar cajero       \n"+
                    "2. Base de datos          \n"+
                    "3. Modificar credenciales \n"+
                    "4. --regresar--           \n"+
                    "DIGITE UNA OPCION:          "));
    
                switch(opcion){
                    case 1:
                    JOptionPane.showMessageDialog(null, "Registrando cajero...");
                    break;
                    case 2:
                    JOptionPane.showMessageDialog(null, "Cargando base de datos...");
                    break;
                    case 3:
                    JOptionPane.showMessageDialog(null, "Editando credenciales...");
                    break;
                    case 4:
                    opcion = 4;
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            }while(opcion != 4);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos!");
        }
        
    }
    public String getUsuario(){
        return this.usuario;
    }
    public String getContrasena(){
        return this.contrasena;
    }
}
