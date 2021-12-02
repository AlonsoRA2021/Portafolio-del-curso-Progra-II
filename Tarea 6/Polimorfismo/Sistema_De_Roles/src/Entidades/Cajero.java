package Entidades;

import javax.swing.JOptionPane;

import Interfaces.Visible;

public class Cajero extends Persona implements Visible{
    public String turno;
    public Cajero(int id, String nombre, String apellido, String rol, String turno){
        super(rol);
        this.getId();
        this.nombre = nombre;
        this.apellido = apellido;
        this.turno = turno;
    }
    @Override
    public void verMenu(){
        byte opcion = 0;
        
        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                "<Hola "+nombre+apellido+">\n"+
                "T: "+turno+              "\n"+
                "MENU CAJERO               \n"+
                "1. Registrar cliente      \n"+
                "2. Modificar compra       \n"+
                "3. Facturar compra        \n"+
                "4. --regresar--           \n"+
                "DIGITE UNA OPCION:          "));

            switch(opcion){
                case 1:
                JOptionPane.showMessageDialog(null, "Registrando cliente...");
                break;
                case 2:
                JOptionPane.showMessageDialog(null, "Modificando compra...");
                break;
                case 3:
                JOptionPane.showMessageDialog(null, "Facturando compra...");
                break;
                case 4:
                opcion = 4;
                break;
                default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }while(opcion != 4);
    }
}
