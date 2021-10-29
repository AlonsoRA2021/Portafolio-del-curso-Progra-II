public class App {
    public static void main(String[] args) throws Exception {
       Cuenta cuenta = new Cuenta(102021, "Alonso");
       Ahorro ahorro = new Ahorro(554, "s", 2);
       cuenta.depositar();
       cuenta.retirar();
       cuenta.mostrarBalance();
       ahorro.calcularInteres();
       cuenta.mostrarBalance();
       
    }
}
