package Servicios;

import javax.swing.JOptionPane;
import Entidades.Division;
import Entidades.Multiplicacion;
import Entidades.Resta;
import Entidades.Suma;
import Enums.Tipos;
import Interfaces.Visible;

public class Calculador implements Visible{

    @Override
    public void verMenu(){
        try{
            byte opcion = 0;
            double valorUno = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer valor numérico:"));
            double valorDos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo valor numérico:"));

            Suma miSuma = new Suma(valorUno, valorDos, Tipos.SUMA);
            Resta miResta = new Resta(valorUno, valorDos, Tipos.RESTA);
            Multiplicacion miMultiplicacion = new Multiplicacion(valorUno, valorDos, Tipos.MULTIPLICACION);
            Division miDivision = new Division(valorUno, valorDos, Tipos.DIVISION);

            do{
                opcion=Byte.parseByte(JOptionPane.showInputDialog(
                    "QUE OPERACION DESEA REALIZAR\n"+
                    "1. Suma  ( + )          \n"+
                    "2. Resta  ( - )         \n"+
                    "3. Multiplicación  ( x )\n"+
                    "4. División  ( ÷ )      \n"+
                    "5. --salir--            \n"+
                    "DIGITE UNA OPCIÓN:        "));
                switch(opcion){
                    case 1:
                    JOptionPane.showMessageDialog(null, "La "+miSuma.getTipo()+" es:  "+(miSuma.numeroUno+miSuma.numeroDos));
                    break;
                    case 2:
                    JOptionPane.showMessageDialog(null, "La "+miResta.getTipo()+" es:  "+(miResta.numeroUno-miResta.numeroDos));
                    break;
                    case 3:
                    JOptionPane.showMessageDialog(null, "La "+miMultiplicacion.getTipo()+" es:  "+(miMultiplicacion.numeroUno*miMultiplicacion.numeroDos));
                    break;
                    case 4:
                    JOptionPane.showMessageDialog(null, "La "+miDivision.getTipo()+" es:  "+(miDivision.numeroUno/miDivision.numeroDos));
                    break;
                    case 5:
                    opcion = 5;
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "La opción ingresada no es válida!");
                }
            }while(opcion !=5);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Se debe ingresar un valor de tipo numérico {1,2,3...}");
            verMenu();
        }
    }
    
}