package Servicios;

import javax.swing.JOptionPane;

import Interfaces.Visible;

public class MenuPrincipal implements Visible{

    @Override
    public void verMenu(){
        byte opcion = 0;

        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                "MENU PRINCIPAL"
            ));
            switch(opcion){
                case 1:
                JOptionPane.showMessageDialog(null, "Opción 1");
                break;
                case 2:
                JOptionPane.showMessageDialog(null, "Opción 2");
                break;
                case 3:
                JOptionPane.showMessageDialog(null, "Opción 3");
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
