package Entidades;

import javax.swing.JOptionPane;
import Interfaces.Visible;

public class Cliente extends Persona implements Visible{
    public String provincia;
    public String estado;
    public Cliente(int id, String nombre, String apellido, String rol, String provincia, String estado){
        super(rol);
        this.getId();
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.estado = estado;
    }

    @Override
    public void verMenu(){
        byte opcion = 0;
        
        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                "<Hola "+nombre+apellido+">\n"+
                "MENU CLIENTE              \n"+
                "1. Ver productos          \n"+
                "2. Seleccionar producto   \n"+
                "3. Carrito de compras     \n"+
                "4. --regresar--           \n"+
                "DIGITE UNA OPCION:          "));

            switch(opcion){
                case 1:
                JOptionPane.showMessageDialog(null, "Listado de productos...");
                break;
                case 2:
                JOptionPane.showMessageDialog(null, "Seleccionando productos...");
                break;
                case 3:
                JOptionPane.showMessageDialog(null, "Mostrando carrito...");
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
