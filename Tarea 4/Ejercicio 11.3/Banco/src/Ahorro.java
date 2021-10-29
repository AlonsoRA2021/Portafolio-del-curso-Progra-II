public class Ahorro extends Cuenta{
    double interes = 0.2;

    public Ahorro(int numero, String nombre, double interes){
        super(numero, nombre);
        this.interes = interes;
    }

    public void calcularInteres(){
    
    }
}
