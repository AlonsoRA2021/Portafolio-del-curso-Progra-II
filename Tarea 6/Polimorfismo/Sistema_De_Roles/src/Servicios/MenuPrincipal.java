package Servicios;

import javax.swing.JOptionPane;

import Entidades.Admin;
import Entidades.Cajero;
import Entidades.Cliente;
import Interfaces.Visible;
import Enums.Roles;

public class MenuPrincipal implements Visible{
    Cliente nuevoCliente = new Cliente(123, "Carlos", " Leiva", "CLIENTE", "San Jose", "Nuevo");
    Cajero nuevoCajero = new Cajero(456, "Luis", " Artavia", "CAJERO", "Nocturno");
    Admin nuevoAdmin = new Admin(789, " Alonso", " Ramírez", "ADMIN", "alonso2021", "12345");

    @Override
    public void verMenu(){
        byte opcion = 0;

        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                "MENU PRINCIPAL  \n"+
                "1. Cliente      \n"+
                "2. Cajero       \n"+
                "3. Admin        \n"+
                "4. --salir--    \n"+
                "DIGITE UNA OPCION:"));

            switch(opcion){
                case 1:
                if(nuevoCliente.rol.equals(Roles.CLIENTE.name())){
                    nuevoCliente.verMenu();
                }
                break;
                case 2:
                if(nuevoCajero.rol.equals(Roles.CAJERO.name())){
                    nuevoCajero.verMenu();
                }
                break;
                case 3:
                if(nuevoAdmin.rol.equals(Roles.ADMIN.name())){
                    nuevoAdmin.verMenu();
                }
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
