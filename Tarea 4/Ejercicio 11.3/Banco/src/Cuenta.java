import javax.swing.JOptionPane;

public class Cuenta {
    private int numero;
    public String nombre;
    public int balance;
    public int monto;

    public Cuenta(int numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }
    public void retirar(){
        monto = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a retirar: "));
        balance -= monto;
    }
    public void depositar(){
        monto = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a depositar: "));
        balance += monto;
    }
    public void mostrarBalance(){
        JOptionPane.showMessageDialog(null, "Su balnce es: " + balance);
    }
    public int getNumero(){
        return numero;
    }
}
