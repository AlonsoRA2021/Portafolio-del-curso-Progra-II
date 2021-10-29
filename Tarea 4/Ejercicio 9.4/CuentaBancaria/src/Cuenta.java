import java.util.Scanner;

public class Cuenta {
    String tipo;
    int id;
    int balance = 0;
    int monto;
    int aumenta;
    int disminuye;
    int acumulador = 0;

    public void leerMonto(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el monto: ");
        monto=(int)entrada.nextInt();
    }
    public void sumar(){
        aumenta = monto + balance;
        acumulador = acumulador + aumenta;
    }
    public void restar(){
        disminuye = monto - balance;
        acumulador = acumulador - disminuye;
    }
    public void mostrarEstado(){
        if(acumulador >= 0){
            System.out.println("\tSu balance es: " + acumulador + " colones");
        }else{
            System.out.println("\tSu balance es: " + acumulador + " colones\n"
                            +"\tSU ESTADO DE CUENTA ES NEGATIVO!");

        }
    }
    
}
