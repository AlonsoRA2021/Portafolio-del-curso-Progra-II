import java.util.Scanner;

public class Interfaz {
    boolean bandera = true;
    short menu;
    Cuenta cuentaUno = new Cuenta();

    public void mostrarMenu(){
        do{
            System.out.println("");
            cuentaUno.mostrarEstado();
            System.out.print("\tQue desea realizar\n"
                            + "\t  1. DEPOSITO\n"
                            + "\t  2. RETIRO\n"
                            + "\t  3. SALIR\n"
                       + "\tIngrese un valor: ");
            Scanner valor = new Scanner(System.in);
            menu=(short)valor.nextInt();
            switch(menu){
                case 1:
                    cuentaUno.leerMonto();
                    cuentaUno.sumar();
                    break;
                case 2: 
                    cuentaUno.leerMonto();
                    cuentaUno.restar();
                    break;
                case 3:
                    bandera=false;
                    System.exit(0);
                    break;
            }
        }while(bandera==true);
    }
}
